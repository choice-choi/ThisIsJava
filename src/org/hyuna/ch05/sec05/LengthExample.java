package org.hyuna.ch05.sec05;

public class LengthExample {
	public static void main(String[] args) {
		// <문자열 길이>
		// 문자열에서 문자의 개수를 얻고 싶다면 length() 메소드 사용
		
		/*String subject = "자바 프로그래밍";
		int length = subject.length();
		>> length의 변수에는 8이 저장된다.
		subject 객체의 문자열 길이는 공백을 포함해서 8개이기 때문이다.
		*/
		
		String ssn = "9506241230123";
		int length = ssn.length();
		if(length == 13) {
			System.out.println("주민등록번호 자릿수가 맞습니다.");
		} else {
			System.out.println("주민등록번호 자릿수가 틀립니다.");
		}

	}

}
