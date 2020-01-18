package com.java.basic.bai2;

import java.util.Scanner;

public class TrackElementInArray {
	public static void main(String[] args) {
		// TO DO:  NHAP VAO MOT MANG VA MOT NUMBER BAT KI TU KEYBOARD
		// KIEM TRA NHUNG PHAN TU CORRECT VOI NUMBER VUA NHAP VAO
		// NEU KO CORRECT THI YEU CAU NHAP LAI
		

		Scanner keyboard = new Scanner(System.in);

		int[] Arrays = new int[5];
		System.out.println(" Moi bao nhap vao mot mang");
		for (int i = 0; i < 5; i++) {
			Arrays[i] = keyboard.nextInt();
		}
		int kiemtra = 0;
		System.out.println(" Nhap mot so bat ky");
		do {
			int x = keyboard.nextInt();
			for (int j = 0; j < Arrays.length; j++) {

				if (Arrays[j] == x) {
					System.out.println("Arrays " + j + " = " + x);
					kiemtra += 1;

				}

			}

		} while (kiemtra == 0);

	}
}
// VAN DE: NEU NHU NHAP MOT SO KHONG THUOC TRONG MANG, VA YEU CAU NHAP LAI.
// THI CHUA LAM DUOC