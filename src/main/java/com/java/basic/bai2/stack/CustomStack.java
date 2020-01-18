package com.java.basic.bai2.stack;

/**
 * https://vi.wikipedia.org/wiki/Ng%C4%83n_x%E1%BA%BFp
 * https://simple.wikipedia.org/wiki/Stack_(data_structure) custom stack with
 * int type
 * 
 * @author truonglv
 *
 */
public class CustomStack {
	// sức chứa mặc định của mảng
	private static final int CAPACITY = 10;
	private int size;
	private int[] arr = new int[CAPACITY];

	/**
	 * add 1 phần tử vào trong mảng
	 * 
	 * @param item
	 */
	public void add(int item) {

	}

	/**
	 * thêm mới 1 phần tử vào vị trí index trong mảng. kiểm tra: 0< index < size.
	 * nếu invalid index thì báo lỗi
	 * 
	 * @param item
	 * @param index
	 */
	public void add(int item, int index) {

	}

	/**
	 * trả ra số lượng phần tử trong mảng
	 * 
	 * @return
	 */
	public int size() {

	}

	/**
	 * Removes the object at the top of this stack and returns that object as the
	 * value of this function.
	 * 
	 * @return
	 */
	public int pop() {

	}

	/**
	 * Looks at the object at the top of this stack without removing it from the
	 * stack.
	 * 
	 * @return
	 */
	public int peek() {

	}

	public void print() {
		for (int i = 0; i < this.size; i++) {
			System.out.println("item=" + arr[i]);
		}
	}
}
