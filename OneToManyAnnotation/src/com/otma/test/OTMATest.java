package com.otma.test;


import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.otma.entities.Project;
import com.otma.entities.Resource;
import com.otma.util.SessionFactoryRegistry;


public class OTMATest {

	public static void main(String[] args) {
		SessionFactory factory = null;
		Session session = null;
		Transaction tx = null;
		boolean flag = false;
		try {
			factory = SessionFactoryRegistry.getSessionFactory();
			session = factory.openSession();
			tx = session.beginTransaction();
		
			Set<Resource> resources = new HashSet<Resource>();
			
			/*Resource res = new Resource(); 
			res.setResourceName("S ravi kiran");
			res.setExperience(4);
			res.setSkills("java");
			res.setEmail("ravi@gmail.com");
			session.save(res);
			
			Resource res1 = new Resource(); 
			res1.setResourceName("R Bikram");
			res1.setExperience(5);
			res1.setSkills("Oracle");
			res1.setEmail("bikram@gmail.com");
			resources.add(res);
			resources.add(res1);
			session.save(res1);

			Project prg = new Project();
			prg.setProjectName("NRPDS");
			prg.setDuration("3 years");
			prg.setDescription("New Reform in public distribution system");
			prg.setResources(resources);
			session.save(prg);*/
			
			Resource res = (Resource)session.get(Resource.class, 1);
			System.out.println(res);
			
			flag = true;
		}finally {
			if(tx!=null) {
				if(flag) {
					tx.commit();
				}else {
					tx.rollback();
				}
				SessionFactoryRegistry.close();
			}
		}
	}
}
