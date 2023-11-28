package com.bridgelabs.LinkedListGenerics;

/*
 * @CLass Variables: head
 * 
 * @Class Methods: insert, display
 * 
 * @Description: Create a linked list using Generics in Java
 */

public class LinkedList<T extends Comparable<T>> {

	private Node<T> head;

	/*
	 * @params: T data
	 * 
	 * @return : void
	 * 
	 * @Description: Inserting a new node at the beginning of the Linked List
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
	 * @params: T data
	 * 
	 * @return : void
	 * 
	 * @Description: Inserting a new node at the end of the Linked List
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
	 * @params: T data, T val
	 * 
	 * @return : void
	 * 
	 * @Description: Inserting a new node in between the nodes of the Linked List
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
	 * @params: None
	 * 
	 * @return : void
	 * 
	 * @Description: Deleting first node in the Linked List
	 */

	public void pop() {
		if (head == null)
			return;

		head = head.next;

	}

	/*
	 * @params: None
	 * 
	 * @return : void
	 * 
	 * @Description: Deleting last node in the Linked List
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
	 * @params: void
	 * 
	 * @return : void
	 * 
	 * @Description: Displaying the Linked List
	 */

	public void display() {
		Node<T> temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}

	public static void main(String[] args) {
		System.out.println("Linked Lists Using Generics");

		LinkedList<Integer> list = new LinkedList<Integer>();

		// Insert in beginning
		System.out.println("Insert in beginning");
		list.insertAtbegin(70);
		list.insertAtbegin(30);
		list.insertAtbegin(56);
		list.display();
		System.out.println();

		// Insert in End
		System.out.println("Insert in End");
		list.insertAtEnd(56);
		list.insertAtEnd(30);
		list.insertAtEnd(70);
		list.display();
		System.out.println();

		// Insert in Between
		System.out.println("Insert in Between");
		list.insertAfter(30, 56);
		list.display();
		System.out.println();

		// Delete First Node
		System.out.println("Delete First Node");
		list.pop();
		list.display();
		System.out.println();

		// Delete last Node
		System.out.println("Delete Last Node");
		list.popLast();
		list.display();
		System.out.println();

		// Insert in Between
		System.out.println("Insert After");
		list.insertAfter(40, 30);
		list.display();
		System.out.println();

	}

}
