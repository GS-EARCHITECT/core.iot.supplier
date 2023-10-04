package resmetricrulemaster_mgmt.model.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import resmetricrulemaster_mgmt.model.master.ResMetricRuleMaster;

@Repository("iotResMetricRuleMastersAdminRepo")
public interface ResMetricRuleMastersAdmin_Repo extends JpaRepository<ResMetricRuleMaster, Long> 
{}