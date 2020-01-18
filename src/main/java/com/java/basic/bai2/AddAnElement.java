package com.java.basic.bai2;

import java.util.Arrays;
import java.util.Scanner;

public class AddAnElement {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		System.out.println(" moi ban nhap vao mot mang");

		int[] arrays = new int[5];

		for (int i = 0; i < arrays.length; i++) {
			arrays[i] = keyboard.nextInt();
		}

		System.out.println(" nhap so ban muon them vao arrays");
		int addNumber = keyboard.nextInt();
		System.out.println(" nhap vi tri ban muon add vao arrays: " + "first/middle/last");

		String id = keyboard.next();

		int[] outPutArrays = new int[6];
		switch (id) {

		case "first": {
			outPutArrays[0] = addNumber;
			for (int j = 1; j < 6; j++) {
				outPutArrays[j] = arrays[j - 1];
			}
		}
			break;

		case "middle": {
			System.out.println(" ban muon them so vua nhap vao sau ID nao?");
			int maso = keyboard.nextInt();
			outPutArrays[maso + 1] = addNumber;
			for (int j = 0; j < maso + 1; j++) {
				outPutArrays[j] = arrays[j];
			}
			for (int j = maso + 2; j < 6; j++) {
				outPutArrays[j] = arrays[j - 1];
			}

		}
			break;

		case "last": {
			outPutArrays[5] = addNumber;
			for (int j = 0; j < 5; j++) {
				outPutArrays[j] = arrays[j];
			}

		}
			break;

		}
		System.out.println(" Ket qua :");
		System.out.println(Arrays.toString(outPutArrays));
	}
}