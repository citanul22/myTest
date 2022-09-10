package com.sh.test.loop;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Test3 myTest = new Test3();
		myTest.test();

	}

	public void test() {

		Scanner sc = new Scanner(System.in);
		System.out.print("22정수 입력: ");
		int inputNum = sc.nextInt();
		if (!(inputNum > 0 && inputNum < 10)) {
			System.out.println("잘못 입력하셨습니다. 프로그램 종료합니다");
			return;
		} else {
			for (int i = 1; i <= 9; i++)
				System.out.println(+inputNum + " X " + i + " = " + inputNum * i);
		}
	}
}
