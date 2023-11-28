package com.bridgelabs.LinkedListGenerics;

/*
 * @CLass Variables: data and next
 * 
 * @Class Methods: Constructor
 * 
 * @Description: Define the structure of the node
 */

public class Node<T> {

	T data;
	Node<T> next;

	Node(T data) {
		this.data = data;
		next = null;
	}

}
