package com.greatlearning.student.controlers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.greatlearning.student.models.Student;
import com.greatlearning.student.service.StudentService;

@Controller
@RequestMapping("/students")
public class StudentController {
	@Autowired
	private StudentService studentService;

	@RequestMapping("/student-list")
	public String getStudnets(Model theModel) {
		List<Student> students = studentService.findAll();
		System.out.println(students);
		theModel.addAttribute("ListOfStudents", students);
		return "list-student";
	}

	@RequestMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {

		// create model attribute to bind form data
		Student student = new Student();

		theModel.addAttribute("Student", student);

		return "student-form";
	}

	@RequestMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("studentId") int theId, Model theModel) {

		// get the Book from the service
		Student theStudent = studentService.findById(theId);

		// set Book as a model attribute to pre-populate the form
		theModel.addAttribute("Student", theStudent);

		// send over to our form
		return "student-form";
	}

	@RequestMapping("/delete")
	public String deleteStudnet(@RequestParam("studentId") int theId) {
		studentService.deleteById(theId);
		return "redirect:/students/student-list";
	}

	@PostMapping("/save")
	public String addStudent(@RequestParam("id") int id, @RequestParam("name") String name,
			@RequestParam("country") String country, @RequestParam("department") String department) {
		System.out.println(id);
		Student theStudent;
		if (id != 0) {
			theStudent = studentService.findById(id);
			theStudent.setName(name);
			theStudent.setCountry(country);
			theStudent.setDepartment(department);
		} else
			theStudent = new Student(name, department, country);
		// save the Book
		studentService.save(theStudent);

		// use a redirect to prevent duplicate submissions
		return "redirect:/students/student-list";

	}

}