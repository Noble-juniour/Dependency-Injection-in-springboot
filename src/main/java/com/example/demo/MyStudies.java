package com.example.demo;

import org.springframework.stereotype.Component;

@Component

public class MyStudies {
	private String projects;
	private int yearofstudy;
	private int studentid;
	
	
	public String getProjects() {
		return projects;
	}
	public void setProjects(String projects) {
		this.projects = projects;
	}
	public int getYearofstudy() {
		return yearofstudy;
	}
	public void setYearofstudy(int yearofstudy) {
		this.yearofstudy = yearofstudy;
	}
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public void studies()
	{
		System.out.println("you must study");
	}

}
