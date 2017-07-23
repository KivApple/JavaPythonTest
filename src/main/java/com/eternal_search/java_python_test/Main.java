package com.eternal_search.java_python_test;

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
		System.out.println(System.getProperty("java.library.path"));
		//System.loadLibrary("libpythonProxy");
		System.load("/home/kiv/Projects/JavaPythonTest/build/libs/pythonProxy/shared/libpythonProxy.so");
	}

}
