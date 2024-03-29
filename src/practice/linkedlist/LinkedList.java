package practice.linkedlist;

public class LinkedList {
	// head and tail are of type node so that it can point to a node
	private Node head;
	private Node tail;
	private int length;

	// LinkedList constructor
	public LinkedList(int value) {
		Node newNode = new Node(value);
		// pointing head and tail to newNode
		head = newNode;
		tail = newNode;
		length = 1;
	}

	// Node is inner or nested class
	class Node {
		int value;
		// next is of type Node because it can point to a node
		Node next;

		// Node constructor
		Node(int value) {
			this.value = value;
		}
	}

}
