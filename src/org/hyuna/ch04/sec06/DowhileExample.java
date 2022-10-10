package org.hyuna.ch04.sec06;

import java.util.Scanner;

public class DowhileExample {

	public static void main(String[] args) {
		// do-while 문
		// 키보드로 입력받은 내용을 조사하여 계속 반복할 것인지를 판단
		// while() 뒤에 반드시 세미콜론(;)을 붙여야 함
		System.out.println("메세지를 입력하세요.");
		System.out.println("프로그램을 종료하려면 q를 입력하세요.");
		
		Scanner sc = new Scanner(System.in);
		String inputString;
		
		do {
			System.out.println(">>");
			inputString = sc.nextLine();
			System.out.println(inputString);
		} while(! inputString.equals("q"));
		
		System.out.println();
		System.out.println("프로그램 종료");
	}

}
