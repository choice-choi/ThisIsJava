package org.hyuna.ch02.sec10;

public class PrimitiveAndStringConversionExample {

	public static void main(String[] args) {
		// 문자열을 기본 타입으로 변환
		int value1 = Integer.parseInt("10");
		System.out.println("value1: " + value1);
		
		double value2 = Double.parseDouble("3.14");
		System.out.println("value2: " + value2);

		boolean value3 = Boolean.parseBoolean("true");
		System.out.println("value: 3" + value3);
		
		System.out.println("-----------------------");
		// 기본 타입의 값을 문자열로 변경 - String.valueOf()메소드 이용
		String str1 = String.valueOf(10);
		String str2 = String.valueOf(3.14);
		String str3 = String.valueOf(true);
		
		System.out.println("str1: " + str1);
		System.out.println("str2: " + str2);
		System.out.println("str3: " + str3);
		
		
	}

}
