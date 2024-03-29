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
	
	// print linkedlist items
	public void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.value);
			temp = temp.next;
		}
	}
	
	// add element at last
	public void append(int value) {
		Node newNode=new Node(value);
		if(length==0) {
			head=newNode;
			tail=newNode;
		}
		else {
			tail.next=newNode;
			tail=newNode;
		}
		length++;
	}
	
	// remove last element
	// 3 scenarios
	// 1. when length is zero return null
	// 2. when there are elements present 
	// 3. only one element was present and we have to remove that
	public Node removeLast() {
		// 1.
		if(length==0)return null;
		
		// 2.
		Node temp=head;
		Node pre=head;
		while(temp.next!=null) {
			pre=temp;
			temp=temp.next;
		}
		tail=pre;
		tail.next=null;
		length--;
		
		// 3.
		if(length==0) {
			head=null;
			tail=null;
		}
		return temp;
	}
	
	// prepend element at beginning
	public void prepend(int value) {
		Node newNode=new Node(value);
		if(length==0) {
			head=newNode;
			tail=newNode;
		}
		else {
			newNode.next=head;
			head=newNode;
		}
		length++;
	}
	
	// remove first element
	public Node removeFirst() {
		if(length==0)return null;
		Node temp=head;
		head=head.next;
		temp.next=null;
		length--;
		if(length==0) {
			tail=null;
		}
		return temp;
	}
}
