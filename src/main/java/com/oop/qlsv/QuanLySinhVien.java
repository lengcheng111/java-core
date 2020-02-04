package com.oop.qlsv;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.Serializable;
import java.util.Scanner;

public class QuanLySinhVien {
	// khai báo mảng lưu trữ thông tin sinh viên
	private static SinhVien[] data;
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
		String ten;
		String diaChi;
		int tuoi;
		int soCmt;
		float diemIelts;
		Scanner keyboard = new Scanner(System.in);
		SinhVien sv = new SinhVien();
		System.out.println("Nhập tên:");
		ten = keyboard.nextLine();
		System.out.println("Nhập địa chỉ:");
		diaChi = keyboard.nextLine();
		System.out.println("Nhập tuổi:");
		tuoi = keyboard.nextInt();
		System.out.println("Nhập số chứng minh thư");
		soCmt = keyboard.nextInt();
		System.out.println("Nhập số điểm Ielts");
		diemIelts = keyboard.nextFloat();
		sv.setTen(ten);
		sv.setDiaChi(diaChi);
		sv.setDiemIelts(diemIelts);
		sv.setSoCmt(soCmt);
		sv.setTuoi(tuoi);

		try {
			// Create A file
			File sinhVienFile = new File("Sinhvien.txt");
			// Create A writer
			PrintStream writer = new PrintStream(sinhVienFile);
			// Save elements in Array one by one
			data[size] = sv;
			writer.println(sv.getTen());
			writer.println(sv.getDiaChi());
			writer.println(sv.getDiemIelts());
			writer.println(sv.getSoCmt());
			writer.println(sv.getTuoi());

			size++;
			// Close writer
			writer.close();
		} // end try
		catch (FileNotFoundException fnf) {
			System.err.println("The file was not found.");
		}

	}

	public static void suaSinhVien() {

	}

	public static void xoaSinhVien() {

	}

	public int size() {
		return this.size();
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
