package com.bridgelabs.LinkedListGenerics;

import static org.junit.Assert.*;

import org.junit.Test;

public class LinkedListTest {

	@Test
	public void searchtest() {

		LinkedList<Integer> list = new LinkedList<Integer>();

		list.insertAtEnd(56);
		list.insertAtEnd(30);
		list.insertAtEnd(70);

		assertTrue(list.search(30));
		assertFalse(list.search(100));
	}

}
