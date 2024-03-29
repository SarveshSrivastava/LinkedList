package practice.linkedlist;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList(4);
		
//		ll.getHead();
//		ll.getTail();
//		ll.getLength();
//		ll.printList();
		
		
		ll.append(5);
		
//		ll.getHead();
//		ll.getTail();
//		ll.getLength();
		System.out.println("Elements in list are ");
		ll.printList();
		System.out.println("Elements removed at last "+ll.removeLast().value);
		System.out.println("Elements removed at last "+ll.removeLast().value);
		// .value will throw nullpointer
		System.out.println("Elements removed at last "+ll.removeLast());
	}

}
