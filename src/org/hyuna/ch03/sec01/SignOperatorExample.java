package org.hyuna.ch03.sec01;

public class SignOperatorExample {

	public static void main(String[] args) {
		// 부호/증감 연산자
		int i = 5;
		i++;
		System.out.println("첫 번째 실행한 i값: " + i);
		++i;
		System.out.println("두 번째 실행한 i값: " + i);
		
		System.out.println("========");
		
		int x = -100;
		x = -x;
		System.out.println("x: " + x);
		
		byte b = 100;
		int y = -b;
		System.out.println("y: " + y);

	}

}
