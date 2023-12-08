package kafka_message_mgmt.model;

import java.util.concurrent.CopyOnWriteArrayList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Transactional(propagation=Propagation.REQUIRES_NEW, isolation = Isolation.READ_COMMITTED)
@Repository("iotSensorSupplierRepo")
public interface IOTSensorSupplier_Repo extends JpaRepository<IOTAssetCommand, Long> 
{
	@Query(value = "select * from IOT_ASSET_COMMANDS where upper(trim(doneflag)) <> 'Y' order by COMMAND_SEQ_NO", nativeQuery = true)
	CopyOnWriteArrayList<IOTAssetCommand> getCommandsNotDone();
	
	@Modifying
	@Query(value = "update IOT_ASSET_COMMANDS set doneflag = 'Y' where command_seq_no = :command_seq_no", nativeQuery = true)
	void setDoneFlag(@Param("command_seq_no") Long command_seq_no);

		
}