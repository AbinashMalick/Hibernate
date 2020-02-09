package com.hibernate.entities;

import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.sun.xml.bind.v2.model.runtime.RuntimeReferencePropertyInfo;

public class Main {

	public static void main(String[] args) {
				
		/*Student_Details studentDetails = new Student_Details();
		studentDetails.setMobileNo(909048636);*/
		//studentDetails.setStudent_Info(student);
	/*	
		Address address = new Address();
		address.setAddressLine1("Nayabazar");
		address.setState("Odisha");
		address.setZip(753004);
		
		Student_Info student = new Student_Info();
		student.setName("asutosh");
		student.setBirthDate(new Date());
		//student.setStudentDetails(studentDetails);
		student.setAddress(address);
		
		Student_Info student1 = new Student_Info();
		student1.setName("Abinash");
		student1.setBirthDate(new Date());
		student1.setAddress(address);*/
		
		/*OneToMany address can have multiple students
		 * Address address = new Address();
		address.setAddressLine1("Nayabazar");
		address.setState("Odisha");
		address.setZip(753004);
		
		Student student = new Student();
		student.setName("asutosh");
		student.setBirthDate(new Date());
		//student.setStudentDetails(studentDetails);
		student.setAddress(address);
		
		Student student1 = new Student();
		student1.setName("Abinash");
		student1.setBirthDate(new Date());
		student1.setAddress(address);
		
		address.getStudentInfo().add(student);
		address.getStudentInfo().add(student1);*/
		
		
		/*
		 * Student student1 = new Student(); student1.setName("Abinash");
		 * student1.setBirthDate(new Date());
		 * 
		 * Student student = new Student(); student.setName("Asutosh");
		 * student.setBirthDate(new Date());
		 * 
		 * Certification cert = new Certification();
		 * cert.setCertificatonName("Java certification");
		 * 
		 * Certification cert1 = new Certification();
		 * cert1.setCertificatonName("Oracle certification");
		 * 
		 * cert.getStudent().add(student1); cert.getStudent().add(student);
		 * 
		 * cert1.getStudent().add(student1); cert1.getStudent().add(student);
		 */
		
		
		Configuration conf = new Configuration().configure();
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure().build();
		SessionFactory sf = conf.buildSessionFactory(ssr);
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
	
		
		/* session.save(cert); session.save(cert1); tx.commit(); */
		 
		Query query = session.createQuery("from Student");
		List<Student> student = query.list();
		for(Student s : student) {
			System.out.println(s);
		}
		
		
		  query = session.createQuery("from Student where rollNo=2");
		  
		  Student student1 = (Student)query.uniqueResult();
		  System.out.println(student1.getName());
		  System.out.println(student1.getRollNo());
		  System.out.println(student1.getBirthDate());
		 
		  tx.commit();
		 
		
	}
}
