package com.spring.employee.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	private int id;
	private String name;
	private String gender;
	private int salary;
	@Autowired
	private Iaddress address;
	
	public Employee(int id, String name, String gender, int salary, Iaddress address) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.salary = salary;
		this.address = address;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public Iaddress getAddress() {
		return address;
	}
	@Qualifier("address2")
	public void setAddress(Iaddress address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", gender=" + gender + ", salary=" + salary + ", address="
				+ address + "]";
	}
	
}
