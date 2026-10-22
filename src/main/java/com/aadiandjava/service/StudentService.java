package com.aadiandjava.service;

import java.util.List;

import com.aadiandjava.deo.StudentDeo;
import com.aadiandjava.entity.Student;
import com.aadiandjava.exception.StudentNotFoundException;

public class StudentService {
	
	StudentDeo deo=new StudentDeo();
	
	public String saveStudent(Student student)
	{
		return deo.saveStudent(student);
	}
	
	public Student getByStudentId(int id)
	{
		Student student =deo.getById(id);
		
		if(student==null)
		{
			throw new StudentNotFoundException("Student not Found With Id :"+id);
		}
		
		return student;
	}
	
	public List<Student> getAllStudent() {
		
		return deo.getAllStudent();
	}
	
	public String updateStudent(int id,Student student)
	{
		return deo.updateStudent(id, student);
	}
	
	public String deleteStudent(int id)
	{
		return deo.deleteStudent(id);
	}

}
