package com.onesoft.scopeOfBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class EmployeeConfig implements CommandLineRunner {
	
	@Autowired
	ApplicationContext app;
	
	public void run(String...args) {
		Employee e1 = app.getBean(Employee.class);
			System.out.println(e1.getName());
			Employee e2 = app.getBean(Employee.class);
			e2.setName("raj");
				
				System.out.println(e2.getName());
				Employee e3 = app.getBean(Employee.class);
				
				System.out.println(e3.getName());
		
	}
	
	@Bean
    @Scope("prototype")
	Employee emp() {
		return new Employee();
	}

}
