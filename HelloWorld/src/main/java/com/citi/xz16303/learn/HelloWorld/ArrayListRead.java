package com.citi.xz16303.learn.HelloWorld;

import java.util.ArrayList;

public class ArrayListRead {
	public static void main(String[] args) {
		ArrayList<String> test = new ArrayList<String>();
		test.add("1");
		test.add(2, "3");
		test.remove(0);
		System.out.println(test);
		
	}
}
