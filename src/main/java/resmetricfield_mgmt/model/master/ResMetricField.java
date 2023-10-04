package resmetricfield_mgmt.model.master;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the IOT_RESMETRIC_FIELDS database table.
 * 
 */
@Entity
@Table(name = "IOT_RESMETRIC_FIELDS")
public class ResMetricField implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "RESMETRIC_FIELD_SEQUENCE")
	@SequenceGenerator(name = "RESMETRIC_FIELD_SEQUENCE", sequenceName = "RESMETRIC_FIELD_SEQUENCE", allocationSize = 1)
	@Column(name = "FIELD_SEQ_NO")
	private Long fieldSeqNo;

	@Column(name = "FIELDNAME")
	private String fieldname;

	public ResMetricField() {
	}

	public Long getFieldSeqNo() {
		return this.fieldSeqNo;
	}

	public void setFieldSeqNo(Long fieldSeqNo) {
		this.fieldSeqNo = fieldSeqNo;
	}

	public String getFieldname() {
		return this.fieldname;
	}

	public void setFieldname(String fieldname) {
		this.fieldname = fieldname;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fieldSeqNo == null) ? 0 : fieldSeqNo.hashCode());
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
		ResMetricField other = (ResMetricField) obj;
		if (fieldSeqNo == null) {
			if (other.fieldSeqNo != null)
				return false;
		} else if (!fieldSeqNo.equals(other.fieldSeqNo))
			return false;
		return true;
	}

	public ResMetricField(Long fieldSeqNo, String fieldname) {
		super();
		this.fieldSeqNo = fieldSeqNo;
		this.fieldname = fieldname;
	}

}