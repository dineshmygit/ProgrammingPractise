package mypractise;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedListPractise {
	Node head;
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
		}
	}

	public void printLinkedList() {
		Node n=head;
		while(n!=null) {
			System.out.println(n.data);
			n=n.next;
		}
	}
	
	public static void main(String[] args) {
		LinkedListPractise ll=new LinkedListPractise();
		
		Node first=ll.new Node(10);
		ll.head=first;
		
		Node second=ll.new Node(20);
		first.next=second;
		
		Node third=ll.new Node(30);
		second.next=third;
		
		Node four=ll.new Node(30);
		third.next=four;
		
		
		//ll.removeDuplicate();
		ll.printLinkedList();
		
	}
}
