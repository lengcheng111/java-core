package com.test.stack;

import org.junit.Assert;
import org.junit.Test;

import com.java.stack.StackDemo;

public class StackDemoTest {

	@Test
	public void testAdd10ItemsWillReturnSize10() {
		StackDemo stackDemo = new StackDemo();
		for (int i = 0; i < 10; i++) {
			stackDemo.add(i);
		}
		Assert.assertEquals(10, stackDemo.size());
	}

	@Test
	public void testAdd10ItemsThenPopOneItemWillReturnSize9() {
		StackDemo stackDemo = new StackDemo();
		for (int i = 0; i < 10; i++) {
			stackDemo.add(i);
		}
		stackDemo.pop();
		Assert.assertEquals(9, stackDemo.size());
	}

	@Test
	public void testAdd10Items0WillReturnSize10() {
		StackDemo stackDemo = new StackDemo();
		for (int i = 0; i < 10; i++) {
			stackDemo.add(0);
		}
		stackDemo.pop();
		Assert.assertEquals(10, stackDemo.size());
	}

}
