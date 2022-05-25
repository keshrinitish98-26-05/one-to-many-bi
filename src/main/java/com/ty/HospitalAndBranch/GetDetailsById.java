package com.ty.HospitalAndBranch;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetDetailsById {
	
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Hospital hospital=entityManager.find(Hospital.class, 1);
		if(hospital!=null)
		{
			System.out.println(""+hospital.getName());
			System.out.println(""+hospital.getWeb());
			List<Branch> branch=hospital.getBranch();
			
			
		}
	}

}
