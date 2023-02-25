package com.met.springtest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.met.model.Employee;


public class SprinTest {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("test.xml");
		
		System.out.println("**********Post Initialization*****************");
		
		Employee emp1 = context.getBean("emp1",Employee.class);
		System.out.println("bean with id : emp1 " + emp1);
		
		Employee emp2 = context.getBean("emp2",Employee.class);
		System.out.println("bean with id : emp2 " + emp2);;
		
		System.out.println("*********Prototype Scope************");
		
		Employee emp3 = context.getBean("emp3",Employee.class);
		System.out.println("bean with id : emp3 " + emp3);
		
		System.out.println("************Parameterized constructor*********");
		
		Employee emp4 = context.getBean("emp4",Employee.class);
		System.out.println("bean with id : emp4 " + emp4);
		
		Employee emp5 = context.getBean("emp5",Employee.class);
		System.out.println("bean with id : emp5 " + emp5);
		
		Employee emp6 = context.getBean("emp6",Employee.class);
		System.out.println("bean with id : emp6 " + emp6);
	}
	
}
