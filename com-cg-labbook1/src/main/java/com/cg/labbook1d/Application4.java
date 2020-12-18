package com.cg.labbook1d;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Application4 {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig4.xml");
		EmployeeService obj1 = context.getBean("service",EmployeeService.class);
		System.out.println("Enter employee id : ");
		Scanner sc = new Scanner(System.in);
		int idFromUser = sc.nextInt();
		Employee4 matchEmployee =obj1.getEmployeeById(idFromUser);
		System.out.println("Employee ID : "+matchEmployee.getId()+ "\nEmployee name : "+ matchEmployee.getName()+ "\nEmployee salary : "+matchEmployee.getSalary());
      
	}

}
