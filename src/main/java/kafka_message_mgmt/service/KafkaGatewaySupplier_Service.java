package kafka_message_mgmt.service;

import java.util.concurrent.CopyOnWriteArrayList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import kafka_message_mgmt.model.IOTAssetCommand;
import kafka_message_mgmt.model.IOTSensorSupplier_Repo;

@Service("kafkaGatewaySupplierServ")
public class KafkaGatewaySupplier_Service 
{
	private static final Logger logger = LoggerFactory.getLogger(KafkaGatewaySupplier_Service.class);

	@Autowired
	private IOTSensorSupplier_Repo iotSensorSupplierRepo;

	@Autowired
	private KafkaIGatewaySupplierProcess_Service kafkaGatewaySupplierProcessServ;

	@Scheduled(fixedRate = 3000)
	public void createMessage() {
		CopyOnWriteArrayList<IOTAssetCommand> iotAssetCommands = iotSensorSupplierRepo.getCommandsNotDone();

		if (iotAssetCommands != null && iotAssetCommands.size() > 0) {
			logger.info("running for size :" + iotAssetCommands.size());

			for (int i = 0; i < iotAssetCommands.size(); i++) {
				kafkaGatewaySupplierProcessServ.createGatewayMessage(iotAssetCommands.get(i));
				iotSensorSupplierRepo.setDoneFlag(iotAssetCommands.get(i).getCommandSeqNo());
			}
		}
		return;

	}

}