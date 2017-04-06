package com.spring.constructor;

public class BaseClass {
	private DependentClass1 dependentClass1;

	public BaseClass(DependentClass1 dependentClass1) {
		this.dependentClass1 = dependentClass1;
	}
	
	public DependentClass1 getDependentClass1() {
		return dependentClass1;
	}

}
