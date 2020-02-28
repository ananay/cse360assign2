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
	
}
