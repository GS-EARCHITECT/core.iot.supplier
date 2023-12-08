package kafka_message_mgmt.model;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * The persistent class for the IOT_ASSET_COMMANDS database table.
 * 
 */
public class IOTAssetCommand implements Serializable 
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 866728795741823371L;
	private Long commandSeqNo;
	private String command;
	private Character doneflag;
	private Timestamp onDttm;
	private Character processedflag;
	private Long sensorAssetSeqNo;

	public Long getCommandSeqNo() {
		return commandSeqNo;
	}

	public void setCommandSeqNo(Long commandSeqNo) {
		this.commandSeqNo = commandSeqNo;
	}

	public String getCommand() {
		return command;
	}

	public void setCommand(String command) {
		this.command = command;
	}

	public Character getDoneflag() {
		return doneflag;
	}

	public void setDoneflag(Character doneflag) {
		this.doneflag = doneflag;
	}

	public Timestamp getOnDttm() {
		return onDttm;
	}

	public void setOnDttm(Timestamp onDttm) {
		this.onDttm = onDttm;
	}

	public Character getProcessedflag() {
		return processedflag;
	}

	public void setProcessedflag(Character processedflag) {
		this.processedflag = processedflag;
	}

	public Long getSensorAssetSeqNo() {
		return sensorAssetSeqNo;
	}

	public void setSensorAssetSeqNo(Long sensorAssetSeqNo) {
		this.sensorAssetSeqNo = sensorAssetSeqNo;
	}

	public IOTAssetCommand(Long commandSeqNo, String command, Character doneflag, Timestamp onDttm,
			Character processedflag, Long sensorAssetSeqNo) {
		super();
		this.commandSeqNo = commandSeqNo;
		this.command = command;
		this.doneflag = doneflag;
		this.onDttm = onDttm;
		this.processedflag = processedflag;
		this.sensorAssetSeqNo = sensorAssetSeqNo;
	}

	public IOTAssetCommand() {
		super();
	}

}