package com.lti.projectgladiator.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.projectgladiator.entity.FarmerInfo;

@Repository
public class FarmerRegisterDao {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional
	public int save(FarmerInfo farmer) {
		System.out.println("Dao");
		FarmerInfo fInfo = entityManager.merge(farmer);
		return fInfo.getFid();
		//System.out.println("Dao");
		
		 
	}                               

}
