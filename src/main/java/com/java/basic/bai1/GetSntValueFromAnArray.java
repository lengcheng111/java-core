package com.java.basic.bai1;

import java.util.Scanner;

public class GetSntValueFromAnArray {

	public static void main(String[] args) {
		Scanner Nhapmang = new Scanner(System.in);
		int[] arr = new int[10];
		int j = 0;
		boolean test = Check(arr[j]);
		System.out.println(" Moi ban nhap mang");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Nhapmang.nextInt();
		}
		/*for (j = 0; j < arr.length; j++) {

			if (test == true)
				System.out.println(arr[j]);
		}*/
		while (test == true) {
			// Dang xu li tiep
		}

	}

	// FORMULA CHECK ID
	public static boolean Check(int n) {
		int count = 0;
		if ((n == 1) || (n == 2))
			return true;
		for (int i = 2; i < n / 2; i++) {
			if (n % i == 0) {
				count += 1;

				if (count == 1)
					break;

			}
		}
		if (count == 0)
			return true;
		else
			return false;

	}

	// BUBBLE SHORT
	public static void Sort(int[] mang) {
		for (int i = 0; i < mang.length - 1; i++)
			for (int j = 1; j < mang.length; j++) {
				int tempo = mang[0];
				if (mang[i] > mang[j]) {
					tempo = mang[i];
					mang[i] = mang[j];
					mang[j] = tempo;
				}
			}

	}

}
