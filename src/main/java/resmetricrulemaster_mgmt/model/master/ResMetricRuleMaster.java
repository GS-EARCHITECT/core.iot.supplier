package resmetricrulemaster_mgmt.model.master;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the IOT_RESRULES_MASTER database table.
 * 
 */
@Entity
@Table(name = "IOT_RESRULES_MASTER")
public class ResMetricRuleMaster implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2336904846266647516L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "RESMETRICRULE_SEQUENCE")
	@SequenceGenerator(name = "RESMETRICRULE_SEQUENCE", sequenceName = "RESMETRICRULE_SEQUENCE", allocationSize = 1)
	@Column(name = "IOT_RULE_SEQ_NO")
	private Long iotRuleSeqNo;

	@Column(name = "BETWEEN_FROM")
	private Float betweenFrom;

	@Column(name = "BETWEEN_TO")
	private Float betweenTo;

	@Column(name = "DEFAULT_PROGRAM_SEQ_NO")
	private Long defaultProgramSeqNo;

	@Column(name = "EXACT")
	private Float exact;

	@Column(name = "LESSTHAN")
	private Float lessthan;

	@Column(name = "METHOD_NAME")
	private String methodName;

	@Column(name = "MORETHAN")
	private Float morethan;

	@Column(name = "NOTBETWEEN_FROM")
	private Float notbetweenFrom;

	@Column(name = "NOTBETWEEN_TO")
	private Float notbetweenTo;

	@Column(name = "PROGRAM_PATH")
	private String programPath;

	@Column(name = "RULE")
	private String rule;

	public ResMetricRuleMaster() {
	}

	public Long getRuleSeqNo() {
		return this.iotRuleSeqNo;
	}

	public void setRuleSeqNo(Long iotRuleSeqNo) {
		this.iotRuleSeqNo = iotRuleSeqNo;
	}

	public Float getBetweenFrom() {
		return this.betweenFrom;
	}

	public void setBetweenFrom(Float betweenFrom) {
		this.betweenFrom = betweenFrom;
	}

	public Float getBetweenTo() {
		return this.betweenTo;
	}

	public void setBetweenTo(Float betweenTo) {
		this.betweenTo = betweenTo;
	}

	public Long getDefaultProgramSeqNo() {
		return this.defaultProgramSeqNo;
	}

	public void setDefaultProgramSeqNo(Long defaultProgramSeqNo) {
		this.defaultProgramSeqNo = defaultProgramSeqNo;
	}

	public Float getExact() {
		return this.exact;
	}

	public void setExact(Float exact) {
		this.exact = exact;
	}

	public Float getLessthan() {
		return this.lessthan;
	}

	public void setLessthan(Float lessthan) {
		this.lessthan = lessthan;
	}

	public String getMethodName() {
		return this.methodName;
	}

	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}

	public Float getMorethan() {
		return this.morethan;
	}

	public void setMorethan(Float morethan) {
		this.morethan = morethan;
	}

	public Float getNotbetweenFrom() {
		return this.notbetweenFrom;
	}

	public void setNotbetweenFrom(Float notbetweenFrom) {
		this.notbetweenFrom = notbetweenFrom;
	}

	public Float getNotbetweenTo() {
		return this.notbetweenTo;
	}

	public void setNotbetweenTo(Float notbetweenTo) {
		this.notbetweenTo = notbetweenTo;
	}

	public String getProgramPath() {
		return this.programPath;
	}

	public void setProgramPath(String programPath) {
		this.programPath = programPath;
	}

	public String getRule() {
		return this.rule;
	}

	public void setRule(String rule) {
		this.rule = rule;
	}

	public Long getIotRuleSeqNo() {
		return iotRuleSeqNo;
	}

	public void setIotRuleSeqNo(Long iotRuleSeqNo) {
		this.iotRuleSeqNo = iotRuleSeqNo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((iotRuleSeqNo == null) ? 0 : iotRuleSeqNo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ResMetricRuleMaster other = (ResMetricRuleMaster) obj;
		if (iotRuleSeqNo == null) {
			if (other.iotRuleSeqNo != null)
				return false;
		} else if (!iotRuleSeqNo.equals(other.iotRuleSeqNo))
			return false;
		return true;
	}

	public ResMetricRuleMaster(Long iotRuleSeqNo, Float betweenFrom, Float betweenTo, Long defaultProgramSeqNo, Float exact,
			Float lessthan, String methodName, Float morethan, Float notbetweenFrom, Float notbetweenTo,
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

}