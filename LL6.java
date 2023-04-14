
public class LL6{

	static Node head;

	static class Node{
		int data;
		Node next, prev;

		Node(int data){
			this.data = data;
			this.next = null;
		}
	}

	static void moveSmallestToFront(){
		Node temp = head;
		int smallest = temp.data;

		while(temp.next != null){
			if(smallest > temp.next.data) smallest = temp.next.data;
			temp = temp.next;
		}

		Node cur = head; 
		while(cur != null){ // move at the front before delete
			if(cur.data == smallest){
				Node dummyHead = head;
				Node smallestNode = new Node(smallest);

				smallestNode.next = head;
				head = smallestNode; head.prev = null;

				cur.prev.next = cur.next;
				cur.next.prev = cur.prev;
				
				return;
			} 

			cur = cur.next;
		
		}
	}

	static void printLinkedList(){
	    Node n = head;

	    while(n != null){
	        System.out.print(n.data + " ");
	        n = n.next;
	    }
	}

	public static void main(String args[]){
		LL6 cLL = new LL6();

		cLL.head = new Node(3);
		Node second = new Node(2);
		Node third = new Node(1);
		Node fourth = new Node(4);
		Node fifth = new Node(5);

		head.next = second; head.prev = null;
		second.next = third; second.prev = head;
		third.next = fourth; third.prev = second;
		fourth.next = fifth; fourth.prev = third;
		fifth.next = null;  fifth.prev = fourth;

		moveSmallestToFront();
		printLinkedList();

	}
}