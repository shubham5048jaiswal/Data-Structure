package linkedlist;

public class MyLinkedList {
	
	Node head;         //3. create head
	
	void add(int data) {
		Node toAdd = new Node(data);    //4. creation of new node
		
		if(isEmpty()) {                // 6.......
			head = toAdd;
			return;
		}
		
		Node temp = head;                
		while(temp.next != null) {         // 5.......
			temp = temp.next;
		}
		temp.next = toAdd;
	}
	void print() {
		Node temp = head;                
		while(temp != null) {
			System.out.print(temp.data +" ");
			temp = temp.next;
		}
	}
	boolean isEmpty() {                //6..initily head is empty that's why check
		return head == null;
	}
	
	
	static class Node {              //1. create node class
		int data;
		Node next;
		
		public Node(int data) {        //2. fill data and next
			this.data = data;
			next = null;
		}
	}

}
