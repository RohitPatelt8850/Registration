package com.rohit.servlet;

public class Example {
	int x;
	int y;
	Example(int a, int b){
		x=a;
		y=b;
	}
	void add() {
		System.out.println(x+y);
	}
	public static void main(String arg[]) {
		Example obj = new Example(5,6);
		obj.add();
		System.out.println(" hii rohit ");
	}
}
