package com.jh.practice3;

public class CastingPractice3 {
	public void run() {
		// 선언 및 초기화된 5개의 변수를 가지고 알맞은 사칙연산 (+. -. *, /) 과 형변환을 이용하 주석에 적힌 값과
		// 같은 값이 나오도록 코드를 작성하세요.
		
		int iNum1 = 10;
		int iNum2 = 4;
		
		float fNum = 3.0f;
		
		double dNum = 2.5;
		
		char ch = 'A';
		
		System.out.println(iNum1 / iNum2);
		System.out.println((int)dNum);
		
		System.out.println((double)iNum1);
		System.out.println((double)iNum2 * dNum);
		
		System.out.println(dNum);
		System.out.println((double)iNum1 / (double)iNum2 );
		
		System.out.println((int)fNum);
		System.out.println((int)(iNum1 / fNum));
		
		System.out.println((float)((double)iNum1 / fNum));
		System.out.println((double)iNum1 / fNum);
		
		System.out.println(ch);
		System.out.println((int)ch);
		
		System.out.println((int)(ch + iNum1));
		System.out.println((char)(ch + iNum1));
		
		
	}
}
