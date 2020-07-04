package com.validator.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.validator.Validation;

public class ValidationTest {

	private static Validation validation;
	
	@BeforeAll
	public static void createvalitionObject() {
		validation=new Validation();
	}
	
	@Test
	public void isValidPanTestTrue() {
		Assertions.assertTrue(validation.isValidPan("ABCDE1111A"));
	}
	
	@Test
	public void isValidPanTestFalse() {
		Assertions.assertFalse(validation.isValidPan("ABCDE11111"));
	}
	
	@Test
	public void isValidPanTestForNull() {
		Assertions.assertFalse(validation.isValidPan(null));
	}
}
