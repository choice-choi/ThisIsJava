package org.hyuna.ch04.sec03;

public class SwitchValueExample {

	public static void main(String[] args) {
		// switch 문으로 grade에 따라 스위치된 점수를 score 변수에 대입하는 예제이다.
		String grade = "B";
		
		int score1 = 0;
		switch(grade) {
			case "A":
				score1 = 100;
				break;
			case "B":
				int result = 100-20;
				score1 = result;
				break;
			default:
				score1 = 60;
		}
		System.out.println("score1: " + score1);
	}

}
