package assetsensormaster_mgmt.model.master;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the IOT_ASSETSENSOR_MASTER database table.
 * 
 */
@Entity
@Table(name = "IOT_ASSETSENSOR_MASTER")
public class AssetSensorMaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private AssetSensorMasterPK id;

	@Column(name = "LOCATION_SEQ_NO")
	private Long locationSeqNo;

	@Column(name = "SENSOR_LOCATION_SEQ_NO")
	private Long sensorLocationSeqNo;

	public AssetSensorMaster() {
	}

	public AssetSensorMasterPK getId() {
		return this.id;
	}

	public void setId(AssetSensorMasterPK id) {
		this.id = id;
	}

	public Long getLocationSeqNo() {
		return this.locationSeqNo;
	}

	public void setLocationSeqNo(Long locationSeqNo) {
		this.locationSeqNo = locationSeqNo;
	}

	public Long getSensorLocationSeqNo() {
		return this.sensorLocationSeqNo;
	}

	public void setSensorLocationSeqNo(Long sensorLocationSeqNo) {
		this.sensorLocationSeqNo = sensorLocationSeqNo;
	}

	public AssetSensorMaster(AssetSensorMasterPK id, java.lang.Long locationSeqNo, java.lang.Long sensorLocationSeqNo) {
		super();
		this.id = id;
		this.locationSeqNo = locationSeqNo;
		this.sensorLocationSeqNo = sensorLocationSeqNo;
	}

}