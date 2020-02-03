package com.oop.qlsv;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		SinhVien[] DanhSach = new SinhVien[10];
		Scanner keyboard = new Scanner(System.in);
		System.out.println(" xin moi nhap vao gia tri");
		for (int i = 0; i < 3; i++) {
			// nhap vao gia tri
			String name = keyboard.nextLine();
			String address = keyboard.nextLine();
			int tuoi = keyboard.nextInt();
			float diem = keyboard.nextFloat();
			DanhSach[i] = new SinhVien(name, address, tuoi, diem);
			// xoa bo nho dem ban phim, chuan bi cho lan nhap tiep theo
			keyboard.nextLine();
			// Gan'vao mang:

		}
		for (int i = 3; i < 10; i++) {
			DanhSach[i] = null;
		}
		for (SinhVien x : DanhSach) {
			System.out.println(" " + x.getAddress() + " " + x.getDiem() + " " + x.getName() + " " + x.getTuoi());
		}
	}

}
