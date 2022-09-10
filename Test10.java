package com.sh.test.condition;

import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {
		Test10 test10 = new Test10();
		test10.test();
	}

	public void test() {

		int score = 0;
		Scanner sc = new Scanner(System.in);

		System.out.print(" 점수를 입력 :");
		score = sc.nextInt();

		if (score >= 90 && score <= 100)
			System.out.printf("%d점은  수입니다.", score);
		else if (score >= 80 && score <= 89)
			System.out.printf("%d점은  우입니다.", score);
		else if (score >= 70 && score <= 79)
			System.out.printf("%d점은  미입니다.", score);
		else if (score >= 60 && score <= 69)
			System.out.printf("%d점은  양입니다.", score);
		else
			System.out.printf("%d점은  가입니다.", score);
	}
}
