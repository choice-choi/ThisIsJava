package org.hyuna.ch04.sec03;

public class SwitchExample {
	public static void main(String[] args) {
		// switch 문은 괄호 안의 변수값에 따라 해당 case로 가서 실행문을 실행시킨다.
		// 변수값과 동일한 값을 갖는 case가 없으면 default로 가서 실행문을 실행시킨다.
		// default가 필요 없다면 생략 가능하다.
		int num = (int)(Math.random()*6)+1;	// 1~6번 까지의 랜덤 숫자 뽑아내기
		
		switch(num) {
			case 1: 
				System.out.println("1번");
				break;
			case 2:
				System.out.println("2번");
				break;
			case 3:
				System.out.println("3번");
				break;
			case 4:
				System.out.println("4번");
				break;
			case 5:
				System.out.println("5번");
				break;
			default:
				System.out.println("6번");
		}

	}

}
