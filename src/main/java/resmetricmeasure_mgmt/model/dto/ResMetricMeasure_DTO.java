package resmetricmeasure_mgmt.model.dto;

import java.io.Serializable;

public class ResMetricMeasure_DTO implements Serializable 
{
	private static final long serialVersionUID = 1L;

	private Long resmeasureSeqNo;
	private Long fieldSeqNo;
	private Long resourceSeqNo;
	private Long uomSeqNo;

	public Long getResmeasureSeqNo() {
		return resmeasureSeqNo;
	}

	public void setResmeasureSeqNo(Long resmeasureSeqNo) {
		this.resmeasureSeqNo = resmeasureSeqNo;
	}

	public Long getFieldSeqNo() {
		return fieldSeqNo;
	}

	public void setFieldSeqNo(Long fieldSeqNo) {
		this.fieldSeqNo = fieldSeqNo;
	}

	public Long getResourceSeqNo() {
		return resourceSeqNo;
	}

	public void setResourceSeqNo(Long resourceSeqNo) {
		this.resourceSeqNo = resourceSeqNo;
	}

	public Long getUomSeqNo() {
		return uomSeqNo;
	}

	public void setUomSeqNo(Long uomSeqNo) {
		this.uomSeqNo = uomSeqNo;
	}

	public ResMetricMeasure_DTO(Long resmeasureSeqNo, Long fieldSeqNo, Long resourceSeqNo, Long uomSeqNo) {
		super();
		this.resmeasureSeqNo = resmeasureSeqNo;
		this.fieldSeqNo = fieldSeqNo;
		this.resourceSeqNo = resourceSeqNo;
		this.uomSeqNo = uomSeqNo;
	}

	public ResMetricMeasure_DTO() {
		super();
	}

}