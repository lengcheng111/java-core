package com.java.basic.bai1;

import java.util.Scanner;

public class CheckSoNguyenTo {

	public static void main(String[] args) {
		  
		boolean question = true;
		while (question) {
			// TODO Auto-generated method stub
			System.out.println(" Moi ban nhap vao mot so bat ky");
			Scanner keyboard = new Scanner(System.in);
			int enemy = keyboard.nextInt();
			int count = 0;

			if ((enemy == 1) || (enemy == 2))
				System.out.println(" LA SO NGUYEN TO");
			else {
				for (int i = 2; i < enemy/2; i++) {
					if (enemy % i == 0) {
						count += 1;
					}
					if (count == 1)
						break;

				}
				if (count == 0) {
					System.out.println("LA SO NGUYEN TO");
				} else
					System.out.println(" KHONG LA SO NGUYEN TO");
			}
			System.out.println("type true to continue and type false to stop");			
			 question = keyboard.nextBoolean();
		}
		 
	}
	
}