package com.springorm.springorm.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.springorm.springorm.entities.Student;

public class StudentDao {
	private HibernateTemplate hibernateTemplate;

	@Transactional
	public int insert(Student student) {
		this.hibernateTemplate.save(student);
		return 1;
	}

	public Student getStudent(int id) {
		return this.hibernateTemplate.get(Student.class, id);
	}

	public List<Student> getStudents() {
		return this.hibernateTemplate.loadAll(Student.class);
	}

	@Transactional
	public void deleteStudent(int id) {
		Student stu = this.hibernateTemplate.get(Student.class, id);
		this.hibernateTemplate.delete(stu);
	}

	@Transactional
	public void updateStudent(Student student) {
		this.hibernateTemplate.update(student);
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public StudentDao(HibernateTemplate hibernateTemplate) {
		super();
		this.hibernateTemplate = hibernateTemplate;
	}

	public StudentDao() {
		// TODO Auto-generated constructor stub
	}

}
