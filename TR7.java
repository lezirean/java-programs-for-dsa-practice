
public class TR7{

	static Node head;

	static class Node{
		int data;
		Node next;
		Node prev;

		Node(int data){
			this.data = data;
		}
	}

	static void deleteEveryElement(Node curNode){
		if (curNode.next == null){
			//curNode.prev.next = null;
			curNode.data = 0;
			return;
		} 
		else{	
			curNode.data = 0;
			deleteEveryElement(curNode.next);			
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
		TR7 cLL = new TR7();

		cLL.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node fourth = new Node(4);
		Node fifth = new Node(5);
		Node sixth = new Node(6);
		Node seventh = new Node(7);
		Node eighth = new Node(8);
		Node ninth = new Node(9);

		head.next = second; head.prev = null;
		second.next = third; second.prev = head;
		third.next = fourth; third.prev = second;
		fourth.next = fifth; fourth.prev = third;
		fifth.next = sixth;  fifth.prev = fourth;
		sixth.next = seventh;  sixth.prev = fifth;
		seventh.next = eighth;  seventh.prev = sixth;
		eighth.next = ninth;  eighth.prev = seventh;
		ninth.next = null;  ninth.prev = eighth;

		printLinkedList();
		deleteEveryElement(head);
		System.out.println(" ");
		printLinkedList();
	}
}

