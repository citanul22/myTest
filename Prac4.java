package home;

import java.util.ArrayList;

public class Prac4{
		
	public static void main(String[] args) {
		Prac4 prac4 = new Prac4();
		prac4.test();
	}
	
	public void test() {
		System.out.println(calculate(425));
	}
	
	//init
	public void init() {
		
	}
	//calculate
	public int calculate(int n) {
		
		final int MAX_NUM = 100000000;
		final int MAX_COUNT = 8;
		int splitNum = 10;
		int sum = 0;
		int cnt = 1;
		int tmp = 0;
		int realNum = 0;
		
		for(int i = MAX_NUM; i>=1; i/=splitNum) {
			
			
			tmp = n / i;
			n -= i*tmp;
			sum += tmp;
			System.out.println("sum : "+sum);
		}
		
//		for(int i = 10; i<=MAX_NUM; i*=splitNum) {
//			sum += (((n%i)/(10*cnt))*(10*cnt));
//			cnt++;
//			System.out.println("sum : "+sum);
//		}	
		return sum;
	}
	//100 000 000 부터 값이 있는지 1의자리까지 체크
//1부터 점점 늘린다
}

