package resmetricruledetails_mgmt.model.dto;

import java.io.Serializable;

public class ResMetricRuleDetail_DTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4179681543310232933L;
	private Long resRuleLineSeqNo;
	private String customMethodName;
	private String customProgramName;
	private String fullpath;
	private Long iotRuleSeqNo;
	private Long resmeasureSeqNo;

	public ResMetricRuleDetail_DTO() {
	}

	public Long getResMetricRuleLineSeqNo() {
		return this.resRuleLineSeqNo;
	}

	public void setResMetricRuleLineSeqNo(Long resRuleLineSeqNo) {
		this.resRuleLineSeqNo = resRuleLineSeqNo;
	}

	public String getCustomMethodName() {
		return this.customMethodName;
	}

	public void setCustomMethodName(String customMethodName) {
		this.customMethodName = customMethodName;
	}

	public String getCustomProgramName() {
		return this.customProgramName;
	}

	public void setCustomProgramName(String customProgramName) {
		this.customProgramName = customProgramName;
	}

	public String getFullpath() {
		return this.fullpath;
	}

	public void setFullpath(String fullpath) {
		this.fullpath = fullpath;
	}

	public Long getRuleSeqNo() {
		return this.iotRuleSeqNo;
	}

	public void setRuleSeqNo(Long iotRuleSeqNo) {
		this.iotRuleSeqNo = iotRuleSeqNo;
	}

	public Long getResmeasureSeqNo() {
		return this.resmeasureSeqNo;
	}

	public void setResmeasureSeqNo(Long resmeasureSeqNo) {
		this.resmeasureSeqNo = resmeasureSeqNo;
	}

	public ResMetricRuleDetail_DTO(Long resRuleLineSeqNo, String customMethodName, String customProgramName, String fullpath,
			Long iotRuleSeqNo, Long resmeasureSeqNo) {
		super();
		this.resRuleLineSeqNo = resRuleLineSeqNo;
		this.customMethodName = customMethodName;
		this.customProgramName = customProgramName;
		this.fullpath = fullpath;
		this.iotRuleSeqNo = iotRuleSeqNo;
		this.resmeasureSeqNo = resmeasureSeqNo;
	}

}