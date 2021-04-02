package com.javalec.base;

public class Quiz {

	public static void main(String[] args) {
	 //10의 ....
	long mul = 1;
	
	for(int i=0; i<=10; i++) {
		System.out.println(10+"^ " + String.format("%2d",i) + " = " + String.format("%15d",(mul)));
		mul *=10;
	}
		
		
		
	 

	}

}
