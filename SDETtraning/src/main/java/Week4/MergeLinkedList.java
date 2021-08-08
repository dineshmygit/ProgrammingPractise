package Week4;

import org.junit.Test;

public class MergeLinkedList {
	//Creating a node
	public class Node{
		int value;
		Node next;
		Node(){
			//this.value=val;
			next=null;
		}
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

	public Node mergeNodes(Node node1,Node node2) {
		Node merged=new Node();
		Node current=merged;
		while(node1!=null && node2!=null) {
			if(node1.value<node2.value) {
				current.next=node1;
				node1=node1.next;
			}else {
				current.next=node2;
				node2=node2.next;	
			}
			current=current.next;
		}
		current.next = node1 == null ? node2 : node1;
		return merged.next;
	}

	@Test
	public void test1() {
		Node head1=addNewNode(1);
		head1.next=addNewNode(3);
		head1.next=addNewNode(5);
		Node head2=addNewNode(2);
		head2.next=addNewNode(4);
		head2.next=addNewNode(6);
		Node mergeNodes = mergeNodes(head1,head2);
		printAllNodes(mergeNodes);
	}
}