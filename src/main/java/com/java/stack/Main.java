package com.java.stack;

public class Main {

	public static void main(String[] args) {
		StackDemo st = new StackDemo();
		st.add(0);
		st.add(1);
		st.add(3);
		st.add(0);

		st.print();
		System.out.println("Updated size:" + st.size());
	}

}
