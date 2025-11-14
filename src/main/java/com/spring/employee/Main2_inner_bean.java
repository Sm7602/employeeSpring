package com.spring.employee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.employee.entity.Employee;

public class Main2_inner_bean {
	public static void main(String[]arg) {
		
		ApplicationContext ioc=new ClassPathXmlApplicationContext("Inner_bean.xml");
		
		Employee bean=ioc.getBean("e1",Employee.class);
		
		System.out.println(bean);
	}

}
