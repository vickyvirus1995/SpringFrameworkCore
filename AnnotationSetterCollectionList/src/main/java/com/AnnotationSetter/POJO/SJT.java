package com.AnnotationSetter.POJO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SJT {
	
	@Value("SJT")
	private String name;
	@Value("12")
	private int no_of_students;
	
	@Autowired
	private List<String> courses;
	@Autowired
	private Address address;
	
	
	

	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public int getNo_of_students() {
		return no_of_students;
	}




	public void setNo_of_students(int no_of_students) {
		this.no_of_students = no_of_students;
	}




	public List<String> getCourses() {
		return courses;
	}




	public void setCourses(List<String> courses) {
		this.courses = courses;
	}




	public Address getAddress() {
		return address;
	}




	public void setAddress(Address address) {
		this.address = address;
	}




	@Override
	public String toString() {
		return "SJT [name=" + name + ", no_of_students=" + no_of_students + ", courses=" + courses + ", address="
				+ address + "]";
	}
	
	
	
	
}
