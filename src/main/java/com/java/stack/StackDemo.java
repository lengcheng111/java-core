package com.java.stack;

import java.util.Arrays;

public class StackDemo {
	private static final int CAPACITY = 10;
	private int size;
	private int[] arr = new int[CAPACITY];

	/**
	 * Add a element to head array
	 *
	 */
	public void add(int item) {
		if (this.size == arr.length) {
			// 1. Tao mot mang moi co kich thuoc lon hon gap 1.5 lan
			int[] newArr = new int[(int) (this.size * 1.5)];
			// 2. Copy mang cu vao mang moi
			for (int i = 0; i < arr.length; i++) {
				newArr[i] = arr[i];
			}
			// 3. Gan' item vao mang moi
			newArr[arr.length] = item;
			// 4. Gan mang moi vao mang cu
			this.arr = newArr;
		} else {
			arr[this.size] = item;
		}
		this.size++;
	}

	public int sizeOfArray() {
		return this.arr.length;
	}

	/**
	 * add an element to array, located by index ( defined by user ) & value (
	 * defined by user)
	 *
	 */
	public void add(int item, int index) {
	}

	/**
	 * remove an element at TOP of array
	 *
	 */
	public void pop() {
		// Thay thế TOP = 0
		arr[this.size - 1] = 0;
		// Giảm size
		this.size--;

	}

	/**
	 * Get Value of the Value at the TOP of array without remove it.
	 *
	 */
	public int peek() {
		return arr[this.size - 1];
	}

	/**
	 * Return size of Array
	 *
	 */
	public int size() {
		return this.size;
	}

	/**
	 * Print result to screen
	 *
	 */
	public void print() {
		System.out.println(Arrays.toString(arr));
	}
}
