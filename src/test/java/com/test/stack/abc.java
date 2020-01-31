package com.test.stack;

import org.junit.Assert;
import org.junit.Test;

import com.java.stack.StackDemo;

public class abc {

	@Test
	public void testAdd10ItemsThenPopOneItemWillReturnSize9() {

		StackDemo stackDemo = new StackDemo();
		for (int i = 0; i < 50; i++) {
			stackDemo.add(i);
		}
		stackDemo.pop();
		Assert.assertEquals(49, stackDemo.size());

	}

}
