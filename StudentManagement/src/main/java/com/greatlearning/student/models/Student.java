package com.greatlearning.student.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;





@Entity
@Table(name="Students")

public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="student_id")
	private int id;
	
	private String name;
	
	private String departmnet;
	
	private String country;

	public Student(int id, String name, String departmnet, String country) {
		super();
		this.name = name;
		this.departmnet = departmnet;
		this.country = country;
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartmnet() {
		return departmnet;
	}

	public void setDepartmnet(String departmnet) {
		this.departmnet = departmnet;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", departmnet=" + departmnet + ", country=" + country + "]";
	}
	

}