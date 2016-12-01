package com.tpg.question.one;

import org.junit.Test;

import org.junit.Assert;

public class IPValidationRegexUnitTest {
	
	@Test
	public void test_validate()
	{
		 Assert.assertTrue(IPValidationRegex.validate("1.2.3.4"));
		 Assert.assertTrue(IPValidationRegex.validate("01.02.03.04"));
		 Assert.assertTrue(IPValidationRegex.validate("001.002.003.004"));
		 Assert.assertTrue(IPValidationRegex.validate("000.255.133.34"));
		 Assert.assertTrue(IPValidationRegex.validate("255.255.255.255"));
		 		 
		 Assert.assertFalse(IPValidationRegex.validate(null));
		 Assert.assertFalse(IPValidationRegex.validate(""));
		 Assert.assertFalse(IPValidationRegex.validate("0001.002.003.004"));
		 Assert.assertFalse(IPValidationRegex.validate("001.0012.003.004"));
		 Assert.assertFalse(IPValidationRegex.validate("0001.002.003.0014"));
		 Assert.assertFalse(IPValidationRegex.validate("256.222.003.004"));
		 Assert.assertFalse(IPValidationRegex.validate("233.256.003.004"));
		 Assert.assertFalse(IPValidationRegex.validate("226.222.256.004"));
		 Assert.assertFalse(IPValidationRegex.validate("226.222.003.256"));
		 Assert.assertFalse(IPValidationRegex.validate("1.2.3"));
	}

}
