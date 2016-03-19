package com.singleton;

//Thread safe
public class SingleObject {
	private static SingleObject instance =
			new SingleObject();
	
	private SingleObject(){
	}
	
	public static SingleObject getInstance(){
		return instance;
	}
}
