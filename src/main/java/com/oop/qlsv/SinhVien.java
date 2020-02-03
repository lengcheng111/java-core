package com.oop.qlsv;

public class SinhVien {

	private String name;
	private String address;
	private int tuoi;
	private float diem;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	public float getDiem() {
		return diem;
	}

	public void setDiem(float diem) {
		this.diem = diem;
	}

	// tao constructor
	public SinhVien(String name, String address, int tuoi, float diem) {
		this.name = name;
		this.address = address;
		this.tuoi = tuoi;
		this.diem = diem;
	}

}
