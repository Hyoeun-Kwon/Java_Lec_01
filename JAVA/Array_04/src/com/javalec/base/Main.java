package com.javalec.base;

import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		
		//James의 신장을 입력하세요!
		//Cathy의 신장을 입력하세요!
		//평균 신장은 : ___
		//가장 큰 학생은 ___ 이고 그 학생의 키는 ____
		//가장 작은 학생은 _____이고 그 학생의 키는 _____
		

		String[] name = {"James", "Cathy", "Kenny", "Martin", "Crystal"};
		Scanner scan = new Scanner(System.in); 
		double[] height = new double[name.length];  //double로 했으면 다 더블!
		double sum = 0.0;
		String highname ="";
		String lowname ="";
		double highheight =0;
		double lowheight =500;
	
		
		//사용자 키 입력 받기
		for(int i=0; i<name.length; i++) {
			System.out.print(name[i]+"의 신장을 입력하세요!");
			height[i]=scan.nextDouble();
			sum+=height[i];
			
			if(highheight < height[i]) {
				highheight = height[i];
				highname = name[i];
			}
			if(lowheight > height[i]) {
				lowheight = height[i];
				lowname = name[i];
			}
			
		}
		 
		// 평균 신장 구하기
		System.out.println("평균신장은 :"+ sum / name.length);
		
		System.out.println("가장 큰 학생은 "+ highname + "이고 그 학생의 키는 " + highheight);
		System.out.println("가장 작은 학생은 "+ lowname + "이고 그 학생의 키는 " + lowheight);
	
		
		
		
		
		
	}

}
