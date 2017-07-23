package com.eternal_search.java_python_test;

import java.lang.reflect.Field;

public class Main {

	public static void main(String[] args) {
		initPython();
		callPython("print('Hello world!')\n");
		deinitPython();
	}
	
	private native static void initPython();
	
	private native static void deinitPython();
	
	private native static void callPython(String code);
	
	static {
		System.loadLibrary("pythonProxy");
	}

}
