package mypractise;

import org.junit.Test;

public class ReverseLinkedList {
	
	public class Node{
		int value;
		Node next;
		Node(int node){
			this.value=node;
			next=null;
		}
		
		public Node addNewNode(int val) {
			return new Node(val);
		}
		
		
	}
	
	
}