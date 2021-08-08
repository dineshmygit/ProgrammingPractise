package mypractise;

public class LinkedListBabu {
	Node head;
	
	class Node{
		int data;
		Node next;
		//creating a node
		Node(int data){
			this.data=data;
			next=null;
		}
	}
	//adding a node
	
//	10|20address 20|null
	public Node addNode(int value) {
		return new Node(value);
	}
	
	public Node reverseLinkedList(Node node) {
		Node pre=null,next=null,current=node;
		next=current.next;
		//current.n
		
		return node;
	}

}
