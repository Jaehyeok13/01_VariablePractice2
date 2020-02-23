package com.jh.practice2;

import java.util.Scanner;

public class CastingPractice2 {
	public void run() {
		// 실수형으로 국어, 영어, 수학 세 과목의 점수를 입력 받아총점과 평균을 출력 하세요.
		// 이때 총점과 평균은 정수형으로 처리 하세요.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		double kor = sc.nextDouble();

		System.out.print("영어 : ");
		double eng = sc.nextDouble();
		
		System.out.print("수학 : ");
		double mat = sc.nextDouble();
		
		int sum = (int)(kor + eng + mat);
		int avg = (int)(sum / 3);
		
		System.out.printf("총점 : %d \n평균 : %d ", sum, avg);
		sc.close();
		
	}
}
