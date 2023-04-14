import java.util.*;	
class LL3{

	static Node head;

	static class Node{
		int data;
		Node next, prev;

		Node(int data){
			this.data = data;
			this.next = null;
			this.prev = null;
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

	static void DeleteNode(Node fakeHead){
		int len = Length(head);

		Node currentNode = fakeHead;

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

		int count = 1;
		while (len > 0){
			if (count % 5 == 0){
				if(currentNode == head){
					head = head.next;
				}

				currentNode.prev.next = currentNode.next;
				currentNode = currentNode.next;
				--len;
				++count;
				continue;
			}
			currentNode = currentNode.next;
			--len;
			++count;
		}
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
		LL3 cLL = new LL3();

		cLL.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node fourth = new Node(4);
		Node fifth = new Node(5);
		Node sixth = new Node(6);
		Node seventh = new Node(7);
		Node eighth = new Node(8);
		Node ninth = new Node(9);
		Node tenth = new Node(10);

		head.next = second; head.prev = tenth;
		second.next = third; second.prev = head;
		third.next = fourth; third.prev = second;
		fourth.next = fifth; fourth.prev = third;
		fifth.next = sixth;  fifth.prev = fourth;
		sixth.next = seventh; sixth.prev = fifth;
		seventh.next = eighth; seventh.prev = sixth;
		eighth.next = ninth; eighth.prev = seventh;
		ninth.next = tenth; ninth.prev = eighth;
		tenth.next = head; tenth.prev = ninth;

		//System.out.print("Length of linked list: " + Length(third));
		DeleteNode(head);
		int count = Length(head);
		printLinkedList(head, count);
	}

}

