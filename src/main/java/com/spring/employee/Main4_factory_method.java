package com.spring.employee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.spring.employee.entity.DatabaseSingleton;

public class Main4_factory_method {
	public static void main(String[]arg) {
		
		ApplicationContext factory =    new ClassPathXmlApplicationContext("factory_method.xml"); 
    	DatabaseSingleton obj1 =  factory.getBean("dbSingleton",DatabaseSingleton.class);
    	DatabaseSingleton obj2 =  factory.getBean("dbSingleton",DatabaseSingleton.class);
    	DatabaseSingleton obj3 =  factory.getBean("dbSingleton",DatabaseSingleton.class);
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
	}

}
