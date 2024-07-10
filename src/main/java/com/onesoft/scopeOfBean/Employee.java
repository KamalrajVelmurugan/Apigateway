package com.onesoft.scopeOfBean;

import org.springframework.beans.factory.annotation.Value;

public class Employee {
	@Value("kamal")
	private String name;

	public String getName() {
		return name;
	}
	@Value("kamal")
	public void setName(String name) {
		this.name = name;
	}
	public Employee() {
		System.out.println("Object is Created");
	}
	
	

	
}
