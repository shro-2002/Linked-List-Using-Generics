package com.bridgelabs.LinkedListGenerics;

/*
 * @CLass Variables: head
 * 
 * @Class Methods: insertAtbegin,insertAtEnd,insertAfter,pop,popLast,deleteGivenNode,search, display
 * 
 * @Description: Create a linked list using Generics in Java
 */

public class LinkedList<T extends Comparable<T>> {

	private Node<T> head;

	/*
	 * @Description: Inserting a new node at the beginning of the Linked List
	 * 
	 * @params: T data
	 * 
	 * @return : void
	 */
	public void insertAtbegin(T data) {
		Node<T> newNode = new Node<T>(data);
		if (head == null) {
			head = newNode;
			return;
		}

		newNode.next = head;
		head = newNode;

	}

	/*
	 * @Description: Inserting a new node at the end of the Linked List
	 * 
	 * @params: T data
	 * 
	 * @return : void
	 */
	public void insertAtEnd(T data) {
		Node<T> newNode = new Node<T>(data);
		if (head == null) {
			head = newNode;
			return;
		}
		Node<T> temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
	}

	/*
	 * @Description: Inserting a new node in between the nodes of the Linked List
	 * 
	 * @params: T data, T val
	 * 
	 * @return : void
	 */

	public void insertAfter(T data, T newval) {
		Node<T> newNode = new Node<T>(data);
		if (head == null) {
			head = newNode;
			return;
		}
		Node<T> temp = head;
		while (temp.next != null && temp.data != newval) {
			temp = temp.next;
		}
		if (temp.next == null && temp.data != newval) {
			return;
		}

		newNode.next = temp.next;
		temp.next = newNode;

	}

	/*
	 * @Description: Deleting first node in the Linked List
	 * 
	 * @params: None
	 * 
	 * @return : void
	 */

	public void pop() {
		if (head == null)
			return;

		head = head.next;

	}

	/*
	 * @Description: Deleting last node in the Linked List
	 * 
	 * @params: None
	 * 
	 * @return : void
	 */

	public void popLast() {
		if (head == null)
			return;

		if (head.next == null)
			return;

		Node<T> temp = head;

		while (temp.next.next != null) {
			temp = temp.next;
		}

		temp.next = null;

	}

	/*
	 * @Description: Deleting a Given key in the Linked List
	 * 
	 * @params: T
	 * 
	 * @return : void
	 */
	public void deleteGivenNode(T newval) {

		if (head == null)
			return;

		if (head.data == newval) {
			head = head.next;
			return;
		}

		Node<T> temp = head;
		Node<T> prev = head;

		while (temp != null) {
			if (temp.data == newval)
				break;
			prev = temp;
			temp = temp.next;
		}

		if (temp == null)
			return;
		prev.next = temp.next;

	}

	/*
	 * @Description: Searching for a Given key in the Linked List
	 * 
	 * @params:T
	 * 
	 * @return : T
	 */
	public T search(T val) {
		if (head == null)
			return null;

		Node<T> temp = head;

		while (temp != null) {
			if (temp.data.equals(val))
				return temp.data;
			temp = temp.next;
		}

		return null;

	}

	/*
	 * @Description: Displaying the Linked List
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
