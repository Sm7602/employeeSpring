package com.spring.employee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.employee.entity.Employee;

public class Main {
	public static void main(String[]arg) {
		
		ApplicationContext ioc=new ClassPathXmlApplicationContext("application-context.xml");
		
		Employee bean=ioc.getBean("e2",Employee.class);
		
		System.out.println(bean);
	}

}
