package com.met.model;

public class Employee {
	
	private static int count;
	private int id;
	private int age;
	private String name;
	private String designation;
	private double salary;
	
	public Employee() {
		id=++count;
		System.out.println("Default Employee created " +id);
	}
	

	public Employee( int age, String name) {
		
		this(); //constructor chaining
		this.age = age;
		this.name = name;
		designation="fresher";
		salary=25000;
		
		System.out.println("parameterized constructor with id : "+id);
	}


	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Employee.count = count;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", age=" + age + ", name=" + name + ", designation=" + designation + ", salary="
				+ salary + "]";
	}

	
	
	
}
