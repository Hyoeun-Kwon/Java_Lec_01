package com.javalec.base;

import java.util.Scanner;



public class Quiz3 {

	public static void main(String[] args) {
		// 
		// 성적을 입력 받기
		String[] subject = {"Korean", "English", "Mathematics"};
		String[] Num = {"No1","No2","No3","No4"};
		Scanner scan = new Scanner(System.in);
		
		int[] scoreKorean = new int[Num.length];
		int[] scoreEnglish = new int[Num.length];
		int[] scoreMath = new int[Num.length];
		int[] totalScore = new int [Num.length];
		
		// no1부터의 성적을 반복후, korean 등 과목 반복 
		for(int i=0; i<subject.length; i++) {
		System.out.println(subject[i]+"의 성적을 입력: ");	
		
			for(int j=0; j<Num.length; j++) {
				System.out.print(Num[j]+"의 성적은 :");
			int	input = scan.nextInt();
			//과목별로 저장소에 자료 넣기
				if(i==0) {
					scoreKorean[j] = input;				
				}else if (i==1) {
					scoreEnglish[j]=input;					
				}else {
					scoreMath[j]=input;
				}
				
			totalScore[j] +=input; //합
				
								
			}
			
		}
		
		System.out.println();
		
		
		
		
		
		
		
		
		

	}

}
