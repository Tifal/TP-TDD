package iut.tdd;

import org.junit.Test;
import org.junit.Assert;

public class TestConvert {
	static Convert myConvert = new Convert();

	@Test
	public void test_num2text_zero() {
		Assert.assertEquals("zéro", myConvert.num2text("0"));

	}

	@Test
	public void test_num2text_un() {
		Assert.assertEquals("un", myConvert.num2text("1"));

	}

	@Test
	public void test_num2text_de2a16() {
		Assert.assertEquals("deux", myConvert.num2text("2"));

	}

	@Test
	public void test_num2text_3() {
		Assert.assertEquals("trois", myConvert.num2text("3"));

	}

	@Test
	public void test_num2text_4() {
		Assert.assertEquals("quatre", myConvert.num2text("4"));
	}

	@Test
	public void test_num2text_5() {
		Assert.assertEquals("cinq", myConvert.num2text("5"));
	}

	@Test
	public void test_num2text_6() {
		Assert.assertEquals("six", myConvert.num2text("6"));
	}

	@Test
	public void test_num2text_7() {
		Assert.assertEquals("sept", myConvert.num2text("7"));
	}

	@Test
	public void test_num2text_8() {
		Assert.assertEquals("huit", myConvert.num2text("8"));
	}

	@Test
	public void test_num2text_9() {
		Assert.assertEquals("neuf", myConvert.num2text("9"));
	}

	@Test
	public void test_num2text_10() {
		Assert.assertEquals("dix", myConvert.num2text("10"));
	}

	@Test
	public void test_num2text_11() {
		Assert.assertEquals("onze", myConvert.num2text("11"));
	}

	@Test
	public void test_num2text_12() {
		Assert.assertEquals("douze", myConvert.num2text("12"));
	}

	@Test
	public void test_num2text_13() {
		Assert.assertEquals("treize", myConvert.num2text("13"));
	}

	@Test
	public void test_num2text_14() {
		Assert.assertEquals("quatorze", myConvert.num2text("14"));
	}

	@Test
	public void test_num2text_15() {
		Assert.assertEquals("quinze", myConvert.num2text("15"));
	}

	@Test
	public void test_num2text_16() {
		Assert.assertEquals("seize", myConvert.num2text("16"));
	}
}
