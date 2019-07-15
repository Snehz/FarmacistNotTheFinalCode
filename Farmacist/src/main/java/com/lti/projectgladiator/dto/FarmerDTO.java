package com.lti.projectgladiator.dto;

public class FarmerDTO {
	
	private int fid;
	private String femail;
	private String fname;
	private long fcontact;
	private String faddress;
	private String fcity;
	private String fstate;
	private int fpin;
	
	
	//land details
	private String farea;
	private String fareaAddress;
	private int fareaPincode;
	
	//bank details
	private long faccountNo;
	private String fifsc;
	
	
	//document upload
	private String faadhar;
	private String fpan;
	private String fcertificate;
	
	//login
	private String fpassword;

	public int getFid() {
		return fid;
	}

	public void setFid(int fid) {
		this.fid = fid;
	}

	public String getFemail() {
		return femail;
	}

	public void setFemail(String femail) {
		this.femail = femail;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public long getFcontact() {
		return fcontact;
	}

	public void setFcontact(long fcontact) {
		this.fcontact = fcontact;
	}

	public String getFaddress() {
		return faddress;
	}

	public void setFaddress(String faddress) {
		this.faddress = faddress;
	}

	public String getFcity() {
		return fcity;
	}

	public void setFcity(String fcity) {
		this.fcity = fcity;
	}

	public String getFstate() {
		return fstate;
	}

	public void setFstate(String fstate) {
		this.fstate = fstate;
	}

	public int getFpin() {
		return fpin;
	}

	public void setFpin(int fpin) {
		this.fpin = fpin;
	}

	public String getFarea() {
		return farea;
	}

	public void setFarea(String farea) {
		this.farea = farea;
	}

	public String getFareaAddress() {
		return fareaAddress;
	}

	public void setFareaAddress(String fareaAddress) {
		this.fareaAddress = fareaAddress;
	}

	public int getFareaPincode() {
		return fareaPincode;
	}

	public void setFareaPincode(int fareaPincode) {
		this.fareaPincode = fareaPincode;
	}

	public long getFaccountNo() {
		return faccountNo;
	}

	public void setFaccountNo(long faccountNo) {
		this.faccountNo = faccountNo;
	}

	public String getFifsc() {
		return fifsc;
	}

	public void setFifsc(String fifsc) {
		this.fifsc = fifsc;
	}

	public String getFaadhar() {
		return faadhar;
	}

	public void setFaadhar(String faadhar) {
		this.faadhar = faadhar;
	}

	public String getFpan() {
		return fpan;
	}

	public void setFpan(String fpan) {
		this.fpan = fpan;
	}

	public String getFcertificate() {
		return fcertificate;
	}

	public void setFcertificate(String fcertificate) {
		this.fcertificate = fcertificate;
	}

	public String getFpassword() {
		return fpassword;
	}

	public void setFpassword(String fpassword) {
		this.fpassword = fpassword;
	}
}
