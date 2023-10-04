package assetsensormaster_mgmt.model.master;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the IOT_ASSETSENSOR_MASTER database table.
 * 
 */
@Embeddable
public class AssetSensorMasterPK implements Serializable {
	// default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name = "ASSET_SEQ_NO")
	private Long assetSeqNo;

	@Column(name = "SENSOR_ASSET_SEQ_NO")
	private Long sensorAssetSeqNo;

	public AssetSensorMasterPK() {
	}

	public Long getAssetSeqNo() {
		return this.assetSeqNo;
	}

	public void setAssetSeqNo(Long assetSeqNo) {
		this.assetSeqNo = assetSeqNo;
	}

	public Long getSensorAssetSeqNo() {
		return this.sensorAssetSeqNo;
	}

	public void setSensorAssetSeqNo(Long sensorAssetSeqNo) {
		this.sensorAssetSeqNo = sensorAssetSeqNo;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof AssetSensorMasterPK)) {
			return false;
		}
		AssetSensorMasterPK castOther = (AssetSensorMasterPK) other;
		return (this.assetSeqNo == castOther.assetSeqNo) && (this.sensorAssetSeqNo == castOther.sensorAssetSeqNo);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.assetSeqNo ^ (this.assetSeqNo >>> 32)));
		hash = hash * prime + ((int) (this.sensorAssetSeqNo ^ (this.sensorAssetSeqNo >>> 32)));

		return hash;
	}

	public AssetSensorMasterPK(Long assetSeqNo, Long sensorAssetSeqNo) {
		super();
		this.assetSeqNo = assetSeqNo;
		this.sensorAssetSeqNo = sensorAssetSeqNo;
	}

}