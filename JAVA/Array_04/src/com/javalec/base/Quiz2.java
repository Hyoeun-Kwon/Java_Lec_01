package com.javalec.base;

import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		// 몇 개의 숫자를 입력한지 결정한 후 
		//숫자를 입력하고 이중 최대값의 위치와 최대값을 구하라.
		
		// 입력할 숫자의 갯수? (100개 미만) : _5_
		// _5_개의 숫자를 입력하세요!
		//
		//
		//
		//
		//
		// 입력한 숫자 중 최대값을 15이고, 5번째 값 입니다.
		
		//숫자 입력하게 하기
		System.out.print("입력할 숫자의 갯수?  (100개 미만) :" );
		Scanner scan = new Scanner(System.in);
		int inputNum = scan.nextInt(); // 입력 받는 값을 내가 사용 할 수 있도
		int max=0;
		int[] numIndex = new int[inputNum];
		int maxIndex =0;
		
		//처리	
		System.out.println(inputNum + "개의 숫자를 입력하세요!");
		for(int i=0; i<inputNum; i++) {
			numIndex[i] = scan.nextInt();
		
			
			if(max<numIndex[i]) {
				max=numIndex[i];
				maxIndex=i;
				
			}
		}
		
		
		System.out.println("입력한 숫자 중 최대값은 "+ max + " 이고 " +(maxIndex+1) +" 번째 값 입니다.");
		
		
		
		// 도영님 하신거!
//		int max =0;
//		int maxIndex =0;
//		
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("입력할 숫자의 갯수?  (100개 미만) :" );
//		
//		int inputValue = scanner.nextInt();
//		
//		if(inputValue >= 100) {
//			while (inputValue >= 100) {
//				System.out.println("숫자가 올바르지 않습니다.");
//				inputValue = scanner.nextInt();
//			}
//		}
//		System.out.println(inputValue + "개의 숫자를 입력하세요");
//		for(int i=0; i<inputValue; i+=1) {   //배열의 값이 들어갈 경우는 0부터!
//			int value =scanner.nextInt();
//			if (max < value) {
//				max = value;
//				maxIndex=i;
//			}
//		}
//		
//		System.out.println("입력한 숫자중 최대값은 "+ max + "이고 "+ (maxIndex + 1)+ " 번재 값 입니다.");
//		
	}

}
