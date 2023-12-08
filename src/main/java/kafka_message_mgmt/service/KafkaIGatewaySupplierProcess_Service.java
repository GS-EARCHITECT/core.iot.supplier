package kafka_message_mgmt.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureCallback;
import kafka_message_mgmt.model.IOTAssetCommand;

@Service("kafkaGatewaySupplierProcessServ")
public class KafkaIGatewaySupplierProcess_Service 
{
	private static final Logger logger = LoggerFactory.getLogger(KafkaIGatewaySupplierProcess_Service.class);

	@Autowired
	private KafkaTemplate<String, IOTAssetCommand> kafkaTemplateRequest;

	@Value("${topic.name.iotcommandproducer}")
	private String topicmyProducer;

	@Async
	public synchronized void createGatewayMessage(IOTAssetCommand iotAssetCommand) 
	{
		ListenableFuture<SendResult<String, IOTAssetCommand>> future = kafkaTemplateRequest.send(topicmyProducer, iotAssetCommand);

		future.addCallback(new ListenableFutureCallback<SendResult<String, IOTAssetCommand>>() {

			@Override
			public void onSuccess(final SendResult<String, IOTAssetCommand> message) {
				logger.info("Ad No :" + message.getProducerRecord().value().getSensorAssetSeqNo());
				// logger.info("updated schedule for ruleline :" +
				// message.getProducerRecord().value().getReferenceSeqNo());
			}

			@Override
			public void onFailure(final Throwable throwable) {
				logger.error("unable to send message= ", throwable);
			}
		});
		return;
	}

}