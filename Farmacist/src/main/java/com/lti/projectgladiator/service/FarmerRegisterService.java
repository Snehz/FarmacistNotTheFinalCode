package com.lti.projectgladiator.service;



import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.projectgladiator.dao.FarmerRegisterDao;
import com.lti.projectgladiator.dto.FarmerDTO;
import com.lti.projectgladiator.dto.StatusDTO;
import com.lti.projectgladiator.entity.FarmerInfo;


@Service
public class FarmerRegisterService {
	
	@Autowired
	private FarmerRegisterDao farmerRegisterDao;
	
	//@Transactional
	public StatusDTO register(FarmerDTO farmerDTO){
		//copying data from user to entity
		
		System.out.println("Service");
		
		/*
		 * String path1="d:/uploads/Farmacist/Aadhar/"; String
		 * fileName1=farmerDTO.getFname()+"_"+farmerDTO.getFaadhar().getOriginalFilename
		 * (); String finalPath1=path1+fileName1;
		 * 
		 * String path2="d:/uploads/Farmacist/Pan/"; String
		 * fileName2=farmerDTO.getFname()+"_"+farmerDTO.getFpan().getOriginalFilename();
		 * String finalPath2=path2+fileName2;
		 * 
		 * String path3="d:/uploads/Farmacist/Certificate/"; String
		 * fileName3=farmerDTO.getFname()+"_"+farmerDTO.getFcertificate().
		 * getOriginalFilename(); String finalPath3=path3+fileName3;
		 * 
		 * 
		 * try { farmerDTO.getFaadhar().transferTo(new File(finalPath1));
		 * farmerDTO.getFpan().transferTo(new File(finalPath2));
		 * farmerDTO.getFcertificate().transferTo(new File(finalPath3));
		 * 
		 * }catch(IOException e) { e.printStackTrace(); }
		 */
		
		
		FarmerInfo farmer=new FarmerInfo();
		farmer.setFname(farmerDTO.getFname());
		farmer.setFcontact(farmerDTO.getFcontact());
		farmer.setFemail(farmerDTO.getFemail());
		farmer.setFaddress(farmerDTO.getFaddress());
		farmer.setFcity(farmerDTO.getFcity());
		farmer.setFstate(farmer.getFstate());
		farmer.setFpin(farmerDTO.getFpin());
		farmer.setFarea(farmerDTO.getFarea());
		farmer.setFareaAddress(farmerDTO.getFareaAddress());
		farmer.setFareaPincode(farmerDTO.getFareaPincode());
		farmer.setFaccountNo(farmerDTO.getFaccountNo());
		farmer.setFifsc(farmerDTO.getFifsc());
		//farmer.setFaadhar(fileName1);
		//farmer.setFpan(fileName2);
		//farmer.setFcertificate(fileName3);
		farmer.setFpassword(farmerDTO.getFpassword());
		
		
		
		
		
		int id = farmerRegisterDao.save(farmer);
		
		StatusDTO status=new StatusDTO();
		
		status.setId(id);
		status.setMessage("Registered Successfully");
		
		return status;
		
	}

}
