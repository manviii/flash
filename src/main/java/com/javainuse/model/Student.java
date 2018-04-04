package com.javainuse.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Student {
	private String studId;
	private String studName;
	private int studAge;


	public Student() {
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public int getStudAge() {
		return studAge;
	}

	public void setStudAge(int studAge) {
		this.studAge = studAge;
	}

	

	public String getStudId() {
		return studId;
	}

	public void setStudId(String studId) {
		this.studId = studId;
	}

}