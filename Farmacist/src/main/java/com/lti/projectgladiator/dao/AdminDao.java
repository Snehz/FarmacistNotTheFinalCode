package com.lti.projectgladiator.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.lti.projectgladiator.entity.AdminInfo;

public class AdminDao {
	
	@PersistenceContext
	private EntityManager entityManager;

	public AdminInfo fetchByEmail(String email, String password) {
		
		Query q = entityManager.createQuery("select ad from AdminInfo as ad where ad.email=:em and ad.password=:pwd");
		q.setParameter("em", email);
		q.setParameter("pwd", password);
		return (AdminInfo)q.getSingleResult();
		
		}
	
	

}
