package com.ty.MobileSim;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
public class SaveMobileAndSim {
	
	public static void main(String[] args) {
		
		Mobile mobile=new Mobile();
		mobile.setName("Samsung");
		mobile.setCost(30000);
		
		Sim sim1=new Sim();
		sim1.setProvider("Airtel");
		sim1.setType("5G");
		
		Sim sim2=new Sim();
		sim2.setProvider("Vodafon");
		sim2.setType("4G");
		
		List<Sim> sim=new ArrayList<Sim>();
		sim.add(sim1);
		sim.add(sim2);
		
		mobile.setSim(sim);
		sim1.setMobile(mobile);
		sim2.setMobile(mobile);
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.persist(mobile);
		entityManager.persist(sim1);
		entityManager.persist(sim2);
		entityTransaction.commit();
	}

}
