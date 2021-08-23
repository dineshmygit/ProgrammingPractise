package week4;

import org.junit.Test;
public class ReverseLinkedList {
	//Creating a node
	public class Node{
		int value;
		Node next;

		Node(int val){
			this.value=val;
			next=null;
		}
	}
	//when add a new node
	public Node addNewNode(int val) {
		//newNode.next= null;
		return new Node(val);
	}
	public void printAllNodes(Node node) {
		while(node!=null) {     
			System.out.println(node.value);
			node=node.next;
		}
	}
	public Node reverseNode(Node node) {
		Node prev=null,current=node,next=null;
		while(current!=null) {
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
		}
		return prev;
	}	
	@Test
	public void test1() {
		Node head=addNewNode(10);
		head.next=addNewNode(20);
		head.next.next=addNewNode(30);
		head.next.next.next=addNewNode(40);
		Node reverseNode = reverseNode(head);
		printAllNodes(reverseNode);
	}	
}