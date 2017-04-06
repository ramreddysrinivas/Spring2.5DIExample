package com.spring.prototypebase.singletondependent;

public class PrototypeBaseClass {

	private SingletonDependentClass singletonDependentClass;

	public void setSingletonDependentClass(SingletonDependentClass singletonDependentClass) {
		this.singletonDependentClass = singletonDependentClass;
	}

	public SingletonDependentClass getSingletonDependentClass() {
		return singletonDependentClass;
	}

}
