package com.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.prototypebase.singletondependent.PrototypeBaseClass;
import com.spring.prototypebase.singletondependent.SingletonDependentClass;

public class PrototypeSuperSingletonDependentDemo {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("singletonprototype.xml");
		
		PrototypeBaseClass baseClass1 = (PrototypeBaseClass) context.getBean("prototypeBaseClassObj");
		SingletonDependentClass dependent1 = baseClass1.getSingletonDependentClass();

		PrototypeBaseClass baseClass2 = (PrototypeBaseClass) context.getBean("prototypeBaseClassObj");
		SingletonDependentClass dependent2 = baseClass2.getSingletonDependentClass();
		
		System.out.println("baseClass1 - prototype = " + baseClass1.hashCode());
		System.out.println("baseClass2 - prototype = " + baseClass2.hashCode());
		System.out.println("dependent1 - singleton = " + dependent1.hashCode());
		System.out.println("dependent2 - singleton = " + dependent2.hashCode());
	}

}
