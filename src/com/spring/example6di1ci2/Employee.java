package com.spring.example6di1ci2;

public class Employee {
	private int empno;
	private String empname;
	private Address address;

	public Employee(int empno, String empname, Address address) {
		super();
		this.empno = empno;
		this.empname = empname;
		this.address = address;
	}

	public void show() {
		System.out.println("Number :" + empno + "\tName : " + empname);
		System.out.println(address.toString());
	}
}
