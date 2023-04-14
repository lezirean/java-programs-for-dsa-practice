
public class TR2{

	static Node head;

	static class Node{
		int data;
		Node next;
		Node prev;

		Node(int data){
			this.data = data;
		}
	}

	/* Recursive Function to delete
	the last node of linked list */
	static void deleteLastNode(Node curNode){
		if (curNode.next == null){
			//curNode.prev.next = null;
			curNode.data = 0;
			return;
		} 
		else{	
			deleteLastNode(curNode.next);			
		}
	}

	static void printLinkedList(){
	    Node n = head;

	    while(n != null){
	        System.out.print(n.data + " ");
	        n = n.next;
	    }
	}

	public static void main(String[] args){
		TR2 cLL = new TR2();

		cLL.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node fourth = new Node(4);
		Node fifth = new Node(5);

		head.next = second; head.prev = null;
		second.next = third; second.prev = head;
		third.next = fourth; third.prev = second;
		fourth.next = fifth; fourth.prev = third;
		fifth.next = null;  fifth.prev = fourth;

		deleteLastNode(head);
		printLinkedList();
	}
}

