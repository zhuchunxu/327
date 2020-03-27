package com.zcx.common.uitls;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringUtilTest {

	@Test
	public void testHasLength() {
		boolean b = StringUtil.hasLength(" ");
		System.out.println(b);
	}

	@Test
	public void testHasText() {
		boolean b = StringUtil.hasText("a");
		System.out.println(b);
	}

	@Test
	public void testRandomChineseString() {
		fail("Not yet implemented");
	}

	@Test
	public void testGenerateChineseName() {
		fail("Not yet implemented");
	}

}
