package cse360assign2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import cse360assign2.SimpleList;

class SimpleListTest {

	/**
	 * Adds four numbers to the list, and checks the expected output using
	 * the toString() method to verify if all the elements are in the intended
	 * order. Element that goes in first is at the last since every new element
	 * is at the zeroth index.
	 */
	@Test
	void testAdd() {
		SimpleList s = new SimpleList();
		s.add(1);
		s.add(3);
		s.add(5);
		s.add(7);
		assertEquals("7 5 3 1", s.toString());
	}

	
	/**
	 * Adds 12 numbers to the list, and checks if all 12 numbers are there 
	 */
	
	@Test
	void testAddTwelve() {
		SimpleList s = new SimpleList();
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(4);
		s.add(5);
		s.add(6);
		s.add(7);
		s.add(8);
		s.add(9);
		s.add(10);
		s.add(11);
		s.add(12);
		assertEquals("12 11 10 9 8 7 6 5 4 3 2 1", s.toString());
	}
	
	/**
	 * Test remove with more spots
	 */
	@Test
	void testRemove() {
		SimpleList s = new SimpleList();
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(4);
		s.add(5);
		s.add(6);
		s.add(7);
		s.add(8);
		s.add(9);
		s.add(10);
		s.remove(10);
		s.remove(9);
		s.remove(8);
		assertEquals("7 6 5 4 3 2 1", s.toString());
	}
	
	/**
	 * Test append
	 */
	@Test
	void testAppend() {
		SimpleList s = new SimpleList();
		s.add(1);
		s.add(2);
		s.append(3);
		s.append(4);
		s.append(5);
		assertEquals("2 1 3 4 5", s.toString());
	}
	
	/**
	 * Test append with list full
	 */
	@Test
	void testAppendWithListFull() {
		SimpleList s = new SimpleList();
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(4);
		s.add(5);
		s.add(6);
		s.add(7);
		s.add(8);
		s.add(9);
		s.add(10);
		s.append(11);
		s.append(12);
		s.append(13);
		assertEquals("10 9 8 7 6 5 4 3 2 1 11 12 13", s.toString());
	}
	
	/**
	 * Tests if the first() method returns the first element
	 */
	@Test
	void testFirst() {
		SimpleList s = new SimpleList();
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(4);
		s.add(5);
		s.add(6);
		s.remove(6);
		assertEquals(5, s.first());
	}
	
	/**
	 * Tests if the last() method returns the last element
	 */
	@Test
	void testLast() {
		SimpleList s = new SimpleList();
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(4);
		s.add(5);
		s.add(6);
		s.append(7);
		s.remove(6);
		assertEquals(7, s.last());
	}
	
	/**
	 * Tests if size() returns the number of possible locations in the list
	 */
	@Test
	void testSize() {
		SimpleList s = new SimpleList();
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(4);
		s.append(5);
		s.append(6);
		s.add(7);
		s.remove(3);
		assertEquals(6, s.size());
	}
	
	/**
	 * Checks first() and last() for empty list
	 */
	@Test
	void checkForEmpty() {
		SimpleList s = new SimpleList();
		assertEquals(-1, s.first());
		assertEquals(-1, s.last());
	}
	
}
