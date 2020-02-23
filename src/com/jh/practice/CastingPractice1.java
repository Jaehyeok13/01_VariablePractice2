package com.jh.practice;

import java.util.Scanner;

public class CastingPractice1 {
	public void run() {
		Scanner sc = new Scanner(System.in);
		// charactor 는 unicode로 변환 되어 저장 되기 때문에 
		// int 와 서로 호환이 가능 하다.
		
		System.out.print("문자 : ");
		int ch = sc.nextLine().charAt(0);
		char number = (char) ch;
		
		System.out.println(number + "unicode : " + ch);
		sc.close();
		
	}
}
