package org.hyuna.ch03.sec01;

public class IncreaseDecreaseOperatorExample {

	public static void main(String[] args) {
		// 증감 연산자가 변수 앞에 있으면 우선 변수를 1 증가 또는 1 감소시킨 후에 다른 연산을 수행
		// 증감 연산자가 변수 뒤에 있으면 모든 연산을 끝낸 후에 변수를 1 증가 또는 1 감소 시킨다
		int x = 10;
		int y = 10;
		int z;
		
		x++;
		++x;
		System.out.println("x=" + x);
		
		System.out.println("------------");
		y--;
		--y;
		System.out.println("y=" + y);
		
		System.out.println("------------");
		z = x++;
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		
		System.out.println("------------");
		z = ++x;
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		
		System.out.println("------------");
		z = ++x + y++;
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		
	}

}
