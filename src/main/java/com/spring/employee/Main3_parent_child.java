package com.spring.employee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.spring.employee.entity.Child;

public class Main3_parent_child {
	public static void main(String[]arg) {
		
		ApplicationContext ioc=new ClassPathXmlApplicationContext("child_parent.xml");
		
		Child bean=ioc.getBean("c1",Child.class);
		
		System.out.println(bean);
	}

}
