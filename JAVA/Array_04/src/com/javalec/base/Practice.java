package com.javalec.base;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		//James의 신장을 입력하세요!
		//Cathy의 신장을 입력하세요!
		//평균 신장은 : ___
		//가장 큰 학생은 ___ 이고 그 학생의 키는 ____
		//가장 작은 학생은 _____이고 그 학생의 키는 _____
		
		//각각 사람들의 이름이 배열로 필요
		String[] name = {"James", "Cathy", "Kenny", "Martin", "Crystal"};
		
		// 사용자로부터 신장을 입력받기
		Scanner scan = new Scanner(System.in);
//		double height = scan.nextDouble(); // 키를 받아야 하는데 키가! 배열로 저장이 되어야 함 
		
		// 사용자의 키를 받아서, 합계 구하기 (합계는 평균을 구하기 위해 필요함)
		for(int i=0; i<name.length; i++) {
			System.out.println(name[i]+ "의 신장을 입력하세요!");
			
		}
		
		
		
		
		
		
		
		
		
	}

}
