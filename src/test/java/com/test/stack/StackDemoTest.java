package com.test.stack;

import org.junit.Assert;
import org.junit.Test;

import com.java.stack.StackDemo;

public class StackDemoTest {
	// đây là cách ng ta viết unitest cho code của họ
	// e sửa code thế nào để chạy mà nó pass là đc, ví dụ.
	// đây là 1 test case,
	// e đọc thêm mấy bài về junit,
	// e viets thêm test case nữa nhé.

	@Test
	public void testAdd10ItemsWillReturnSize10() {
		StackDemo stackDemo = new StackDemo();
		for (int i = 0; i < 10; i++) {
			stackDemo.add(i);
		}
		// a demo sửa ở đây, đúng ra là e phải sửa ở code của em.
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
		Assert.assertEquals(9, stackDemo.size());
	}

	// vidu
	// cái nafynos, chạy add, peek.
	// Vâng a
	// e sửa cái class StackDemo của e, làm sao mà nó xanh hết là đc,
	// nó đang chạy k đúng kìa, đúng k?
	// vâng. Expect 20 mà đk có 19.
	// đúng r.
	@Test
	public void testadd20itemsThenPeekOneItemWillReturn20Item() {
		StackDemo stackDemo = new StackDemo();
		for (int i = 0; i < 20; i++) {
			stackDemo.add(i);
		}
		stackDemo.peek();
		Assert.assertEquals(20, stackDemo.size());
	}
	// đó e, có thể viết càng nhiều càng tốt.
	// e fix tiếp ddi nhé
	// Mỗi lần e test thì nó chỉ chạy trên một method thôi ạ ?
	// e có thể chạy cả
	// Nếu chạy trên một method thì chỉ cần click vào tên method đó thôi ạ ?
	// Đây là trình test peformance của bài của em đúng ko a ?
	// test chức năng
	// da.
	// Ví dụ như ở trên nó đang test chức năng add với peek ạ ?
	// thế nhé. code xong, pass hết các test case, rồi e viết thêm cho đầy đủ
	// thực tế người ta cũng vừa code và vừa viết UT như này
	// Dạ

}
