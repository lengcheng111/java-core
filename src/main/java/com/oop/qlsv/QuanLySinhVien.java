package com.oop.qlsv;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.Serializable;
import java.util.Scanner;

public class QuanLySinhVien {
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
			System.out.println(" 4. show all sinh viên");
			System.out.println(" 5. Sắp xếp Sinh Viên theo điểm giảm dần");
			System.out.println(" 6. Sắp xếp Sinh viên theo tuổi tăng dần");
			Scanner keyboard = new Scanner(System.in);
			option = keyboard.nextInt();
			keyboard.nextLine();
			switch (option) {
			case (1):
				themSinhVien();
				break;
			case (2):
				editSinhVien();
				break;
			case (3):
				xoaSinhVien();
				break;
			case (4):
				showAll();
				break;
			case (5):
				sapXepSvTheoDiemGiamDan();
				break;
			case (6):
				sapXepSvTheoTuoiTangDan();
				break;

			}

			System.out.println("Bạn có muốn thực hiện lại không? Yes/ No?");
			repeat = keyboard.nextLine();

		} while (repeat.equals("Yes") == true);
	}

	// Check an element is null or not
	private static boolean isNotNull(SinhVien x) {
		if (x == null) {
			return false;
		} else
			return true;
	}

	private static void sapXepSvTheoTuoiTangDan() {
		for (int i = 0; i < data.length; i++) {
			final boolean notNull = isNotNull(data[i]);
			for (int j = 1; j < data.length; j++) {
				if (notNull && isNotNull(data[j]) && (data[i].getTuoi() > data[j].getTuoi())) {
					SinhVien temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				}
			}
		}

	}

	private static void sapXepSvTheoDiemGiamDan() {
		for (int i = 0; i < data.length; i++) {
			final boolean notNull = isNotNull(data[i]);
			for (int j = 1; j < data.length; j++) {
				if (notNull && isNotNull(data[j]) && (data[i].getDiemIelts() < data[j].getDiemIelts())) {
					SinhVien temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				}
			}
		}
	}

	private static void showAll() {
		// TODO Auto-generated method stub
		for (int i = 0; i < data.length; i++) {
			if (data[i] != null) {
				System.out.println(data[i]);
			}
		}
	}

	private static void themSinhVien() {
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
		keyboard.nextLine();
		sv.setTen(ten);
		sv.setDiaChi(diaChi);
		sv.setDiemIelts(diemIelts);
		sv.setSoCmt(soCmt);
		sv.setTuoi(tuoi);
		data[size] = sv;
		size++;
	}

	private static void editSinhVien() {
		Scanner keyboard = new Scanner(System.in);
		System.out.println(" Mời bạn nhập số cmt của sinh viên cần update thông tin:");
		int cmts = keyboard.nextInt();
		keyboard.nextLine();
		for (int i = 0; i < data.length; i++) {
			if (data[i] != null && (data[i].getSoCmt() == cmts)) {
				System.out.println("Địa chỉ mới");
				data[i].setDiaChi(keyboard.nextLine());
				System.out.println("Tên mới");
				data[i].setTen(keyboard.nextLine());
				System.out.println("Điểm Ielts mới");
				data[i].setDiemIelts(keyboard.nextFloat());
				System.out.println("Tuổi mới");
				data[i].setTuoi(keyboard.nextInt());
			}
		}
	}

	private static void saveData(SinhVien sv) {
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

	private static void xoaSinhVien() {
		System.out.println("Nhập số CMT của sinh viên bạn muốn xóa:");
		Scanner keyboard = new Scanner(System.in);
		int cmts = keyboard.nextInt();
		for (int i = 0; i < data.length; i++) {
			if ((data[i].getSoCmt() == cmts)) {
				data[i] = null;
				System.out.println("Đã xóa Sinh Viên " + cmts + " ra khỏi hệ thống");
				break;
			}
		}
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

	@Override
	public String toString() {
		return "SinhVien [ten=" + ten + ", diaChi=" + diaChi + ", tuoi=" + tuoi + ", soCmt=" + soCmt + ", diemIelts="
				+ diemIelts + "]";
	}
}
