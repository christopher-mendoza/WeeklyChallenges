package com.revature.rotationtests;

import org.junit.Test;

import StringRotation.StringCheck;
import junit.framework.Assert;

public class RotationCheckTests {
	StringCheck SC = new StringCheck();
	
	@Test
	public void rotationCheckTestPass() {
		String x = "abcd";
		String y = "dabc";
		Assert.assertEquals(true, SC.rotationCheck(x, y));
	}
	
	@Test
	public void rotationCheckTestFail() {
		String x = "abcd";
		String y = "dbac";
		Assert.assertEquals(false, SC.rotationCheck(x, y));
	}
}
