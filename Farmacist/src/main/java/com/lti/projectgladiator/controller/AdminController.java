package com.lti.projectgladiator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.lti.projectgladiator.entity.AdminInfo;
import com.lti.projectgladiator.service.AdminService;

@Controller
public class AdminController {
	
	@Autowired
	private AdminService adminService;
	
	@RequestMapping(path="/adminLogin", method=RequestMethod.GET)
	public AdminInfo AdminValidation(@RequestParam("aemail") String aemail,@RequestParam("apassword") String apassword) {
		
		AdminInfo admin = adminService.adminValid(aemail, apassword);
		
		return admin;
		
	}

}
