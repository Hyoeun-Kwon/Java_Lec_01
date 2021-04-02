package com.javalec.base;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		
		
		
		
		// 사용자로 부터 정보 입력 받아서 배열에 넣기
		
		int[] inputArray = new int[3];
		Scanner scan = new Scanner(System.in);
		int tot =0;
		double avg = 0.0;
		
		
		
		
		
		
		//입력한 정보의 합계 구하기
		System.out.println("계산할 숫자 " + inputArray.length + "개를 입력하세요.");
		for(int i=0; i<inputArray.length; i++) {
			inputArray[i]= scan.nextInt();
			tot += inputArray[i]; 
		}	
		
		
		
		//입력한 정보의 평균 구하기
		avg =(double) tot/inputArray.length;

		
		//입력한 정보 출력하기
		System.out.println("--------------");
	}

}
