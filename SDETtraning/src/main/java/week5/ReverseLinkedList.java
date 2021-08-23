package week5;

import org.junit.Test;

public class ReverseLinkedList {
	Node head;
	
	class Node{
		int value;
		Node next;
		Node(int value){
			this.value=value;
			this.next=null;
		}
	}
		
		public Node addNode(int value) {
			return new Node(value);
		}
		
		public void printNodes(Node node) {
			while(node!=null) {
				System.out.println(node.value);
				node=node.next;
			} 
	}
		
		private Node reverseNode(Node node) {
			Node prev=null,current=node,next=null;
			while(current!=null) {	
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
			}
			return prev;
		}
		
		public Node insertFirst(int val) {
		Node insertFirstNode=new Node(val);
		insertFirstNode.next=head;
		head=insertFirstNode;
		return insertFirstNode;
		} 
		
		@Test
		public void reverseLinkedList() {
			//Reverse linked list
			//Node LL=new Node(10);
			/*LL.next=addNode(20);
			LL.next.next=addNode(30);
			LL.next.next.next=addNode(40);
			Node reverseNode=reverseNode(LL);
			printNodes(reverseNode);*/
			//Insert at first
			ReverseLinkedList obj=new ReverseLinkedList();
			obj.insertFirst(10);
			obj.insertFirst(20);
			obj.insertFirst(30);
			
			System.out.println(obj);
		}

}
