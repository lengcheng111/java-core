package com.oop.qlsv;

import java.util.Scanner;

/**
 * @author truonglv Tạo 1 danh sách sinh viên, quản lý các thông tin, cmt,
 *         hoten, tuoi, điểm, quequan. các chức năng: 1.thêm, xóa, sửa, cập nhật
 *         2. Sắp xếp danh sách sinh viên theo tuổi tăng dần 3. Sắp xếp danh
 *         sách sinh viên theo điểm giảm dần 4. Tìm kiếm theo tên, nhập gần đúng
 *         5. Tìm kiếm những sinh viên có tên giống nhau
 *
 */
public class SinhVien {
	private int id;
	private String name;
	private int age;
	private float score;
	private String address;

	// Viet ham nhap input thong tin sinh vien
	public void nhap() {
		Scanner keyboard = new Scanner(System.in);
		System.out.print(" ID NUMBER: ");
		id = keyboard.nextInt();
		System.out.print(" NAME: ");
		name = keyboard.next();
		System.out.print(" AGE: ");
		age = keyboard.nextInt();
		System.out.print(" IELTS SCORE: ");
		score = keyboard.nextFloat();
		System.out.print(" ADDRESS: ");
		address = keyboard.next();

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTuoi() {
		return age;
	}

	public void setTuoi(int tuoi) {
		this.age = tuoi;
	}

	public float getScore() {
		return score;
	}

	public void setScore(float score) {
		this.score = score;
	}

	public String getHomeTown() {
		return address;
	}

	public void setHomeTown(String homeTown) {
		this.address = homeTown;
	}

}
