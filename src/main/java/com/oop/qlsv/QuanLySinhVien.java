package com.oop.qlsv;

import java.io.Serializable;
import java.util.Scanner;

public class QuanLySinhVien {
	// khai báo mảng lưu trữ thông tin sinh viên
	private static SinhVien[] data;
	private static Scanner keyboard;
	private static int size;

	public static void main(String[] args) { // hàm thực thi công việc chính
		data = new SinhVien[100];
		String repeat = null;
		int option;

		do {
			System.out.println(" Mời bạn lựa chọn:");
			System.out.println(" 1. Thêm sinh viên");
			System.out.println(" 2. Sửa sinh viên");
			System.out.println(" 3. Xóa sinh viên");
			Scanner keyboard = new Scanner(System.in);
			option = keyboard.nextInt();
			keyboard.nextLine();
			switch (option) {
			case (1): {
				themSinhVien();
			}
				break;
			case (2): {
				// sua sinh vien
			}
				break;
			case (3): {
				// xoa sinh vien
			}
				break;
			}

			System.out.println("Bạn có muốn thực hiện lại không? Yes/ No?");
			repeat = keyboard.nextLine();

		} while (repeat.equals("Yes") == true);

	}

	// Định nghĩa các chức năng thêm/ sửa / xóa...
	public static void themSinhVien() {
		// ten, dia chi, tuoi, so cmnt, diem ielts
		SinhVien sv = new SinhVien();
		System.out.println("Nhập tên:");
		sv.setTen(keyboard.nextLine());
		System.out.println("Nhập địa chỉ:");
		sv.setDiaChi(keyboard.nextLine());
		System.out.println("Nhập tuổi:");
		sv.setTuoi(keyboard.nextInt());
		System.out.println("Nhập số chứng minh thư");
		sv.setSoCmt(keyboard.nextInt());
		System.out.println("Nhập số điểm Ielts");
		sv.setDiemIelts(keyboard.nextFloat());

	}

	public static void suaSinhVien() {

	}

	public static void xoaSinhVien() {

	}

	public static void add(SinhVien item) {
		data[size] = item;
		size++;
	}
}

class SinhVien implements Serializable { // Chỗ này để lưu trữ thông tin sinh viên

	private String ten;
	private String diaChi;
	private int tuoi;
	private int soCmt;
	private float diemIelts;

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getTen() {
		return ten;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	public int getSoCmt() {
		return soCmt;
	}

	public void setSoCmt(int soCmt) {
		this.soCmt = soCmt;
	}

	public float getDiemIelts() {
		return diemIelts;
	}

	public void setDiemIelts(float diemIelts) {
		this.diemIelts = diemIelts;
	}

}
