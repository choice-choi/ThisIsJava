package org.hyuna.ch04.sec07;

public class BreakOutterExample {

	public static void main(String[] args) {
	// break 문
	// 중첩된 반복문에서 바깥쪽 반복문까지 종료시키려면 바깥쪽 반복문에 이름(레이블)을 붙이고, 'break 이름;'을 사용
	// 바깥쪽 for 문은 'A'~'Z'까지 반복하고, 중첩된 for 문은 'a'~'z'까지 반복한다.
	// 중첩된 for 문에서 lower 변수가 'g'를 갖게 되면 바깥쪽 for 문까지 빠져나오도록 바깥쪽 for 문에 outter라는 라벨을 붙인다.
			Outter:for(char upper='A'; upper<='z'; upper++) {
				for(char lower='a'; lower<='z'; lower++) {
					System.out.println(upper + "-" + lower);
					if(lower=='g') {
						break Outter;
					}
				}
			}
			System.out.println("프로그램 실행 종료");
	}

}
