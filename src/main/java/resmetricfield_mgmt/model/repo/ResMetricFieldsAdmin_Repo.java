package resmetricfield_mgmt.model.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import resmetricfield_mgmt.model.master.ResMetricField;

@Repository("resmetricFieldsAdminRepo")
public interface ResMetricFieldsAdmin_Repo extends JpaRepository<ResMetricField, Long> 
{}