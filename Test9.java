package com.sh.test.condition;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class Test9 {

	public static void main(String[] args) {
		Test9 test9 = new Test9();
		test9.test();
	}
	
	public void test() {
		char mainDish = ' ';
		int sideDish = 0;
		
		System.out.print(" *********주메뉴*********\n");
		System.out.print(" a. 불고2기버거 ------------5000\n");
		System.out.print(" b. 새우버거 --------------4000\n");
		System.out.print(" c. 치킨버거 --------------4500\n");
		System.out.print(" d. 한우버거 -------------10000\n");
		System.out.print(" e. 디버거 ----------------7000\n");
		System.out.print(" ***********************\n\n");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주메뉴 선택 :");
		mainDish = sc.nextLine().charAt(0);
		
		System.out.print(" *******사이드메뉴********\n");
		System.out.print(" 1. 콜라 -------------------1500\n");
		System.out.print(" 2. 사이다 -----------------1500\n");
		System.out.print(" 3. 밀크쉐이크-------------2500\n");
		System.out.print(" 4. 레드불------------------3000\n");
		System.out.print(" ***********************\n");
		
		System.out.print("사이드메뉴 선택 :");
		sideDish = sc.nextInt();

		String resultMain = "";
		String resultSide = "";
		int mainPrice = 0; 
		int sidePrice = 0; 
		
		switch(mainDish)
		{
		case 'a': resultMain = "불고기버거"; mainPrice = 5000; break;
		case 'b': resultMain = "새우버거"; mainPrice = 4000; break;
		case 'c': resultMain = "치킨버거"; mainPrice = 4500; break;
		case 'd': resultMain = "한우버거"; mainPrice = 10000; break;
		case 'e': resultMain = "디버거"; mainPrice = 7000; break;
		default : System.out.print("번호를 잘못 누르셨습니다. 영업을 종료합니다."); return;
		}
		
		switch(sideDish)
		{
		case 1: resultSide = "콜라 "; sidePrice = 1500; break;
		case 2: resultSide = "사이다 "; sidePrice = 1500; break;
		case 3: resultSide = "밀크쉐이크"; sidePrice = 2500; break;
		case 4: resultSide = "레드불"; sidePrice = 3000; break;
		default : System.out.print("번호를 잘못 누르셨습니다. 영업을 종료합니다."); return;
		}
		System.out.printf("%s, %s는 총 %d원입니다", resultMain, resultSide, mainPrice+sidePrice);
		
//		
	}

	public void testClass() {
		char mainDish = ' ';
		int sideDish = 0;
		
		showMainMenu();
		mainDish = (char)pickMenu(1, mainDish, sideDish); 
		showSideMenu();
		sideDish = pickMenu(2, mainDish, sideDish);
		showResult(mainDish, sideDish);
	}

//메뉴판 출력
	public void showMainMenu() {
		System.out.print(" *********주메뉴*********\n");
		System.out.print(" a. 불고기버거 ------------5000\n");
		System.out.print(" b. 새우버거 --------------4000\n");
		System.out.print(" c. 치킨버거 --------------4500\n");
		System.out.print(" d. 한우버거 -------------10000\n");
		System.out.print(" e. 디버거 ----------------7000\n");
		System.out.print(" ***********************\n\n");
	}

	public void showSideMenu() {
		System.out.print(" *******사이드메뉴********\n");
		System.out.print(" 1. 콜라 -------------------1500\n");
		System.out.print(" 2. 사이다 -----------------1500\n");
		System.out.print(" 3. 밀크쉐이크-------------2500\n");
		System.out.print(" 4. 레드불------------------3000\n");
		System.out.print(" ***********************\n");
	}
//메뉴 선택
	public int pickMenu(int select, char mainDish, int sideDish) {
		
		Scanner sc = new Scanner(System.in);
		
		if(select == 1){
		System.out.print("주메뉴 선택 :");
		mainDish = sc.nextLine().charAt(0);
		return mainDish;
		}
		else {
		System.out.print("사이드메뉴 선택 :");
		sideDish = sc.nextInt();
		return sideDish;
		}
	}

//선택한 메뉴와 가격 출력
	public void showResult(char mainDish, int sideDish) {

	//예) 주메뉴에서 a, 선택후 사이드메뉴에서 4 선택시
    //“불고기버거, 레드불은 총 8000원입니다“출력.
		
		String resultMain = "";
		String resultSide = "";
		int mainPrice = 0; 
		int sidePrice = 0; 
		
		switch(mainDish)
		{
		case 'a': resultMain = "불고기버거"; mainPrice = 5000; break;
		case 'b': resultMain = "새우버거"; mainPrice = 4000; break;
		case 'c': resultMain = "치킨버거"; mainPrice = 4500; break;
		case 'd': resultMain = "한우버거"; mainPrice = 10000; break;
		case 'e': resultMain = "디버거"; mainPrice = 7000; break;
		default : error();
		}
		
		switch(sideDish)
		{
		case 1: resultSide = "콜라 "; sidePrice = 1500; break;
		case 2: resultSide = "사이다 "; sidePrice = 1500; break;
		case 3: resultSide = "밀크쉐이크"; sidePrice = 2500; break;
		case 4: resultSide = "레드불"; sidePrice = 3000; break;
		default : error();
		}
		System.out.printf("%s, %s는 총 %d원입니다", resultMain, resultSide, mainPrice+sidePrice);
		
	}

//잘못 눌렀을 때
	public void error() {
		System.out.print("번호를 잘못 누르셨습니다. 영업을 종료합니다.");
	}
}
