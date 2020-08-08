package com.oop.qlsv;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.Scanner;

public class QuanLySinhVien {
	private static SinhVien[] data;
	private static int size;
	private static String filename = "studentdata.txt";
	private static Scanner keyboard = new Scanner(System.in);

	public static void main(String[] args) throws IOException { // hàm thực thi công việc chính
		data = new SinhVien[100];
		loadData();
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
			option = keyboard.nextInt();
			keyboard.nextLine();
			switch (option) {
			case (1):
				themSinhVien();
				System.out.println("Số lượng sinh viên hiện tại:\t " + size);
				// save file
				break;
			case (2):
				editSinhVien();
				// save file
				break;
			case (3):
				xoaSinhVien();
				showAll();
				System.out.println("Số lượng sinh viên hiện tại:\t" + size);
				// save file
				break;
			case (4):
				showAll();
				break;
			case (5):
				sapXepSvTheoDiemGiamDan();
				// save file
				showAll();
				break;
			case (6):
				sapXepSvTheoTuoiTangDan();
				showAll();
				break;

			}
			// k phai ở đây
			System.out.println("Bạn có muốn thực hiện lại không? Yes/ No?");
			repeat = keyboard.nextLine();

		} while (repeat.equals("Yes"));

	}

	private static void loadData() {
		int docfile = 0;
		Scanner scanData = null;
		System.out.println(" Loading files...");
		try {
			File input = new File(filename);
			scanData = new Scanner(input).useDelimiter("\\s*;\\s*");
			while (scanData.hasNext()) {
				// gan' tung field trong file *txt sang bien tuong uong.
				String name = scanData.next();
				String address = scanData.next();
				int age = scanData.nextInt();
				int id = scanData.nextInt();
				float diem = scanData.nextFloat();
				// tao bien sv de gan' vao mang
				SinhVien sv = new SinhVien();
				sv.setTen(name);
				sv.setDiaChi(address);
				sv.setTuoi(age);
				sv.setSoCmt(id);
				sv.setDiemIelts(diem);
				// gan vao mang
				data[docfile] = sv;
				// tang kich thuoc mang
				docfile++;
			}
		} catch (Exception ex) {
			System.out.println("File not found :D");
		} finally {
			if (scanData != null) {
				scanData.close();
			}
		}

		System.out.println(" files sucessfully loaded");
		System.out.println(" Số lượng sinh viên hiện tại: " + docfile);
		size = docfile;
	}

	// Check an element is null or not
	private static boolean isNotNull(SinhVien x) {
		return x == null ? false : true;
	}

	private static void sapXepSvTheoTuoiTangDan() throws IOException {
		for (int i = 0; i < data.length; i++) {
			final boolean notNull = isNotNull(data[i]);
			for (int j = i + 1; j < data.length; j++) {
				if (notNull && isNotNull(data[j]) && (data[i].getTuoi() > data[j].getTuoi())) {
					SinhVien temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				}
			}
		}
		clearData();
		saveData();
	}

	private static void sapXepSvTheoDiemGiamDan() throws IOException {
		for (int i = 0; i < data.length; i++) {
			final boolean notNull = isNotNull(data[i]);
			for (int j = i + 1; j < data.length; j++) {
				if (notNull && isNotNull(data[j]) && (data[i].getDiemIelts() < data[j].getDiemIelts())) {
					SinhVien temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				}
			}
		}
		clearData();
		saveData();
	}

	private static void showAll() {
		// TODO Auto-generated method stub
		for (int i = 0; i < data.length; i++) {
			if (data[i] != null) {
				System.out.println(data[i]);
			}
		}
	}

	private static void themSinhVien() throws IOException {
		SinhVien sv = new SinhVien();
		System.out.println("Nhập tên:");
		String ten = keyboard.nextLine();
		System.out.println("Nhập địa chỉ:");
		String diaChi = keyboard.nextLine();
		System.out.println("Nhập tuổi:");
		int tuoi = Integer.parseInt(keyboard.nextLine());
		System.out.println("Nhập số chứng minh thư");
		int soCmt = Integer.parseInt(keyboard.nextLine());
		System.out.println("Nhập số điểm Ielts");
		float diemIelts = Float.parseFloat(keyboard.nextLine());
		keyboard.nextLine();
		sv.setTen(ten);
		sv.setDiaChi(diaChi);
		sv.setDiemIelts(diemIelts);
		sv.setSoCmt(soCmt);
		sv.setTuoi(tuoi);
		data[size] = sv;
		size++;
		clearData();
		saveData();
	}

	private static void saveData() throws IOException {
		// save data
		FileOutputStream fos = new FileOutputStream(filename, true);
		DataOutputStream dos = new DataOutputStream(fos);
		try {
			for (SinhVien sinhVien : data) {
				if (sinhVien != null) {
					dos.writeUTF(sinhVien.toString() + "\n");

				}
			}
			System.out.println("Thông tin sinh viên đã được lưu !");
			fos.close();
			dos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void clearData() throws IOException {
		FileWriter fwOb = new FileWriter(filename, false);
		PrintWriter pwOb = new PrintWriter(fwOb, false);
		pwOb.flush();
		pwOb.close();
		fwOb.close();
	}

	private static void editSinhVien() throws IOException {
		System.out.println(" Mời bạn nhập số cmt của sinh viên cần update thông tin:");
		int cmts = Integer.parseInt(keyboard.nextLine());
		keyboard.nextLine();
		for (int i = 0; i < data.length; i++) {
			if (data[i] != null && (data[i].getSoCmt() == cmts)) {
				System.out.println("Địa chỉ mới");
				data[i].setDiaChi(keyboard.nextLine());
				System.out.println("Tên mới");
				data[i].setTen(keyboard.nextLine());
				System.out.println("Điểm Ielts mới");
				data[i].setDiemIelts(Float.parseFloat(keyboard.nextLine()));
				System.out.println("Tuổi mới");
				data[i].setTuoi(Integer.parseInt(keyboard.nextLine()));
			}
		}
		clearData();
		saveData();
	}

	private static void xoaSinhVien() throws IOException {
		System.out.println("Nhập số CMT của sinh viên bạn muốn xóa:");
		int cmts = Integer.parseInt(keyboard.nextLine());
		for (int i = 0; i < data.length; i++) {
			if ((data[i].getSoCmt() == cmts)) {
				data[i] = null;
				System.out.println("Đã xóa Sinh Viên " + cmts + " ra khỏi hệ thống");
				break;
			}
		}
		size--;
		clearData();
		saveData();
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
		return ten + ";" + diaChi + ";" + tuoi + ";" + soCmt + ";" + diemIelts + ";";
	}

}
