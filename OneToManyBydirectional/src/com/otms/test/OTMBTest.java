package com.otms.test;



import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.otms.entities.Project;
import com.otms.entities.Resource;
import com.otms.util.SessionFactoryRegistry;

public class OTMBTest {

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
			res.setResourceName("Abinash");
			res.setExperience("3");
			res.setRole("Manager");
			
			Resource res1 = new Resource();
			res1.setResourceName("Bhagya");
			res1.setExperience("5");
			res1.setRole("Sr Manager");
			
			Resource res2 = new Resource();
			res2.setResourceName("Avina");
			res2.setExperience("4");
			res2.setRole("Associate s/w engineer");
			resources.add(res);
			resources.add(res1);
			resources.add(res2);
			
			Project project = new Project();
			project.setProjectName("Banking Application");
			project.setDescription("Automation");
			project.setDuration("1 year");
			
			project.setResources(resources);
			session.save(project);*/
			
			Project project = new Project();
			project.setProjectName("NRPD");
			project.setDescription("New reform in public distribution system");
			project.setDuration("2 year");
			
			Resource res1 = new Resource();
			res1.setResourceName("Akhtar Hussian");
			res1.setExperience("3");
			res1.setRole("Associate engineer");
			res1.setProject(project);
			session.save(res1);
			
			/*Project project = (Project)session.get(Project.class, 1);
			System.out.println(project);*/
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
