package com.cg.labbook1.ps3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application3 {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig3.xml");
		SBU3 sbuObj = context.getBean("sbu",SBU3.class);
		
		System.out.println(sbuObj);
		System.out.println(sbuObj.getEmployeeList());
	}

}
