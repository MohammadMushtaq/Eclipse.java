package com.xworkz.method.obj;

import java.lang.reflect.Method;

public class SpeakerScanner {

	public static void main(String[] args) {
	
		Speaker Speak=new Speaker();
		
		Class clazz = Speak.getClass();
		System.out.println(clazz.getName());
		System.out.println(clazz.getModifiers());
		System.out.println(clazz.getPackageName());
		System.out.println(clazz.getTypeName());
		System.out.println(clazz.getSuperclass());
		
		Method[] method = clazz.getMethods();
		System.out.println(method.length); 
		
		
		for (int i = 0; i < method.length; i++) {
			Method methods=method[i];
			System.out.println(methods);
			System.err.println(methods.getName());
		}
		String name="good";
		
		System.out.println(name.hashCode());
		
		
		
		
		
		
		
		
	}
}
