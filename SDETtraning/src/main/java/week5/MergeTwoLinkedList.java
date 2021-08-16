package week5;

import org.junit.Test;

import week4.ReverseLinkedList.Node;

public class MergeTwoLinkedList {

	public class Node{
		int value;
		Node next;
		Node(int value){
			this.value=value;
			this.next=null;
		}
	}

	public Node addNewNode(int val) {
		return new Node(val);
	}

	public void printAllNodes(Node node) {
		while(node!=null) {
			System.out.println(node.value);
			node=node.next;
		}
	}
	
	public Node mergerLinkedList(Node node1,Node node2) {
		
		//Node mergeNode=new mergeNode(0);
		
		return node1;
		
	}
	
	@Test
	public void test1() {
		Node head1=addNewNode(1);
		head1.next=addNewNode(3);
		head1.next.next=addNewNode(5);
		head1.next.next.next=addNewNode(7);
		Node head2=addNewNode(2);
		head2.next=addNewNode(4);
		head2.next.next=addNewNode(6);
		head2.next.next.next=addNewNode(8);
		Node reverseNode = mergerLinkedList(head1,head2);
		printAllNodes(reverseNode);
	}	 

}
