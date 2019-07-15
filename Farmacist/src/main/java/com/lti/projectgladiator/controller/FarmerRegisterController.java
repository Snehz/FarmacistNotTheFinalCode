package com.lti.projectgladiator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lti.projectgladiator.dto.FarmerDTO;
import com.lti.projectgladiator.dto.StatusDTO;
import com.lti.projectgladiator.service.FarmerRegisterService;



@RestController
public class FarmerRegisterController {
	
	@Autowired
	private FarmerRegisterService registerService;
	
	@RequestMapping(path="/fregister",method=RequestMethod.POST, consumes = "application/json")
	//@RequestMapping(path="/fregister",method=RequestMethod.POST, consumes = "multipart/form-data")
	public StatusDTO register(@RequestBody FarmerDTO farmerDTO) {
		
		System.out.println("Controller!");
		
		
		StatusDTO status=registerService.register(farmerDTO);
		
		return status;
		//return null;
		
	}
	

}
