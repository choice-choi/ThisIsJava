package org.hyuna.ch04.sec08;

public class ContinueExample {

	public static void main(String[] args) {
		// continue 문
		// 반복문인 for 문, while 문, do-while 문에서만 사용
		// 블록 내부에서 continue 문이 실행되면 for 문의 증감식 또는 while 문, do-while 문의 조건식으로 바로 이동
		// 반복문을 종료하지 않고 계속 반복을 수행한다는 점이 break 문과 다름
		// 대개 if 문과 같이 사용되는데, 특정 조건을 만족하는 경우에 continue 문을 실행해서 그 이후의 문장을 실행하지 않고 다음 반복으로 넘어감
		
		// 1에서 10 사이의 수 중에서 짝수만 출력하고 홀수인 경우에는 다음 반복으로 넘어가기
		for(int i=1; i<=10; i++) {
			if(i%2 != 0) {
				continue;	// 2로 나눈 나머지가 0이 아닐 경우, 즉 홀수인 경우
			}
			System.out.print(i + " ");	// 홀수는 실행되지 않는다
		}
	}

}
