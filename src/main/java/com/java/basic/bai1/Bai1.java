package com.java.basic.bai1;

import java.util.Arrays;

/**
 * nhập vào 1 mảng, sắp xếp các số nguyên tố theo thứ tự tăng dần rồi in ra
 * 
 * @author truonglv
 *
 */
public class Bai1 {

	public static void main(String[] args) {
		final int[] arr = { 2, 11, 23, 44, 66, 3, 23, 5, 67, 8, 9 };
		final int[] sorted = sort(arr);
		System.out.println(Arrays.toString(sorted));
	}

	// check a number is prime or not
	public static boolean isPrimeNumber(int m) {
		for (int j = 2; j < Math.sqrt(m); j++) {
			if (m % j == 0) {
				return false;
			}
		}
		return true;
	}

	// sort prime in array
	public static int[] sort(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			final boolean primeNumber = isPrimeNumber(arr[i]);
			for (int j = i + 1; j < arr.length; j++) {
				if (primeNumber && isPrimeNumber(arr[j]) && arr[i] > arr[j]) {
					final int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
}
