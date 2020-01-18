package com.java.basic.bai2;

import java.util.Arrays;
import java.util.Scanner;

public class InsertAnElement {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		int[] arrays = new int[7];

		System.out.println(" Nhap vao mot mang");

		for (int i = 0; i < 7; i++) {
			arrays[i] = keyboard.nextInt();
		}

		System.out.println(" Nhap so ban muon chen vao mang");
		int insertNumber = keyboard.nextInt();
		System.out.println(" Ban muon chen vao vi tri nao? 0 - 6");
		int id = keyboard.nextInt();

		arrays[id] = insertNumber;
		
		System.out.println(" KET QUA:");
		
		System.out.println(Arrays.toString(arrays));
	}

}
