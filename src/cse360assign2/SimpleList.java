package cse360assign2;
import java.util.Arrays;

/**
 * SimpleList Class implements an array of integers and methods to add, remove,
 * search, count and to string.
 * @author ananayarora
 * @classID 301
 * @AssignmentNumber 1
 */

public class SimpleList {
	
	private int[] list;
	private int count;
	
	/**
	 * SimpleList constructor initializes the list of integers and sets the
	 * count to zero.
	 */
	public SimpleList() {
		list = new int[10];
		count = 0;
	}
	
	/**
	 * Adds the number N to the zeroth index of the array of integers and shifts
	 * the rest by one so the new element is always at the zeroth index just  
	 * like in a stack.
	 * 
	 * @param n The number to be added to the list 
	 */
	public void add(int n) {
		
		// Increment the list count and clamp it to 10.
		if (count < 10) {
			count++;
		}
		// Move all elements by one.	
		for (int iterator = count - 1; iterator >= 1; iterator--) {
			list[iterator] = list[iterator-1];
		}
		
		// Set the zeroth element to the parameter value.		
		list[0] = n;
	}
	
	/**
	 * Removes an item from the list. Searches for the parameter value and
	 * removes the first occurrence of it.
	 * 
	 * @param n The number that is to be added to the array.
	 */
	public void remove(int n) {
		
		// Search for the number in the array
		int search = search(n);
				
		// Check if it's the only element		
		if (search == 0 && count == 1) {
			list = new int[10];
			count = 0;
		} else if (search != -1) {
			// Make sure the element exists, then create a new array and push 
			// all elements except for that element.
			int[] newArray = new int[10];
			for (int i = 0; i < search; i++) {
				newArray[i] = list[i];
			}
			for (int i = search + 1; i < list.length; i++) {
				newArray[i-1] = list[i];
			}
			count--;
			list = newArray;
		}
	}
	
	/**
	 * Returns the number of elements in the array
	 * 
	 * @return count Represents the number of elements in the array
	 */
	public int count() {
		return count;
	}
	
	/**
	 * Returns the entire array of integers space-separated as a string
	 * @return s 
	 */
	public String toString() {
		String s = "";
		if (count > 0) {
			// Do everything only if there is something in the array.
			for (int iterator = 0; iterator < count; iterator++) {
				s += list[iterator] + " ";
			}
			// Trim the last space
			s = s.substring(0, s.length() - 1);
		}	
		return s;
	}
	
	/**
	 * Searches for the number in the array of integers
	 * 
	 * @param n The number to search for
	 * @return 
	 */
	public int search(int n) {
		for (int iterator = 0; iterator < count; iterator++) {
			if (list[iterator] == n) {
				return iterator;
			}
		}
		return -1;
	}
	
}
