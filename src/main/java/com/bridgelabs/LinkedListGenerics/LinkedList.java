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

	public void insertBetween(T data, T val) {
		Node<T> newNode = new Node<T>(data);
		if (head == null) {
			head = newNode;
			return;
		}
		Node<T> temp = head;
		while (temp.data != val) {
			temp = temp.next;
		}
		newNode.next = temp.next;
		temp.next = newNode;

	}

	public void pop() {
		if (head == null)
			return;

		head = head.next;

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
		list.insertBetween(30, 56);
		list.display();
		System.out.println();

		// Delete Node
		System.out.println("Delete First Node");
		list.pop();
		list.display();

	}

}
