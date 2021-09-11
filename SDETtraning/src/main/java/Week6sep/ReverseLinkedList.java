package Week6sep;

import org.junit.Test;

import Week6sep.ReverseLinkedList.Node;

public class ReverseLinkedList {

	class Node{
		int value;
		Node next;
		Node(int value){
			this.value=value;
			next=null;
		}
	}
	public Node addNewNode(int val) {
		return new Node(val);
	}

	public void printAllNode(Node node) {
		while(node!=null) {
			System.out.println(node.value);
			node=node.next;
		}
	}

	public Node reverseNode(Node node) {
		Node pre=null,current=node,next=null;
		while(current!=null) {
			next = current.next;
			current.next=pre;
			pre=current;
			current=next;
		}
		return pre;
	}
	
	@Test
	public void test1() {
		Node head=addNewNode(10);
		head.next=addNewNode(20);
		head.next.next=addNewNode(30);
		head.next.next.next=addNewNode(40);
		Node reverseNode = reverseNode(head);
		printAllNode(reverseNode);
	}
}
