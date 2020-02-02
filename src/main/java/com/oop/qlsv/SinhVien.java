package com.oop.qlsv;

import java.util.Scanner;

public class SinhVien {

	private String name;
	private String major;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// DEFINE PARTICULARY CONSTRUCT
	public SinhVien(String name, String major, int age) {
		this.name = name;
		this.major = major;
		this.age = age;
	}

	// CONSTRUCT BIG
	public SinhVien() {

	}

	// Define INPUT
	public void input() {
		Scanner keyboard = new Scanner(System.in);

		System.out.println(" Enter name : ");
		keyboard.nextLine();
		System.out.println(" Enter major : ");
		keyboard.nextLine();
		System.out.println(" Enter age : ");
		keyboard.nextInt();
	}

	// Define OUPUT
	public void display() {
		System.out.println(" " + getName() + " " + getMajor() + " " + getAge());
	}

}
