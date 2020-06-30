package com.demo.main;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.demo.model.Answers;
import com.demo.model.Question;

public class OneToManyMain {

	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure();
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties());
		SessionFactory factory=configuration.buildSessionFactory(builder.build());
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
	
//		Answers a1=new Answers("OOP is OOP", "Ravi");
//		Answers a2=new Answers("No it is OOPS", "Dave");
//		Answers a3=new Answers("OOP is Java", "Kumar");
//		
//		List<Answers> answersList=new ArrayList<>();
//		answersList.add(a1);
//		answersList.add(a2);
//		answersList.add(a3);
//		
//		Question q1=new Question("What is OOP?", answersList);
//		
//		a1.setA_qid(q1);
//		a2.setA_qid(q1);
//		a3.setA_qid(q1);
//		
//		session.save(a1);
//		session.save(a2);
//		session.save(a3);
//		session.save(q1);
		
		List<Question> questionsList=session.createQuery("from com.demo.model.Question").list();
		for(Question q:questionsList) {
			System.out.println("QNo"+q.getQid()+") "+q.getQuestion());
			System.out.println("Answers Given");
			int c=0;
			for(Answers a:q.getAnswers()) {
				System.out.println("Answer"+(++c)+")"+a.getAnswer()+"   by - "+a.getAnsweredBy());
			}
		}
		
		
		transaction.commit();
		session.close();
		factory.close();

	}

}
