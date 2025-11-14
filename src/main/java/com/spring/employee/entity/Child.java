package com.spring.employee.entity;

public class Child extends Parent{
	private int age;
	private int salary;
	public Child(int age, int salary) {
		super();
		this.age = age;
		this.salary = salary;
	}
	public Child() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Child [age=" + age + ", salary=" + salary +"name ="+ getName()+"id ="+getId()+"]";
	}
	
	

}
