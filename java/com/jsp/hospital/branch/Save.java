package com.jsp.hospital.branch;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Save {
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Aniruddha");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Hospital hospital = new Hospital();
		hospital.setName("Appolo");
		hospital.setGstNo("123abc");
		
		Branch branch1 = new Branch();
		branch1.setName("abbc");
		branch1.setLocation("vashi");
		
		Branch branch2 = new Branch();
		branch2.setName("abc");
		branch2.setLocation("thane");
		
		
		branch1.setHospital(hospital);
		branch2.setHospital(hospital);
		
		entityTransaction.begin();
		entityManager.persist(hospital);
		entityManager.persist(branch1);
		entityManager.persist(branch2);
		entityTransaction.commit();
	}

}
