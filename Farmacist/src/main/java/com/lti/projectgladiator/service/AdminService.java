package com.lti.projectgladiator.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.lti.projectgladiator.dao.AdminDao;
import com.lti.projectgladiator.entity.AdminInfo;

public class AdminService {
	
	@Autowired
	private AdminDao adminDao;
	
	public AdminInfo adminValid(String email, String password) {
		AdminInfo adminInfo = adminDao.fetchByEmail(email,password);
		return adminInfo;
	}

}
