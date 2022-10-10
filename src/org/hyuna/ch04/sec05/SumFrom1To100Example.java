package org.hyuna.ch04.sec05;

public class SumFrom1To100Example {

	public static void main(String[] args) {
		// while 문으로 1부터 100까지의 합 구하기
		// while 문 내에서 계속 누적되는 값을 갖는 sum 변수는 while 문 시작 전에 미리 선언
		int sum = 0;	// 합계 변수
		
		int i = 1;		// 카운터 변수
		
		while(i<=100) {
			System.out.println(i + " ");
			sum += i;
			i++;
		}
		
		System.out.println("1~" + (i-1) + "합 : " + sum);

	}

}
