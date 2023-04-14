
public class LL4{

	static Node head;

	static class Node{
		int data;
		Node next, prev;

		Node(int data){
			this.data = data;
			this.next = null;
		}
	}

	static void moveLargestToLast(){
		Node temp = head;
		int largest = temp.data;

		while(temp.next != null){
			if(largest < temp.next.data) largest = temp.next.data;
			temp = temp.next;
		}

		Node cur = head; 
		//Node prev = head;
		while(cur != null){ // move at the back before delete
			if(cur.data == largest){
				Node dummyHead = head;
				Node largestNode = new Node(largest);
				while(dummyHead.next != null){ // para mapunta sa end ng list
					dummyHead = dummyHead.next;
				}
				dummyHead.next = largestNode;
				largestNode.next = null;

				//delete here
				cur.prev.next = cur.next;
				cur.next.prev = cur.prev;
				return;
			} 

			cur = cur.next;
		
		}
	}

	static void printLinkedList(){
	    // Node n = head;
	    Node n = head;

	    while(n != null){
	        System.out.print(n.data + " ");
	        n = n.next;
	    }
	}

	public static void main(String args[]){
		LL4 cLL = new LL4();

		cLL.head = new Node(1);
		Node second = new Node(5);
		Node third = new Node(3);
		Node fourth = new Node(4);
		Node fifth = new Node(2);

		head.next = second; head.prev = null;
		second.next = third; second.prev = head;
		third.next = fourth; third.prev = second;
		fourth.next = fifth; fourth.prev = third;
		fifth.next = null;  fifth.prev = fourth;

		moveLargestToLast();
		printLinkedList();

	}
}