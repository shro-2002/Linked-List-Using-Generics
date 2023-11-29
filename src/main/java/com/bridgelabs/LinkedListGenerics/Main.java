package com.bridgelabs.LinkedListGenerics;

public class Main {

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
