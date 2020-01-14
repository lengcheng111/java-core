package com.java.basic.bai1;

import java.util.Scanner;

public class GetSntValueFromAnArray {

	public static void main(String[] args) {
		Scanner Nhapmang = new Scanner(System.in);
		int[] arr = new int[10];
		System.out.println(" Moi ban nhap mang");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Nhapmang.nextInt();
		}

		for (int i = 0; i < arr.length; i++) {
			boolean test = Check(arr[i]);
			if (test == true)
				System.out.println(arr[i]);
		}
		int i = 0;
		boolean test2 = Check(arr[i]);
		while(test2 == true) {
			// Dang xu li tiep
		}

	}

	// check ID
	public static boolean Check(int n) {
		int count = 0;
		if ((n == 1) || (n == 2))
			return true;
		for (int i = 2; i < n; i++) {
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

	// Bubble sort
	public static void Sort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++)
			for (int j = 1; j < arr.length; j++) {
				int tempo = arr[0];
				if (arr[i] > arr[j]) {
					tempo = arr[i];
					arr[i] = arr[j];
					arr[j] = tempo;
				}
			}

	}

}
