package com.huskyshare.backend.spring.test;

import com.huskyshare.backend.model.user.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

// Spring单元测试
@RunWith(BlockJUnit4ClassRunner.class)
public class SpringUnitTest extends UnitTestBase {


	public SpringUnitTest() {
		super("classpath*:spring/applicationContext.xml");
	}

	@Test
	public void testUser() {
		User user = super.getBean("userContructedBySpringSpEL");
		System.out.println(user.getId() + ": " + user.getUsername());
	}

	@Test
	public void testUserApplicationContext() {
		System.out.println(this.getClass().toString() + ": " + super.getBean("userContructedBySpring").hashCode());
	}
}