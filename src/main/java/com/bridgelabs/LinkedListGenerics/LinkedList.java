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

	/*
	 * @params: T data
	 * 
	 * @return : void
	 * 
	 * @Description: Inserting a new node at the end of the Linked List
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

	}

}
