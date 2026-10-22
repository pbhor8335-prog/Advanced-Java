package com.aadiandjava.deo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.aadiandjava.entity.Student;
import com.aadiandjava.util.HibernateUtil;

public class StudentDeo {
	
	public String saveStudent(Student student)
	{
		try {
			
			SessionFactory sf = HibernateUtil.getSessionFactory();
			
			Session session = sf.openSession();
			
			Transaction tr = session.beginTransaction();
			
			session.persist(student);
			
			tr.commit();
			
		}catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
		
		return "Save Student";
	}
	
	public Student getById(int id)
	{
		try {
			
//			Session sf = HibernateUtil.getSessionFactory().openSession();
//			Student student = sf.get(Student.class, id);
//			
//			return student;
			
			Session session = HibernateUtil.getSessionFactory().openSession();
			
			Student student = session.get(Student.class, id);
			
			return student;
			
			
		}catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}
	
	public List<Student> getAllStudent()
	{
		try {
			
			Session session = HibernateUtil.getSessionFactory().openSession();
			
			List<Student> students = session.createQuery("from Student",Student.class).getResultList();
			
			
			return students;
		}catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}
	
	public String updateStudent(int id,Student student)
	{
		try {
			
			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction tr = session.beginTransaction();
			
//			session.update(tr);
			Student dbstudent = session.get(Student.class, id);
			
//			dbstudent.setId(student.getId());
			dbstudent.setName(student.getName());
			dbstudent.setAddress(student.getAddress());
			dbstudent.setDep(student.getDep());
			dbstudent.setEmail(student.getEmail());
			dbstudent.setGender(student.getGender());
			
			session.persist(dbstudent);
			
			tr.commit();
			
			return "Student update Successfully";
			
		}catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}
	
	public String deleteStudent(int id)
	{
		try {
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		Transaction tr = session.beginTransaction();
		
		Student student = session.get(Student.class, id);
		
//		student.
		session.remove(student);
		
		tr.commit();
		
		return "Deleted";
		}catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
		
		
	
	}

	
}
