package com.example.demo;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;
@Component
@RestController
public class Customers implements Serializable{

	private String cutomer_name;
	private String course_name;
	private int customerID;
	@Autowired
	private Technologie techdetails;
	@Autowired
	public MyStudies studies_summary;
	@Autowired
	private Family MyFamily;
	
	public Family getMyFamily() {
		return MyFamily;
	}
	public void setMyFamily(Family myFamily) {
		MyFamily = myFamily;
	}
	public MyStudies getStudies_summary() {
		return studies_summary;
	}
	public void setStudies_summary(MyStudies studies_summary) {
		this.studies_summary = studies_summary;
	}
	public Technologie getTechdetails() {
		return techdetails;
	}
	public void setTechdetails(Technologie techdetails) {
		this.techdetails = techdetails;
	}
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public String getCutomer_name() {
		return cutomer_name;
	}
	public void setCutomer_name(String cutomer_name) {
		this.cutomer_name = cutomer_name;
	}
	public String getCourse_name() {
		return course_name;
	}
	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}
	
	public void display()
	{
		System.out.println("Customers object Returned successfully");
     	  techdetails.tech();
     	  studies_summary.studies();
     	  MyFamily.family();
	}
	

}
