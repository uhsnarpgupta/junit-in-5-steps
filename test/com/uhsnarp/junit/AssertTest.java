package com.uhsnarp.junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AssertTest {
	
	@Before
	public void before() {
		System.out.println("Before");
	}

	@Test
	public void test() {
		System.out.println("Test1");
		fail("Not yet implemented");
	}

}
