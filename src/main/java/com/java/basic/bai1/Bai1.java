package com.java.basic.bai1;

import java.util.Scanner;

public class Bai1 {

	public static void main(String[] args) {
		
		
	}

	// VIET HAM NHAP VAO MOT MANG
	public static void NhapMang(int arr[], int n) {
		Scanner keyboard = new Scanner(System.in);
		n = keyboard.nextInt();
		for (int i = 0; i < n; i++) {
			arr[i] = keyboard.nextInt();
		}
	}

	// VIET HAM KIEM TRA SO NGUYEN TO
	public static int kiemtra(int m) {
		int dem;
		for (int j = 2; j < m; j++) {
			if (m % j == 0) {
				dem = dem + 1;
			}

		}
		if (dem == 0) {
			return 1;
		} else
			return 0;
	
	}
	// LOC RA CAC PHAN TU TRONG MANG LA SO NGUYEN TO
	public static void LOC(int arr2[], int n2) {
		
	}
}
