package com.java.stack;

import java.util.Arrays;

public class StackDemo {
	private static int CAPACITY = 10;
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
		/**
		 * Ý tưởng: Sau mỗi lần add mảng sẽ mang thông tin real size ( trong biến
		 * this.size ). ta dùng thông tin đó để gán mảng cũ cho mảng mới: Bằng cách lấy
		 * phần tử đứng trước id(this.size - 1) làm mốc.
		 */
		// Khai báo một mảng mới, kích thước có thể bằng mảng cũ
		int[] newArr = new int[arr.length];
		// Trong ý tưởng
		for (int i = 0; i < this.size - 1; i++) {
			newArr[i] = arr[i];
		}
		// giảm biến this.size
		this.size--;
		// gán lại mảng
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
