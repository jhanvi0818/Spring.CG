package com.cg.labbook1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
        Employee empObj = context.getBean("emp1",Employee.class);
        System.out.println(empObj.toString());
        
    }
}
