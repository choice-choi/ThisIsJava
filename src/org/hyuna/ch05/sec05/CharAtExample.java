package org.hyuna.ch05.sec05;

public class CharAtExample {
	public static void main(String[] args) {
		// <문자 추출>
		// 문자열에서 특정 위치의 문자를 얻고 싶다면 charAt() 메소드를 이용
		// charAt() 메소드는 매개값으로 주어진 인덱스의 문자를 리턴
		// 인덱스란 0에서부터 '문자열의 길이 -1'까지의 번호
		
		// 다음 예제는 주민등록번호에서 성별에 해당하는 7번째 문자를 읽고 남자 또는 여자인지를 출력한다.
		
		String ssn = "95062412330123";
		char gender = ssn.charAt(6);
		switch (gender) {
			case '1':
			case '3':
				System.out.println("남자입니다.");
				break;
			case '2':
			case '4':
				System.out.println("여자입니다.");
				break;
		}
		
	}

}
