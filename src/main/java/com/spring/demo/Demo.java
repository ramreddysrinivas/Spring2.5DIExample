package com.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.spring.Address;
import com.spring.Customer;
import com.spring.Temp;

public class Demo {
	public static void main(String[] args) {
		ApplicationContext context =null;
		
		//loading xml using ClassPathXmlApplicationContext.
		context=new ClassPathXmlApplicationContext("spring-beans.xml");
		//if we have multiple xml files we can configured as below.
		context=new ClassPathXmlApplicationContext(new String[] {"spring-beans.xml","beans2.xml"});
		
		//loading xml using FileSystemXmlApplicationContext.
		//context=new FileSystemXmlApplicationContext("D:/core java/Spring2.5DIExample/src/main/resources/spring-beans.xml");
		
		Customer customer = (Customer) context.getBean("customer");
		Address address=(Address) context.getBean("addr");
		Temp temp =(Temp) context.getBean("temp");
		System.out.println("temp= "  +  temp);
		
		System.out.println("printing values declred in spring-beans.xml");
		System.out.println(customer.getcId() + " , " + customer.getcName() + " , " + customer.getAddress() );
		
		customer.setcId(1234);
		customer.setcName("name2");
		customer.setAddress(address);
		
		System.out.println("printing overriden values.");
		System.out.println(customer.getcId() + " , " + customer.getcName() + " , " + customer.getAddress() );
	}

}