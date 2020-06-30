package com.demo.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.demo.model.Address;
import com.demo.model.Trainee;

public class OneToOneMain {

	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure();
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties());
		SessionFactory factory=configuration.buildSessionFactory(builder.build());
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		
//		Address a1=new Address("pqr street", "Chennai", 600002);
//		Address a2=new Address("OMR street", "Chennai", 600097);
//		Trainee t1=new Trainee("Ramya", 9234567890l, 23, "F", a1);
//		Trainee t2=new Trainee("Soumya", 8234567890l, 28, "F", a2);
//		
//		session.save(a2);
//		session.save(a1);
//		session.save(t1);
//		session.save(t2);
		
		List<Trainee> traineeList=session.createQuery(" from com.demo.model.Trainee").list();
		for(Trainee t:traineeList) {
			System.out.println(t.getName());
			if(t.getName().startsWith("R")) {
				System.out.println("Printing address for "+t.getName());
				System.out.println(t.getAddress());
			}
		}

		
		transaction.commit();
		session.close();
		factory.close();

	}

}
