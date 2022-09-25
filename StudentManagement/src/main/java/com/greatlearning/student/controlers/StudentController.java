package com.greatlearning.student.controlers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.greatlearning.student.models.Student;
import com.greatlearning.student.services.StudentService;
import com.greatlearning.student.services.StudentServiceImpl;

@Controller

public class StudentController {
	@Autowired
	private StudentService studentService;
	@RequestMapping("/student-list")
	public String getStudnets(){
		List<Student> students=studentService.findAll(); 
		System.out.println(students);
		return "list-student";
	}
	@RequestMapping("/delete")
	public String deleteStudnet() {
		return null;
	}
	
	@RequestMapping("/save")
	public String addStudent() {
		return null;
	}
	@RequestMapping("/update")
	public String updateStudent() {
		return null;
	}

}
