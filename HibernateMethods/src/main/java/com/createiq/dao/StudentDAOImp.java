package com.createiq.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.persister.entity.Queryable;

import com.createiq.model.Student;
import com.createiq.utillconnection.SessionUtil;


public class StudentDAOImp  implements StudentDAO{

	private static final String Query = null;
	public Integer save(Student student) {
		Session session=SessionUtil.getSession();
	Integer sid	=(Integer) session.save(student);
	session.beginTransaction().commit();
	SessionUtil.close(session);	
		return sid;
	}

	public void update(Student student) {
		Session session=SessionUtil.getSession();
		 session.update(student);
		session.beginTransaction().commit();
		SessionUtil.close(session);	
		
	}

	public void delateByid(Integer sid) {
		Session session=SessionUtil.getSession();
		 Student student=new Student();
		 student.setSid(sid);
		 session.delete(student);
		session.beginTransaction().commit();
		SessionUtil.close(session);	
		
	}

	public Student findById(Integer sid) {
		
		return SessionUtil.getSession().get(Student.class, sid);
	}

	public List<Student> findAll() {
 
		Session session=SessionUtil.getSession();
	//	org.hibernate.Query<Stu>
		return null;
	}
public static void main(String[] args) {
//	//insert data
//	StudentDAOImp studentDAOImp=new StudentDAOImp();
//	studentDAOImp.save(new Student(46, "murali", 5500.00));
//	studentDAOImp.save(new Student(45, "devi", 6500.00));
//	studentDAOImp.save(new Student(44, "radha", 8500.00));
//	studentDAOImp.save(new Student(43, "lakshmi", 6500.00));
//	studentDAOImp.save(new Student(42, "prasad", 9500.00));
//	studentDAOImp.save(new Student(41, "mohan", 8500.00));

	//find by id
//	StudentDAOImp studentDAOImp1=new StudentDAOImp();
//	System.out.println(studentDAOImp1.findById(46));
//	delete by id
	//StudentDAOImp studentDAOImp1=new StudentDAOImp();
 //  System.out.println(studentDAOImp1.delateByid(46));
	
}
}
