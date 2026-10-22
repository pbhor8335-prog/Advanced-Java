package com.aadiandjava.controller;

import java.util.List;

import com.aadiandjava.entity.Student;
import com.aadiandjava.service.StudentService;

public class StudentController {
	
	StudentService service=new StudentService();
	
	public String saveStudent(Student student)
	{
		return service.saveStudent(student);
	}
	
	public Student getByStudentId(int id)
	{
		return service.getByStudentId(id);
	}
	
	public List<Student> getAllStudent() {
		
		return service.getAllStudent();
	}
	
	public String updateStudent(int id,Student student)
	{
		return service.updateStudent(id, student);
	}
	
	public String deleteStudent(int id)
	{
		return service.deleteStudent(id);
	}
	

}
