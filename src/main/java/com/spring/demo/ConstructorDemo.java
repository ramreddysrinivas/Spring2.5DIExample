package com.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.constructor.BaseClass;
import com.spring.constructor.DependentClass1;

public class ConstructorDemo {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("constructor-beans.xml");
		BaseClass baseclassobj = (BaseClass) context.getBean("baseClass");
		System.out.println("baseclassobj = " + baseclassobj);
		DependentClass1 dependentClass1 = baseclassobj.getDependentClass1();
		System.out.println("dependentClass using getter = " + dependentClass1);
		DependentClass1 dependentClass1obj = (DependentClass1) context.getBean("dependentClass");
		System.out.println("dependentClass1obj = " + dependentClass1obj);
	}

}
