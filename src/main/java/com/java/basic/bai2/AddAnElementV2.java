package com.java.basic.bai2;

import com.java.basic.bai2.stack.CustomStack;

public class AddAnElementV2 {

	public static void main(String[] args) {
		CustomStack customStack = new CustomStack();
		customStack.add(12);
		customStack.add(3);
		customStack.add(2);

		customStack.pop();
		customStack.peek();

		customStack.print();

	}
}