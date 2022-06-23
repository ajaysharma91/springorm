package com.springorm.springorm;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springorm.springorm.dao.StudentDao;
import com.springorm.springorm.entities.Student;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
		StudentDao studentDao = ac.getBean("studentDao", StudentDao.class);
		Student student = new Student(3, "kailash Sharma", 31);
		Student student1 = new Student(4, "ramu Sharma", 21);
		Student student2 = new Student(5, "Tushar Sharma", 21);
		Student student3 = new Student(6, "Shiv Sharma", 11);

//		int result = studentDao.insert(student);
//		studentDao.insert(student1);
//		studentDao.insert(student2);
//		studentDao.insert(student3);
//		List<Student> stud = studentDao.getStudents();
//		System.out.println(stud.toString());
//
//		studentDao.deleteStudent(3);
//		List<Student> stud1 = studentDao.getStudents();
//		System.out.println(stud1.toString());
		Student student5 = new Student(4, "Shiv Sharma222", 11);
		studentDao.updateStudent(student5);
		List<Student> stud2 = studentDao.getStudents();
		System.out.println(stud2.toString());
//		System.out.println("Done " + result);
	}

}
