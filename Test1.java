package com.sh.test.loop;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Test1 myTest = new Test1();
		myTest.test();
	}

	public void test() {
		
		int userNum = 0;
		int sum = 0;
		Scanner sc = new Scanner(System.in);

		System.out.print(" 더할 정수를 입력 :");
		userNum = sc.nextInt();

		for(int i = 1;i <= userNum;i++) 
			if(i % 2 == 0)
				sum += i;
			
		System.out.printf("1부터 %d까지 존재하는 짝수의 합: %d",userNum, sum);
	}

}
