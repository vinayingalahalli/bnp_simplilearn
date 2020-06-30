package com.demo.main;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.demo.model.Trainee;

public class HqlMain {

	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure();
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties());
		SessionFactory factory=configuration.buildSessionFactory(builder.build());
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		
//		Trainee t1=new Trainee("Rajesh", 1234567890L, 22, "Bangalore", "M");
//		Trainee t2=new Trainee("Bhuvan", 2234567890L, 21, "Bangalore", "M");
//		Trainee t3=new Trainee("Radha", 9234567890L, 22, "Delhi", "F");
//		Trainee t4=new Trainee("Shiv", 8234567890L, 29, "Kailash", "M");
//		Trainee t5=new Trainee("Parvati", 9234567899L, 28, "Kailash", "F");
//		Trainee t6=new Trainee("Siri", 8834567890L, 22, "Bangalore", "F");
//		
//		session.save(t1);
//		session.save(t2);
//		session.save(t3);
//		session.save(t4);
//		session.save(t5);
//		session.save(t6);
		
		Query query=session.createQuery("from com.demo.model.Trainee where age=:age and name like :name");
		query.setInteger("age", 22);
		query.setString("name", "R%");
		List<Trainee> traineeList=query.list();
		for(Trainee t:traineeList)
		{
			System.out.println(t);
		}
		transaction.commit();
		session.close();
		factory.close();

	}

}
