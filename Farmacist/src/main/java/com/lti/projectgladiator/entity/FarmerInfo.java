package com.lti.projectgladiator.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.lti.projectgladiator.dto.FarmerDTO;

@Entity
@Table(name="FS_FARMER_REG")
public class FarmerInfo {
	
	//farmer details
	@Id
	@GeneratedValue
	@Column(name="f_id")
	private int fid;
	
	@Column(name="f_email")
	private String femail;
	@Column(name = "f_name")
	private String fname;
	@Column(name="f_contact")
	private long fcontact;
	@Column(name="f_address")
	private String faddress;
	@Column(name="f_city")
	private String fcity;
	@Column(name="f_state")
	private String fstate;
	@Column(name="f_pin")
	private int fpin;
	
	
	//land details
	@Column(name="f_area")
	private String farea;
	@Column(name="f_area_address")
	private String fareaAddress;
	@Column(name="f_area_pincode")
	private int fareaPincode;
	
	//bank details
	@Column(name="f_account_no")
	private long faccountNo;
	@Column(name="f_ifsc")
	private String fifsc;
	
	
	//document upload
	@Column(name="f_aadhar")
	private String faadhar;
	@Column(name="f_pan")
	private String fpan;
	@Column(name="f_certificate")
	private String fcertificate;
	
	//login
	@Column(name="f_password")
	private String fpassword;
	
	//Relationship
	/*
	@OneToMany
	private List<SetBid> setBid;*/
	
	/*public FarmerInfo(FarmerDTO farmerDTO,String fileNameAadhar,String fileNamePan,String fileNameCert) {
		
		this.fname = farmerDTO.getFname();
		this.fcontact = farmerDTO.getFcontact();
		this.femail = farmerDTO.getFemail();
		this.faddress = farmerDTO.getFaddress();
		this.fcity = farmerDTO.getFcity();
		this.fstate = farmerDTO.getFstate();
		this.fpin = farmerDTO.getFpin();
		this.farea = farmerDTO.getFarea();
		this.fareaAddress = farmerDTO.getFareaAddress();
		this.fareaPincode = farmerDTO.getFareaPincode();
		this.faccountNo = farmerDTO.getFaccountNo();
		this.fifsc = farmerDTO.getFifsc();
		this.faadhar = fileNameAadhar;
		this.fpan = fileNamePan;
		this.fcertificate = fileNameCert;
		this.fpassword = farmerDTO.getFpassword();
		
	}*/

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

	public void setFcertificate(String fcertificate) {
		this.fcertificate = fcertificate;
	}

	public String getFpassword() {
		return fpassword;
	}

	public void setFpassword(String fpassword) {
		this.fpassword = fpassword;
	}

	/*public List<SetBid> getSetBid() {
		return setBid;
	}

	public void setSetBid(List<SetBid> setBid) {
		this.setBid = setBid;
	}
	*/
	
	

}
