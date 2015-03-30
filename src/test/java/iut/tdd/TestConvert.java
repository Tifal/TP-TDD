package iut.tdd;

import org.junit.Test; 
import org.junit.Assert; 

public class TestConvert {
	@Test
	public void test_num2text_zero () {
		// Given
		Convert myConvert = new Convert();
		Assert.assertEquals("zéro", myConvert.num2text("0"));
		// When
		
	// Then
	}
//Given
	@Test
	public void test_num2text_un (){
		 Convert myConvert = new Convert();
		Assert.assertEquals("un", myConvert.num2text("1"));
		// When
		
	// Then
	}

//Given
	@Test
		public void test_num2text_de2a16 (){
			
		 Convert myConvert = new Convert();
		Assert.assertEquals("deux", myConvert.num2text("2"));
		// When
		
	// Then
		//Given
		myConvert = new Convert();
		Assert.assertEquals("trois", myConvert.num2text("3"));
				// When
				
			// Then
		myConvert = new Convert();
		Assert.assertEquals("quatre", myConvert.num2text("4"));
		myConvert = new Convert();
		Assert.assertEquals("cinq", myConvert.num2text("5"));
		myConvert = new Convert();
		Assert.assertEquals("six", myConvert.num2text("6"));
		myConvert = new Convert();
		Assert.assertEquals("sept", myConvert.num2text("7"));
		myConvert = new Convert();
		Assert.assertEquals("huit", myConvert.num2text("8"));
		myConvert = new Convert();
		Assert.assertEquals("neuf", myConvert.num2text("9"));
		myConvert = new Convert();
		Assert.assertEquals("dix", myConvert.num2text("10"));
		myConvert = new Convert();
		Assert.assertEquals("onze", myConvert.num2text("11"));
		myConvert = new Convert();
		Assert.assertEquals("douze", myConvert.num2text("12"));
		myConvert = new Convert();
		Assert.assertEquals("treize", myConvert.num2text("13"));
		myConvert = new Convert();
		Assert.assertEquals("quatorze", myConvert.num2text("14"));
		myConvert = new Convert();
		Assert.assertEquals("quinze", myConvert.num2text("15"));
		myConvert = new Convert();
		Assert.assertEquals("seize", myConvert.num2text("16"));}}
		
	