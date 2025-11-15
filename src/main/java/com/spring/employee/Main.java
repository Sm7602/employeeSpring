package com.spring.employee;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.employee.entity.Employee;
import com.spring.employee.repo.EmployeeDao;

public class Main {
	public static void main(String[]arg) {
		
		ApplicationContext ioc = new ClassPathXmlApplicationContext("application-context.xml");
		EmployeeDao edao = ioc.getBean("edao", EmployeeDao.class);
		
		Employee emp1 = new Employee(55, "Nakul","Male", 96000);
		edao.saveEmployee(emp1);
		
		
//    	edao.updateEmployee(emp1);
//    	System.out.println("updated successfully");
//    	edao.deleteEmployee(7);
//    	edao.deleteEmployee(9);
//
//		List<Employee> allEmp=edao.getAllEmp();
////		
//		for (Employee employee : allEmp) {
//			System.out.println(employee);
//		}
		System.out.println("Get successfully");
	}

}
