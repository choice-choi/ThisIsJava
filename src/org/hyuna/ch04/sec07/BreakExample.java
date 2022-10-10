package org.hyuna.ch04.sec07;

public class BreakExample {

	public static void main(String[] args) {
		// while 문을 이용해서 주사위 번호 중 하나를 반복적으로 뽑되, 6이 나오면 while 문을 종료시킨다
		while(true) {
			int num = (int)(Math.random()*6)+1;
			System.out.println(num);
			if(num==6) {
				break;
			}
		}
		System.out.println("프로그램 종료");
	}

}
