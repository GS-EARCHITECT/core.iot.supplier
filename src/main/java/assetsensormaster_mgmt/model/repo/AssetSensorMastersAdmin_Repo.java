package assetsensormaster_mgmt.model.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import assetsensormaster_mgmt.model.master.AssetSensorMaster;
import assetsensormaster_mgmt.model.master.AssetSensorMasterPK;

@Repository("assetSensorMastersAdminRepo")
public interface AssetSensorMastersAdmin_Repo extends JpaRepository<AssetSensorMaster, AssetSensorMasterPK> 
{}