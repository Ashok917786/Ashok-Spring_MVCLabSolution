package com.greatlearning.student.services;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.greatlearning.student.models.Student;

public class StudentServiceImpl implements StudentService {
	
	private SessionFactory sessionFactory;
	private Session session;
	
	public StudentServiceImpl(SessionFactory sessionFactory){
		this.sessionFactory=sessionFactory;
		this.session=sessionFactory.getCurrentSession();
	}

	@Override
	public List<Student> findAll() {
		
	List<Student> student = session.createQuery("from Students").list();	
		return student;
	}

	@Override
	public Student findById(int theId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Student thestudent) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(int theId) {
		// TODO Auto-generated method stub
		
	}

}