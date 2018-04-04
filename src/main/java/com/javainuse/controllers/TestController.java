package com.javainuse.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.javainuse.model.Student;

@RestController
public class TestController {

	@RequestMapping(value = "/student", method = RequestMethod.GET,
			produces = { "application/json", "application/xml" })
	public Student firstPage() {

		Student stud = new Student();
		stud.setStudName("student1");
		stud.setStudAge(25);
		stud.setStudId("1");


		return stud;
	}

}