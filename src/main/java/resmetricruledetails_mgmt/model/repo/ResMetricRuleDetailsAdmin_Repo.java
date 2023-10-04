package resmetricruledetails_mgmt.model.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import resmetricruledetails_mgmt.model.master.ResMetricRuleDetail;

@Repository("iotResMetricRuleDetailsAdminRepo")
public interface ResMetricRuleDetailsAdmin_Repo extends JpaRepository<ResMetricRuleDetail, Long> 
{}