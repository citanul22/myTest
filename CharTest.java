package com.sh.test.condition;

import java.util.Scanner;
import java.util.Stack;

public class CharTest {
	Stack<Character> stack = new Stack<Character>();
	
	public static void main(String[] args) {
		CharTest myTest = new CharTest();
		myTest.test();
	}
	public void test() {
		System.out.print("문자를 입력하세요");
		Scanner sc = new Scanner(System.in);
		char check = sc.next().charAt(0);
		
		if(check >= 48 && check <= 57)
			System.out.printf("입력하신 문자 %c 은/는  숫자입니다.", check);
		else if(check >= 97 && check <= 122)
			System.out.printf("입력하신 문자 %c 은/는 알파벳입니다.", check);
		else
			System.out.printf("입력하신 문자 %c 은/는 특수문자입니다.", check);
	}	
}




//Stack 사용

//사용자에게 입력받은 문자하나를 문자타입에 따라 구분해 출력하세요.
//* 입력하신 문자 1 은/는  숫자입니다.
//* 입력하신 문자 c 은/는  알파벳입니다.
//* 입력하신 문자 z 은/는  알파벳입니다.
//* 입력하신 문자 * 은/는  특수문자입니다.