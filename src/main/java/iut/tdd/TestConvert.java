package iut.tdd;

import org.junit.Test; 
import org.junit.Assert; 

public class TestConvert {
	@Test
	public void test_num2text_zero () {
		// Given
		String input = "0";
		String expected = "zéro";
		Convert myConvert = new Convert();
		// When
		String actual = myConvert.num2text(input);
	// Then
	Assert.assertEquals(expected, actual);}}