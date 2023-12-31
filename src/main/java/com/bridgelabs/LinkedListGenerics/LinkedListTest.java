package com.bridgelabs.LinkedListGenerics;

import static org.junit.Assert.*;

import org.junit.Test;

public class LinkedListTest {
	LinkedList<Integer> list = new LinkedList<Integer>();

	@Test
	public void searchtest() {

		list.insertAtEnd(56);
		list.insertAtEnd(30);
		list.insertAtEnd(70);

		assertNotNull(list.search(30));
		assertNull(list.search(100));
	}

	@Test
	public void testInsertAfter() {

		// Insert in beginning

		list.insertAtbegin(70);
		list.insertAtbegin(30);
		list.insertAtbegin(56);

		Integer nodedata = list.search(30);
		assertNotNull(list.search(30));
		list.insertAfter(nodedata, 40);

	}

	@Test
	public void testDeleteAfter() {

		// Insert in beginning

		list.insertAtbegin(70);
		list.insertAtbegin(30);
		list.insertAtbegin(56);

		Integer nodedata = list.search(56);
		assertNotNull(list.search(56));
		list.deleteGivenNode(nodedata);

	}

}
