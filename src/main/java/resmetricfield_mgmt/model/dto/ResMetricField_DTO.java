package resmetricfield_mgmt.model.dto;

import java.io.Serializable;

public class ResMetricField_DTO implements Serializable 
{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8738007475283281453L;
	private Long fieldSeqNo;
	private String fieldname;

	public Long getFieldSeqNo() {
		return fieldSeqNo;
	}

	public void setFieldSeqNo(Long fieldSeqNo) {
		this.fieldSeqNo = fieldSeqNo;
	}

	public String getFieldname() {
		return fieldname;
	}

	public void setFieldname(String fieldname) {
		this.fieldname = fieldname;
	}

	public ResMetricField_DTO(Long fieldSeqNo, String fieldname) {
		super();
		this.fieldSeqNo = fieldSeqNo;
		this.fieldname = fieldname;
	}

	public ResMetricField_DTO() {
		super();
	}

}