package com.sh.test.loop;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) throws Exception {
		Test4 myTest = new Test4();
		myTest.test();
	}
	
	public void test() throws Exception{
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 :");
		String str1 = sc.nextLine();
		
		for(int i = 0; i < str1.length(); i++){
			if(!((int)(str1.charAt(i)) >= 97 && (int)(str1.charAt(i)) <= 122)) {
				System.out.print("영문자가 아닙니다.");
				return;
			}
		}
		
		int count = 0;
		System.out.print("검색할 문자 입력 :");
		char check = sc.next().charAt(0);
		
		if(!((int)(check) >= 97 && (int)(check) <= 122)) {
			System.out.print("영문자가 아닙니다.");
			return;
		}
		
		for(int i = 0; i < str1.length(); i++)
		{
			if(str1.charAt(i) == check);
				count++;
		}
		
		System.out.printf("%c가 포함된 갯수 : %d 개",check, count);
	}

	
// Set 사용 (공부용)
	
//init
public void init() {
	hashSetStrG = new HashSet<String>();
	hashSetCharG = new HashSet<Character>();
}
//System.out.print("'p'가 포함된 갯수 : ");
//문자열과 문자열에서 검색될 문자를 입력 받아
public void input()throws Exception {
	Scanner sc = new Scanner(System.in);
	System.out.print("문자열 입력 :");
	String str1 = sc.nextLine();
	
	//String 맨 앞의 글자를 charAt() 영문자인지 체크
	for(int i = 0; i < str1.length(); i++){
		if(!((int)(str1.charAt(i)) >= 97 && (int)(str1.charAt(i)) <= 122)) {
			error();
			return;
		}
	}
	hashSetStrG.add(str1);
	
	
	//char를 영문자인지 체크
	System.out.print("검색할 문자 입력 :");
	char check = sc.next().charAt(0);
	
	if(!((int)(check) >= 97 && (int)(check) <= 122)) {
		error();
		return;
	}
	else {
		hashSetCharG.add(check);
	}
}

//문자열에 그 문자가 몇 개이었는지 개수를 확인
public void checkCharNum() {
	Iterator iter = hashSetStrG.iterator();
	Iterator iterChar = hashSetCharG.iterator();
	int count = 0;
	//System.out.print(iter.next());
	
	

	
	/*/System.out.print(iter.next().length());
	System.out.print("length() : ");
	System.out.print(((String)iter.next()).length());
	System.out.print(((String)iter.next()).length());
	System.out.print("\nnext()).charAt(0) : ");
	//System.out.print(((String)iter.next()).charAt(0));
	System.out.print("\n(char)iterChar.next() : ");
	System.out.print((char)iterChar.next());
	
	
	System.out.print("여기까지 실행됨");
	System.exit(0);
	*/
	String myStr = (String)iter.next();
	char myChar = (char)iterChar.next();
	for(int i = 0; i < myStr.length(); i++)
	{
		if(myStr.charAt(i) == myChar);
			count++;
		System.out.printf("%s / %c / %c\n",myStr,myStr.charAt(i) ,myChar );
	}
	
	System.out.printf("%c가 포함된 갯수 : %d 개",myChar, count);
}

public void output() {
	
}
//검색할 문자가 영문자가 아니면 "영문자가 아닙니다." 출력후 프로그램을 종료

public void error() {
	System.out.print("영문자가 아닙니다.");
}


//출력 예)
//문자열 입력 : application
//검색할 문자 입력 : p
//'p'가 포함된 갯수 : 2 개
}
