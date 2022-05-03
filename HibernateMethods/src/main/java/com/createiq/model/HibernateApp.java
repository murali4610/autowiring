package com.createiq.model;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

//import java.util.List;
//
//import org.hibernate.Query;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.cfg.Configuration;

public class HibernateApp {

	public static void main(String[] args) {

		Configuration configuration=new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		Session session=sessionFactory.openSession();
		Query query=session.getNamedQuery("emp1002.findByName");
		query.setParameter("sname", "mohan");
				
		List<Student>students=query.list();
		for (Student student : students) {
			System.out.println(student);
		}
//		Criteria criteria=session.createCriteria(Student.class);
//Criterion criterion=Restrictions.eq("sid", 41);
//criteria.add(criterion); 
//		List<Student>students=criteria.list();
// for (Student student : students) {
//	System.out.println(student);
//}
 session.close();
	
	}
	}


