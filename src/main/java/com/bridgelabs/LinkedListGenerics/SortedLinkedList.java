package com.bridgelabs.LinkedListGenerics;

public class SortedLinkedList<T extends Comparable<T>> {

	private Node<T> head;

	/*
	 * @Description: Inserting a new node in sorted order
	 * 
	 * @params: T data
	 * 
	 * @return : void
	 */

	public void add(T data) {
		Node<T> newNode = new Node<T>(data);
		if (head == null || head.data.compareTo(data) > 0) {
			newNode.next = head;
			head = newNode;
			return;
		}

		Node<T> temp = head;
		while (temp.next != null && temp.next.data.compareTo(data) < 0) {
			temp = temp.next;
		}

		newNode.next = temp.next;
		temp.next = newNode;
	}

	/*
	 * @Description: Displaying the Sorted Linked List
	 * 
	 * @params: void
	 * 
	 * @return : void
	 */
	public void display() {
		Node<T> temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}

}
