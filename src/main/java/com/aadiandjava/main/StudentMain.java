package com.aadiandjava.main;

import java.util.List;

import com.aadiandjava.controller.StudentController;
import com.aadiandjava.entity.Student;

public class StudentMain {
	
	public static void main(String[] args) {
		
		StudentController controller=new StudentController();
		
//		1
//		Student s=new Student(104,"Angha Gaikwad","B.Pharm","angha@gmail.com","Sangli","female");
//		
//		
//		String msg = controller.saveStudent(s);
//		
//		System.out.println(msg);
		
		
//		2
//		try {
//		Student s = controller.getByStudentId(102);
//		s.display();
//
//		}catch(Exception e)
//		{
//			System.out.println(e.getMessage());
//		}
		
//		3
//		
//		List<Student> student = controller.getAllStudent();
//		
//		for(Student s:student)
//		{
//			s.display();
//			System.out.println("------------------------------");
//		}
		
//		.4
		
//		Student student=new Student();
//		student.setId(101);
//		student.setName("vedanti Bangar");
//		student.setAddress("Pune");
//		student.setEmail("vedanti@gmail.com");
//		student.setGender("female");
//		student.setDep("ENTC");
//		
//		String s = controller.updateStudent(101, student);
//		
//		System.out.println(s);
//		
//		
		
		
		String s = controller.deleteStudent(101);
		
		System.out.println(s);
		
//		s.setId(0);
//		System.out.println(s);
	}

}
