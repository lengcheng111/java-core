package com.java.stack;

public class Main {

	public static void main(String[] args) {
		StackDemo st = new StackDemo();

		st.add(1);
		st.pop();
		st.add(1);
		st.add(2);

		st.print();
		System.out.println("Actual size:" + st.size());
	}

}
