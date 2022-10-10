package org.hyuna.ch04.sec04;

public class MultiplicationTableExample {

	public static void main(String[] args) {
		// 중첩 for문 - 구구단을 출력하시오
		for(int m=2; m<=9; m++) {
			System.out.println("***" + m + "단***");
			for(int n=1; n<=9; n++) {
				System.out.println(m + "x" + n + "=" + (m*n));
			}
		}
		
	}

}
