package com.java.stack;

public class Main {

	public static void main(String[] args) {
		StackDemo st = new StackDemo();

		for (int i = 0; i < 59; i++) {
			st.add(i);
		}

		st.print();

		System.out.println("Actual size:" + st.size());
		System.out.println("Memory size:" + st.sizeOfArray());
	}

}
