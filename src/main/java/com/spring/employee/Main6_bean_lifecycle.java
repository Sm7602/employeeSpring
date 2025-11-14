package com.spring.employee;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.employee.entity.Employee3;

public class Main6_bean_lifecycle {
	public static void main(String[]arg) {
		
		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("bean_life_cycle.xml"); 
    	Employee3 obj =  factory.getBean("empA",Employee3.class);
		System.out.println(obj);
		factory.registerShutdownHook();
	}

}
