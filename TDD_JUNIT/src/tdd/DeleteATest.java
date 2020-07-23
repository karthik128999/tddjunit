package tdd;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DeleteATest {
	/* TO-DO
	 * “ABCD” => “BCD” 
	 * “AACD” => “CD”  
	 * “BACD” => “BCD” 
	 * “BBAA” => “BBAA”        
	 * “AABAA” => “BAA”
	 * "" =>""
	 * "A"=>"" 
	 */
	@Test
	public void test1() {
		assertEquals("BCD",DeleteA.del("ABCD"));
	}
	@Test
	public void test2() {
		assertEquals("CD",DeleteA.del("AACD"));
	}
	@Test
	public void test3() {
		assertEquals("BCD",DeleteA.del("BACD"));
	}
	@Test
	public void test4() {
		assertEquals("BBAA",DeleteA.del("BBAA"));
	}
	@Test
	public void test5() {
		assertEquals("BAA",DeleteA.del("AABAA"));
	}
	@Test
	public void test6() {
		assertEquals("",DeleteA.del(""));
	}
	@Test
	public void test7() {
		assertEquals("",DeleteA.del("A"));
	}
}
