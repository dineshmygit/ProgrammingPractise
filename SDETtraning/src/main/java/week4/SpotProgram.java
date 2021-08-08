package week4;

public class SpotProgram {
	public class Node{ 

		int value; 
		Node next; 
		Node(int key){ 
			this.value = key; 
			next = null; 
		} 
		public Node addNode(int key) { 
			return new Node(key); 
		} 

		public void printAllNodes(Node node) { 
			while(node != null) { 
				System.out.println(node.value); 
				node = node.next; 
			} 
		} 
		public void merge2LL(Node node1,Node node2) {
			Node current=node1,next=node2;
			Node tmp=new Node(value);
			while(node1!=null|| node2!=null) {
				if(current.value<=next.value) {
					tmp.value=current.value;
					tmp.next=next;
				}else {
					tmp.value=next.value;
					tmp.next=current;
				}
			}
		}
	}
}
