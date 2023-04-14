import java.util.*;	
class LL2{

	static Node head;

	static class Node{
		int data;
		Node next;

		Node(int data){
			this.data = data;
			this.next = null;
		}
	}

	static int Length(Node curHead){
	    Node current = curHead;
	    int count = 0;
	     
	    // if list is empty simply return length zero
	    if (curHead == null){
	        return 0;
	    }
	     
	    // traverse first to last node
	    else{
	        do{
	            current = current.next;
	            ++count;
	        } while (current != curHead);
	    }
	    return count;
	}

	static void DeleteAllEvenNode(Node fakeHead){
		int len = Length(head);

		int count = 1;
		Node previous = fakeHead, next = fakeHead;

		// Check list is empty
		// if empty simply return
		if (fakeHead == null){
			System.out.printf("\nList is empty\n");
			return;
		}

		// if list have single node
		// then return
		if (len < 2){
			return;
		}

		// make first node is previous
		previous = fakeHead;

		// make second node is current
		next = previous.next;

		while (len > 0){
			
			// check node number is even
			// if node is even then
			// delete that node
			if (count % 2 == 0){
				if(next == head){
					head = head.next;
				}

				previous.next = next.next;
				previous = next.next;
				next = previous.next;
			}

			len--;
			count++;
		}
		//return fakeHead;
	}

	static void printLinkedList(Node startingNode, int nodeCount){
	    Node n = startingNode;
	    int i = 1;

	    while(i <= nodeCount){
	        System.out.print(n.data + " ");
	        n = n.next;
	        ++i;
	    }
	}

	public static void main(String args[]){
		LL2 cLL = new LL2();

		cLL.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node fourth = new Node(4);
		Node fifth = new Node(5);

		head.next = second; //head.prev = null;
		second.next = third; //second.prev = head;
		third.next = fourth; //third.prev = second;
		fourth.next = fifth; //fourth.prev = third;
		fifth.next = head;  //fifth.prev = fourth;

		//System.out.print("Length of linked list: " + Length(third));
		DeleteAllEvenNode(third);
		int count = Length(head);
		printLinkedList(head, count);
	}

}

