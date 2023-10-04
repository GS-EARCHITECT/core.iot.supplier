package assetsensormaster_mgmt.model.dto;

import java.io.Serializable;

public class AssetSensorMaster_DTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6360622046675907064L;
	private Long locationSeqNo;
	private Long sensorLocationSeqNo;
	private Long assetSeqNo;
	private Long sensorAssetSeqNo;

	public Long getLocationSeqNo() {
		return locationSeqNo;
	}

	public void setLocationSeqNo(Long locationSeqNo) {
		this.locationSeqNo = locationSeqNo;
	}

	public Long getSensorLocationSeqNo() {
		return sensorLocationSeqNo;
	}

	public void setSensorLocationSeqNo(Long sensorLocationSeqNo) {
		this.sensorLocationSeqNo = sensorLocationSeqNo;
	}

	public Long getAssetSeqNo() {
		return assetSeqNo;
	}

	public void setAssetSeqNo(Long assetSeqNo) {
		this.assetSeqNo = assetSeqNo;
	}

	public Long getSensorAssetSeqNo() {
		return sensorAssetSeqNo;
	}

	public void setSensorAssetSeqNo(Long sensorAssetSeqNo) {
		this.sensorAssetSeqNo = sensorAssetSeqNo;
	}

	public AssetSensorMaster_DTO(Long locationSeqNo, Long sensorLocationSeqNo, Long assetSeqNo, Long sensorAssetSeqNo) {
		super();
		this.locationSeqNo = locationSeqNo;
		this.sensorLocationSeqNo = sensorLocationSeqNo;
		this.assetSeqNo = assetSeqNo;
		this.sensorAssetSeqNo = sensorAssetSeqNo;
	}

	public AssetSensorMaster_DTO() {
		super();
	}

}