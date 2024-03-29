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

	public void getHead() {
		System.out.println("Head: " + head.value);
	}

	public void getTail() {
		System.out.println("Tail: " + tail.value);
	}

	public void getLength() {
		System.out.println("Length: " + length);
	}

	public void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.value);
			temp = temp.next;
		}
	}

}
