package resmetricmeasure_mgmt.model.repo;

import java.util.ArrayList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import resmetricmeasure_mgmt.model.master.ResMetricMeasure;

@Repository("iotResMetricMeasuresAdminRepo")
public interface ResMetricMeasuresAdmin_Repo extends JpaRepository<ResMetricMeasure, Long> 
{
	@Query(value = "select * from IOT_RESMETRIC_MEASURES b where b.RESOURCE_SEQ_NO in :resSeqNoList orderby RESOURCE_SEQ_NO", nativeQuery = true)
	public ArrayList<ResMetricMeasure> getSelectMeasuresByResources(@Param("resSeqNoList") ArrayList<Long> resSeqNoList);
	
	@Query(value = "delete from IOT_RESMETRIC_MEASURES b where b.RESOURCE_SEQ_NO in :resSeqNoList", nativeQuery = true)
	public void delSelectMeasuresByResources(@Param("resSeqNoList") ArrayList<Long> resSeqNoList);
		
}