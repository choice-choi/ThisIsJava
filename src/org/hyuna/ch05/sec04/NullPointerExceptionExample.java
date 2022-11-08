package org.hyuna.ch05.sec04;

public class NullPointerExceptionExample {
	public static void main(String[] args) {
		//다음 예제에서 7라인과 10라인을 번갈아가며 주석 처리하고 실행해보면 NullPointerException이 발생하는 것을 알 수 있다.
		int[] intArray = null;
//		intArray[0] = 10;	//NullPointerException
		
		String str = null;
//		System.out.println("총 문자 수 : " + str.length());	//NullPointerException

		
		// ----------------------------------- //
		// NullPointerException이 발생하면 예외가 발생된 곳에서 null인 상태의 참조 변수가 사용되고 있음을 알아야 한다.
		// 이것을 해결하려면 참조 변수가 객체를 정확히 참조하도록 번지를 대입해야 한다.
		
		// 경우에 따라서는 참조 타입 변수에 일부러 null을 대입하기도 한다. 
		// 프로그램에서 객체를 사용하려면 해당 객체를 참조하는 변수를 이용해야 하는데, 
		// 변수에 null을 대입하면 번지를 잃게 되므로 더이상 객체를 사용할 수 없게 된다. 
		
	}

}
