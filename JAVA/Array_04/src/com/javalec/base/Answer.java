package com.javalec.base;

import java.util.Scanner;

public class Answer {

	public static void main(String[] args) {
		
		String[] name = {"James", "Cathy", "Kenny", "Martin", "Crystal"};
		int[] height = new int[name.length];
		int heightSum=0;
		double heightAvg =0.0;
		int heightMax =0;   // 0보다는 다 클것이기 때문에 0을 줌
		int heightMin = 1000; // 1000보다는 다 작을 것이기 때문에 (키라서)
		int heightMaxIndex = 0;
		int heightMinIndex = 0;
		
		
		Scanner scanner = new Scanner(System.in);
		
		
		//사용자가 입력하는 신장 값 저장하기
		for(int i=0; i<name.length; i++) {
			System.out.print(name[i]+"의 신장을 입력하세요!");
			height[i]=scanner.nextInt();
		}
		
		//평균 구하기 : total 값이 잇어야 평균구할수 있음
		for(int i=0; i<name.length; i++) {
			heightSum +=height[i];
		}
			
		heightAvg = (double)heightSum / name.length;
		
		//가장 큰 신장 구하기
		for(int i=0; i<name.length; i++) {
			if(height[i] > heightMax) {
				heightMax = height[i];
				heightMaxIndex = i;
			}
		}
		
		//가장 작은 신장 구하기
		for(int i=0; i<name.length; i++) {
			if(height[i] > heightMin) {
				heightMin = height[i];
				heightMinIndex = i;
			}
		}
		
		
		
		//출력
		System.out.println("평균 신장 :" + String.format("%.2f", heightAvg));
		System.out.println("가장 큰 학생은 "+ name[heightMaxIndex]+ "이고 그 학생의 키는 "+ heightMaxIndex+ "입니다.");
		System.out.println("가장 작은 학생은 "+ name[heightMinIndex]+ "이고 그 학생의 키는 "+ heightMinIndex + "입니다.");
		
		
		// 이렇게 다 하고 반복되는거 정리
	}

}
