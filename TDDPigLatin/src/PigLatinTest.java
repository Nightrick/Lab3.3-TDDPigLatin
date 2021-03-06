import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PigLatinTest {

	@Test
	void vowelTest1() {
		assertEquals("appleway", PigLatin.translate("apple"));
	}
	
	@Test
	void vowelTest2() {
		assertEquals("elseway", PigLatin.translate("else"));
	}
	
	@Test
	void vowelTest3() {
		assertEquals("iodineway", PigLatin.translate("iodine"));
	}
	
	@Test
	void vowelTest4() {
		assertEquals("ordinaryway", PigLatin.translate("ordinary"));
	}
	
	@Test
	void vowelTest5() {
		assertEquals("underway", PigLatin.translate("under"));
	}
	
	@Test
	void oneConsonantTest1() {
		assertEquals("iraffegay", PigLatin.translate("giraffe"));
	}
	
	@Test
	void oneConsonantTest2() {
		assertEquals("ontractcay", PigLatin.translate("contract"));
	}
	
	@Test
	void twoConsonantTest() {
		assertEquals("igbray", PigLatin.translate("brig"));
	}
	
	@Test
	void threeConsonantTest() {
		assertEquals("apscray", PigLatin.translate("scrap"));
	}
	
	@Test
	void lowerCaseConversionTest() {
		assertEquals("scrap", "Scrap".toLowerCase());
	}
	
	@Test
	void pigLatinSentenceTest() {
		assertEquals("isthay isway orkingway", PigLatin.translate("this is working"));
	}
	
	
}
