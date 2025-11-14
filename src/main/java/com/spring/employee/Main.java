package com.spring.employee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.spring.employee.entity.Employee;

public class Main {
	public static void main(String[]arg) {
		
		ApplicationContext ioc=new AnnotationConfigApplicationContext("com.spring.employee.entity");
		
		Employee bean=ioc.getBean("employee",Employee.class);
		
		System.out.println(bean);
	}

}
