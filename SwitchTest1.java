package com.sh.test.condition;

import java.util.Scanner;

public class SwitchTest1 {

	public static void main(String[] args) {
		SwitchTest1 myTest = new SwitchTest1();
		myTest.test();
	}

	public void test() {
		int menuNum = 0;
		int liter = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("----------menu----------");
		System.out.println("1. 가정용 (50원/liter)");
		System.out.println("2. 상업용 (45원/liter)");
		System.out.println("3. 공업용 (30원/liter)");
		System.out.println("-------------------------");

		System.out.print("메뉴번호를 선택하세요 :");
		menuNum = sc.nextInt();
		System.out.print("물 사용량을 입력하세요 :");
		liter = sc.nextInt();

		int price = 0;
		int tax = 0;

		System.out.println("----------<<수도세>>-----------");

		switch (menuNum) {
		case 1: {
			System.out.printf("선택메뉴번호 :  %d. 가정용(집에서 사용하실 경우)를 선택하셨습니다.\n", menuNum);
			System.out.printf("사용요금 : %d\n", price = liter * 50);
			System.out.printf("수도세 : %d\n", tax = (int) (price * 0.05f));
			System.out.printf("총수도요금  : %d\n", price + tax);
			break;
		}
		case 2: {
			System.out.printf("선택메뉴번호 :  %d. 상업용(업소에서 사용하실 경우)를 선택하셨습니다.\n", menuNum);
			System.out.printf("사용요금 : %d\n", price = liter * 45);
			System.out.printf("수도세 : %d\n", tax = (int) (price * 0.05f));
			System.out.printf("총수도요금  : %d\n", price + tax);
			break;
		}

		case 3: {
			System.out.printf("선택메뉴번호 :  %d. 공업용 (공장에서 사용하실 경우)를 선택하셨습니다.\n", menuNum);
			System.out.printf("사용요금 : %d\n", price = liter * 30);
			System.out.printf("수도세 : %d\n", tax = (int) (price * 0.05f));
			System.out.printf("총수도요금  : %d\n", price + tax);
			break;
		}
		}

	}
}
//int score = 0;
//Scanner sc = new Scanner(System.in);
//
//System.out.print(" 점수를 입력 :");
//score = sc.nextInt();
//
//if (score >= 90 && score <= 100)
//	System.out.printf("%d점은  수입니다.", score);
//else if (score >= 80 && score <= 89)
//	System.out.printf("%d점은  우입니다.", score);
//else if (score >= 70 && score <= 79)
//	System.out.printf("%d점은  미입니다.", score);
//else if (score >= 60 && score <= 69)
//	System.out.printf("%d점은  양입니다.", score);
//else
//	System.out.printf("%d점은  가입니다.", score);

//switch(sideDish)
//{
//case 1: resultSide = "콜라 "; sidePrice = 1500; break;
//case 2: resultSide = "사이다 "; sidePrice = 1500; break;
//case 3: resultSide = "밀크쉐이크"; sidePrice = 2500; break;
//case 4: resultSide = "레드불"; sidePrice = 3000; break;
//default : error();
//}