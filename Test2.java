package com.sh.test.loop;

import java.util.HashMap;
import java.util.Scanner;

public class Test2 {		
		public static void main(String[] args) {
			
			Test2 myTest = new Test2();
			myTest.test();
		}
		
		public void test() {
										
			Scanner sc = new Scanner(System.in);
			System.out.print("정수를 입력 :");
			int maxNum = sc.nextInt();
			
						
			for(int i=1; i <= maxNum; i++ )
				if(i%2==1)
					System.out.printf("수");
				else 
					System.out.printf("박");						
		}
}
