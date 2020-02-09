package com.oop.qlsv;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DemoGhiFile {

	public static void main(String[] args) throws IOException {
		try {
			// 1. Tạo đối tượng luồng
			FileOutputStream fos = new FileOutputStream("Demo.txt", true);
			// 2. Liên kết luồng dữ liệu
			DataOutputStream dos = new DataOutputStream(fos);
			// 3. Ghi dữ liệu
			dos.writeUTF("LÊ VIẾT ĐỨC\n");
			// 4. Đóng luồng
			dos.close();
		} catch (FileNotFoundException e) {
			System.out.println(" file not found !");

		}

	}

}
