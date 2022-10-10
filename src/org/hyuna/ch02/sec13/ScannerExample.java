package org.hyuna.ch02.sec13;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		// 키보드 입력 데이터를 변수에 저장, 파싱(문자열을 기본타입 정수로 변환) 사용
		Scanner sc = new Scanner(System.in);
		
		System.out.println("x값 입력 : ");
		String strX = sc.nextLine();
		int x = Integer.parseInt(strX);
		
		System.out.println("y값 입력 : ");
		String strY = sc.nextLine();
		int y = Integer.parseInt(strY);
		
		int result = x+y;
		System.out.println("x+y : " + result);
		System.out.println();
		
		while(true) {
			System.out.println("입력 문자열 : ");
			String data = sc.nextLine();
			if(data.equals("q")) {
				break;
			}
			System.out.println("출력 문자열 : " + data);
			System.out.println();
			System.out.println("-------------");
			
		}
		
		System.out.println("종료");

	}

}
