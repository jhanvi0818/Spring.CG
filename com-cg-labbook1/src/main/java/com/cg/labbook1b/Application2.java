package com.cg.labbook1b;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.labbook1.Employee;

public class Application2 {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig2.xml");
		Employee2 obj = context.getBean("emp", Employee2.class);
		System.out.println("Employee Details");
		System.out.println("------------------------------------------------");
		System.out.println(obj.toString());
		System.out.println(obj.getSbuDetails());
		
		//((AbstractApplicationContext) context).close();

	}

}
