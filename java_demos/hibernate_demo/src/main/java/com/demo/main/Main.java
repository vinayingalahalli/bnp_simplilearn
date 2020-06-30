package com.demo.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.demo.model.Trainee;

public class Main {

	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure();
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties());
		SessionFactory factory=configuration.buildSessionFactory(builder.build());
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		
//		Trainee t1=new Trainee(101, "Giri");
//		session.save(t1);
//		Trainee t2=new Trainee(102, "Priya");
//		session.save(t2);
//		Trainee t3=new Trainee(103, "Payal");
//		session.save(t3);
		
//		Trainee t=(Trainee) session.get(Trainee.class, 101);
//		System.out.println(t);
	
//		Trainee t1=new Trainee(101, "Updated Name");
//		session.update(t1);
		
//		Trainee t1=new Trainee();
//		t1.setId(103);
//		
//		session.delete(t1);
		
//		Trainee t1=new Trainee("Sachin");
//		Trainee t2=new Trainee("Sachin");
//		Trainee t3=new Trainee("Sachin");
//		Trainee t4=new Trainee("Sachin");
//		Trainee t5=new Trainee("Sachin");
//		
//		session.save(t1);
//		session.save(t2);
//		session.save(t3);
//		session.save(t4);
//		session.save(t5);
		
		
		transaction.commit();
		session.close();
		factory.close();
	}

}
