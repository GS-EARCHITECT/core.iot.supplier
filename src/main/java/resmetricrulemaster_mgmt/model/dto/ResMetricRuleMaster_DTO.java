package resmetricrulemaster_mgmt.model.dto;

import java.io.Serializable;

public class ResMetricRuleMaster_DTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6991056088129046441L;
	private Long iotRuleSeqNo;
	private Float betweenFrom;
	private Float betweenTo;
	private Long defaultProgramSeqNo;
	private Float exact;
	private Float lessthan;
	private String methodName;
	private Float morethan;
	private Float notbetweenFrom;
	private Float notbetweenTo;
	private String programPath;
	private String rule;

	public Long getIotRuleSeqNo() {
		return iotRuleSeqNo;
	}

	public void setIotRuleSeqNo(Long iotRuleSeqNo) {
		this.iotRuleSeqNo = iotRuleSeqNo;
	}

	public Float getBetweenFrom() {
		return betweenFrom;
	}

	public void setBetweenFrom(Float betweenFrom) {
		this.betweenFrom = betweenFrom;
	}

	public Float getBetweenTo() {
		return betweenTo;
	}

	public void setBetweenTo(Float betweenTo) {
		this.betweenTo = betweenTo;
	}

	public Long getDefaultProgramSeqNo() {
		return defaultProgramSeqNo;
	}

	public void setDefaultProgramSeqNo(Long defaultProgramSeqNo) {
		this.defaultProgramSeqNo = defaultProgramSeqNo;
	}

	public Float getExact() {
		return exact;
	}

	public void setExact(Float exact) {
		this.exact = exact;
	}

	public Float getLessthan() {
		return lessthan;
	}

	public void setLessthan(Float lessthan) {
		this.lessthan = lessthan;
	}

	public String getMethodName() {
		return methodName;
	}

	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}

	public Float getMorethan() {
		return morethan;
	}

	public void setMorethan(Float morethan) {
		this.morethan = morethan;
	}

	public Float getNotbetweenFrom() {
		return notbetweenFrom;
	}

	public void setNotbetweenFrom(Float notbetweenFrom) {
		this.notbetweenFrom = notbetweenFrom;
	}

	public Float getNotbetweenTo() {
		return notbetweenTo;
	}

	public void setNotbetweenTo(Float notbetweenTo) {
		this.notbetweenTo = notbetweenTo;
	}

	public String getProgramPath() {
		return programPath;
	}

	public void setProgramPath(String programPath) {
		this.programPath = programPath;
	}

	public String getRule() {
		return rule;
	}

	public void setRule(String rule) {
		this.rule = rule;
	}

	public ResMetricRuleMaster_DTO(Long iotRuleSeqNo, Float betweenFrom, Float betweenTo, Long defaultProgramSeqNo,
			Float exact, Float lessthan, String methodName, Float morethan, Float notbetweenFrom, Float notbetweenTo,
			String programPath, String rule) {
		super();
		this.iotRuleSeqNo = iotRuleSeqNo;
		this.betweenFrom = betweenFrom;
		this.betweenTo = betweenTo;
		this.defaultProgramSeqNo = defaultProgramSeqNo;
		this.exact = exact;
		this.lessthan = lessthan;
		this.methodName = methodName;
		this.morethan = morethan;
		this.notbetweenFrom = notbetweenFrom;
		this.notbetweenTo = notbetweenTo;
		this.programPath = programPath;
		this.rule = rule;
	}

	public ResMetricRuleMaster_DTO() {
		super();
	}

}