package com.sh.oop.emp.run;


import java.util.Scanner;
import com.sh.oop.emp.model.Employee;

//class Employee{}

public class EmpTest {
	public static void main(String[] args) {
		EmpTest test = new EmpTest();
		Employee EmpArrSingle = new Employee();
		test.mainMenu();
	}

	public void mainMenu() {

		final int MAX_EMP_SIZE = 5;
		Employee EmpArr[] = new Employee[MAX_EMP_SIZE];
		
		for(int i = 0; i < MAX_EMP_SIZE; i++) {
			EmpArr[i] = new Employee();
		}
		
		int cnt = 0;
		Scanner sc = new Scanner(System.in);

		
		do {
			System.out.println("******* 사원 정보 관리 프로그램 *******");
			System.out.println("1. 새 사원 정보 입력 ");
			System.out.println("2. 사원 정보 삭제");
			System.out.println("3. 사원정보 출력");
			System.out.println("9. 끝내기");
			int key = sc.nextInt();

			switch (key) {
			case 1: {
				if (cnt < MAX_EMP_SIZE)
					EmpArr[cnt++].empInput();							
				else
					System.out.print("명단이 가득 찼습니다\n");
				break;
			}
			case 2: {
				if (cnt > 0) {
					EmpArr[cnt--] = null;
					System.out.print("삭제 되었습니다");
				}
					
				else
					System.out.print("명단이 비었습니다\n");
				break;
			}
			case 3: {
				for (int i = 0; i < cnt; i++)
					System.out.print(EmpArr[i].empOutput());
				break;
			}
			case 9: {
				System.out.print("종료합니다\n");
				return;
			}
			default:
			}
		} while (true);
	}
//	1. 새 사원 정보 입력  => empInput() 메소드 실행
//	2. 사원 정보 삭제 => 사원객체 참조변수에 null대입할  것.
//	3. 사원정보 출력 =>  empOutput() 메소드 실행
//	9. 끝내기
}
