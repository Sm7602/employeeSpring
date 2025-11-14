package com.spring.employee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.spring.employee.entity.Address;
import com.spring.employee.entity.Employee2;

public class Main5_look_up {
	public static void main(String[]arg) {
		
		ApplicationContext factory = new ClassPathXmlApplicationContext("look_up.xml");
		Employee2 obj = (Employee2) factory.getBean("empA");
		System.out.println(obj);
		
		obj.setAddress(obj.applyAddress());
		System.out.println(obj);
		Address a1 = obj.applyAddress();
		System.out.println(a1);
		
		
		Address a2 = obj.applyAddress();
		System.out.println(a2);
		a2.setCity("Noida");
		System.out.println(a2);

	}

}
