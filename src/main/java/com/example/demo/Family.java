package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Family {
	private String name_of_the_family;
	private String typeofthefamily;
	private int family_number;
	
	
	public String getName_of_the_family() {
		return name_of_the_family;
	}
	public void setName_of_the_family(String name_of_the_family) {
		this.name_of_the_family = name_of_the_family;
	}
	public String getTypeofthefamily() {
		return typeofthefamily;
	}
	public void setTypeofthefamily(String typeofthefamily) {
		this.typeofthefamily = typeofthefamily;
	}
	public int getFamily_number() {
		return family_number;
	}
	public void setFamily_number(int family_number) {
		this.family_number = family_number;
	}
	public void family()
	{
		System.out.println("This is my family");
	}
	

}
