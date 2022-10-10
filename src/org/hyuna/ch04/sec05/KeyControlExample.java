package org.hyuna.ch04.sec05;

import java.util.Scanner;

public class KeyControlExample {

	public static void main(String[] args) {
		// 키보드에서 1, 2를 입력했을 때 속도를 증속, 감속시키고, 3을 입력하면 프로그램을 종료시키는 예제
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int speed = 0;
		
		while(run) {
			System.out.println("-------------------------");
			System.out.println("1. 증속 | 2. 감속 | 3. 중지");
			System.out.println("-------------------------");
			System.out.print("선택: ");
			
			String strNum = sc.nextLine();
			
			if(strNum.equals("1")) {
				speed++;
				System.out.println("현재 속도 = " + speed);
			}else if(strNum.equals("2")) {
				speed--;
				System.out.println("현재 속도 = " + speed);
			}else if(strNum.equals("3")) {	
				run = false;	// while문의 조건식을 false로 만듦
				break;	// run = false; 대신 break;로 반복문 실행 중지 가능
			}
		}
		System.out.println("프로그램 종료");

	}

}
