package com.sh.oop.emp.model;

import java.util.Scanner;

public class Employee {
	private int empNo;
	private String empName;
	private String dept;
	private String job;
	private int age;
	private char gender;
	private int salary;
	private double bonusPoint;
	private String phone;
	private String address;

	
	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public double getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(double bonusPoint) {
		this.bonusPoint = bonusPoint;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void empInput() {
		// 키보드입력용 메소드
		Scanner sc = new Scanner(System.in);
		System.out.print("사원번호 입력 : ");
		setEmpNo(sc.nextInt());
		sc.nextLine();
		System.out.print("이름 입력 : ");
		setEmpName(sc.nextLine());
		System.out.print("소속부서 입력 : ");
		setDept(sc.nextLine());
		System.out.print("직급 입력 : ");
		setJob(sc.nextLine());
		System.out.print("나이 입력 : ");
		setAge(sc.nextInt());
		sc.nextLine();
		System.out.print("성별 입력 : ");
		setGender(sc.nextLine().charAt(0));
		System.out.print("급여 입력 : ");
		setSalary(sc.nextInt());
		System.out.print("보너스포인트 입력 : ");
		setBonusPoint(sc.nextDouble());
		sc.nextLine();
		System.out.print("핸드폰 입력 : ");
		setPhone(sc.nextLine());
		System.out.print("주소 입력 : ");
		setAddress(sc.nextLine());
	}

	public String empOutput() {
		// 모든 필드 출력용 메소드
		return "Employee [empNo=" + empNo + ", empName=" + empName + ", dept=" + dept + ", job=" + job + ", age=" + age
				+ ", gender=" + gender + ", salary=" + salary + ", bonusPoint=" + bonusPoint + ", phone=" + phone
				+ ", address=" + address + "]";
	}
}
