package org.hyuna.ch05.sec05;

public class SubStringExample {
	public static void main(String[] args) {
		// <문자열 잘라내기>
		// 문자열에서 특정 위치의 문자열을 잘라내어 가져오고 싶다면 substring() 메소드를 사용한다.
		/*
		substring(int beginIndex) -> beginIndex에서 끝까지 잘라내기
		substring(int beginIndex, int endIndex) -> beginIndex에서 endIndex 앞까지 잘라내기
		*/
		
		String ssn = "880815-1234567";
		
		String firstNum = ssn.substring(0, 6);
		System.out.println(firstNum);
		
		String secondNum = ssn.substring(7);
		System.out.println(secondNum);
		
				
	}

}
