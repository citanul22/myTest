package home;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.plaf.IconUIResource;

public class Prac {

	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		Prac prac = new Prac();
		prac.calculate(arrayList);
		prac.output(arrayList);
	}
	
	public void calculate(ArrayList<Integer> arrayList) {
		int x = 0;
		int max = 1000;
		int a = 0;
		int b = 0;
		
		while(true) {
		
			if(5*++x <= 1000)
				arrayList.add(5*x);
			if(3*x <= 1000)
				if(x % 5 != 0)
				arrayList.add(3*x);
			//3과 5의 배수인지 체크
			//두 값을 중복체크 하고 없을시 넣기 = x
			//3x5 인지 체크하고 빼기
			//iter 활용
			if(x >= 1000)
				return;
		}
	}
	
	public void output(ArrayList<Integer> arrayList){
		Iterator<Integer> iter = arrayList.iterator();
		int sum = 0;
		
		while(iter.hasNext()) {
			//System.out.print(iter.next() + " ");
			sum += iter.next();
		}
		System.out.print(sum);
	}
}
