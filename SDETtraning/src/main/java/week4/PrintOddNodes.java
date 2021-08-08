package week4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.junit.Test;

public class PrintOddNodes {
	public class Node{ 

		int value; 
		Node next; 
		Node(int key){ 
			this.value = key; 
			next = null; 
		} 
	}
		public Node addNode(int key) { 
			return new Node(key); 
		} 

		Set<Integer>set=new HashSet<Integer>();
		public void printAllNodes(Node node) { 
			while(node != null) { 
				set.add(node.value);
				node = node.next; 
			} 
		}
		public void PrintSet() {
			Iterator it=set.iterator();
			
			while(it.hasNext()) {
				
			}

		}
		
		private void findOddNode(Node node) {
           while(node!=null) {
        	   node=node.next;
           }
			
		}
		
		@Test
		public void test1() {
			Node odd=addNode(10);
			odd.next=addNode(20);
			odd.next=addNode(30);
			odd.next=addNode(40);
			odd.next=addNode(50);
			printAllNodes(odd);
		}	
}
