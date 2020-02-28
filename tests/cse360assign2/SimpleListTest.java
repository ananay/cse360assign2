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
	
}
