package com.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.singletonprototype.PrototypeClass;
import com.spring.singletonprototype.SingletonClass;

public class SingletonPrototypeDemo {
	public static void main(String[] args) {
		
ApplicationContext context = new ClassPathXmlApplicationContext("singletonprototype.xml");

SingletonClass singletonobj1 =(SingletonClass) context.getBean("singletonClass");
System.out.println("singletonobj1 = " +singletonobj1);
		
SingletonClass singletonobj2 =(SingletonClass) context.getBean("singletonClass");
System.out.println("singletonobj2 = " +singletonobj2);
		
PrototypeClass prototypeobj1 =(PrototypeClass) context.getBean("prototypeClass");
System.out.println("prototypeobj1 = " +prototypeobj1);
		
PrototypeClass prototypeobj2 =(PrototypeClass) context.getBean("prototypeClass");
System.out.println("prototypeobj2 = " +prototypeobj2);
		//loading xml using ClassPathXmlApplicationContext.
		
	}

}
