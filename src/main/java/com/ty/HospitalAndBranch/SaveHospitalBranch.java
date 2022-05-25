package com.ty.HospitalAndBranch;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveHospitalBranch {
	
	public static void main(String[] args) {
		
		Branch branch1=new Branch();
		branch1.setName("FGHJH");
		branch1.setState("Odisha");
		branch1.setPhone(987654567);
		branch1.setCountry("India");
		
		Branch branch2=new Branch();
		branch2.setName("kjhgf");
		branch2.setState("Karnataka");
		branch2.setPhone(876545);
		branch2.setCountry("India");
		
		Hospital hospital=new Hospital();
		hospital.setName("Sum");
		hospital.setWeb("www.sum.com");
		
		List<Branch> branchs=new ArrayList();
		branchs.add(branch1);
		branchs.add(branch2);
		hospital.setBranch(branchs);
		
		branch1.setHospital(hospital);
		branch2.setHospital(hospital);
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.persist(hospital);
		entityManager.persist(branch1);
		entityManager.persist(branch2);
		entityTransaction.commit();
	}

}
