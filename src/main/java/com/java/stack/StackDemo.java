package com.java.stack;

import java.util.Arrays;

public class StackDemo {
	private static int CAPACITY = 10;
	private int size;
	private int checkfull;
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
		int remove = 0;
		// 1. Xác định vị trí đầu tiên có value khác 0 từ phải qua trái của mảng
		for (int i = arr.length - 1; i > 0; i--) {
			if (arr[i] != 0) {
				remove = i;
				System.out.println("You have just pop => " + arr[i]);
				break;
			}
		}
		// 2. Khai báo một mảng có kích thướng nhỏ hơn mảng cũ 1 đơn vị
		int[] newArr = new int[arr.length - 1];
		this.size--;
		// 3. Các các phần tử phía sau arr[remove] cho mảng mới
		for (int i = 0; i < remove; i++) {
			newArr[i] = arr[i];
		}
		// 4. Gán lại cho mảng cũ
		this.arr = newArr;
	}

	/**
	 * Get Value of the Value at the TOP of array without remove it.
	 *
	 */
	public void peek() {
		// 1. Chọn ra phần tử đầu tiên khác 0 từ phải qua trái trong mảng
		for (int i = arr.length - 1; i > 0; i--) {
			if (arr[i] != 0) {
				// 2. In ra màn hình kết quả
				System.out.println("You have just peek =>" + arr[i]);
				break;
			} else {
				continue;
			}
			// 3. Vòng for kết thúc khi chọn được giá trị đầu tiên
		}
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
