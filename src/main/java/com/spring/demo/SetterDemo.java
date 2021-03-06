package com.spring.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.spring.setter.Address;
import com.spring.setter.Customer;
import com.spring.setter.Temp;

public class SetterDemo {

	public static void main(String[] args) {
		SetterDemo demo = new SetterDemo();
		demo.usingApplicationContext();
		demo.usingBeanFactory();
	}

	private void usingBeanFactory() {
		Resource resource = null;
		resource = new ClassPathResource("setter-beans.xml");

		// resource=new
		// FileSystemResource("D:/core java/Spring2.5DIExample/src/main/resources/setter-beans.xml");

		BeanFactory factory = new XmlBeanFactory(resource);

		Customer customer = (Customer) factory.getBean("customer");
		Address address = (Address) factory.getBean("addr");

		System.out.println("printing values declred in spring-beans.xml");
		System.out.println(customer.getcId() + " , " + customer.getcName()
				+ " , " + customer.getAddress());

		customer.setcId(1234);
		customer.setcName("name2");
		customer.setAddress(address);

		System.out.println("printing overriden values.");
		System.out.println(customer.getcId() + " , " + customer.getcName()
				+ " , " + customer.getAddress());
	}

	private void usingApplicationContext() {

		ApplicationContext context = null;

		// loading xml using ClassPathXmlApplicationContext.
		context = new ClassPathXmlApplicationContext("setter-beans.xml");
		// if we have multiple xml files we can configured as below.
		context = new ClassPathXmlApplicationContext(new String[] {
				"setter-beans.xml", "beans2.xml" });

		// loading xml using FileSystemXmlApplicationContext.
		// context=new
		// FileSystemXmlApplicationContext("D:/core java/Spring2.5DIExample/src/main/resources/setter-beans.xml");

		Customer customer = (Customer) context.getBean("customer");
		Address address = (Address) context.getBean("addr");
		Temp temp = (Temp) context.getBean("temp");
		System.out.println("temp= " + temp);

		System.out.println("printing values declred in setter-beans.xml");
		System.out.println(customer.getcId() + " , " + customer.getcName()
				+ " , " + customer.getAddress());

		customer.setcId(1234);
		customer.setcName("name2");
		customer.setAddress(address);

		System.out.println("printing overriden values.");
		System.out.println(customer.getcId() + " , " + customer.getcName()
				+ " , " + customer.getAddress());

	}

}
