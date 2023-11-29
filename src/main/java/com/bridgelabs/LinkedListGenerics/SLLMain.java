package com.bridgelabs.LinkedListGenerics;

public class SLLMain {

	public static void main(String[] args) {
		SortedLinkedList<Integer> sortedList = new SortedLinkedList<>();
		sortedList.add(56);
		sortedList.add(30);
		sortedList.add(40);
		sortedList.add(70);

		System.out.println("Sorted Linked List");
		sortedList.display();
	}
}
