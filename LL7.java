// copy one linked list to another
public class LL7{

	static Node head;

	static class Node{
		int data;
		Node next, prev;

		Node(int data){
			this.data = data;
			this.next = null;
		}
	}


	void printLinkedList(Node head){
	    Node n = head;

	    while(n != null){
	        System.out.print(n.data + " ");
	        n = n.next;
	    }
	}


    static Node copy(Node list){
        if (list == null)
            return null;

        Node res = new Node(list.data);
        Node resTmp = res;
        Node listTmp = list;

        while (listTmp.next != null){
            listTmp = listTmp.next;
            resTmp.next = new Node(listTmp.data);
            resTmp = resTmp.next;
        }

        return res;
    }

	public static void main(String args[]){
		LL7 cLL = new LL7();
		LL7 cLLCopy = new LL7();

		cLL.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node fourth = new Node(4);
		Node fifth = new Node(5);

		head.next = second; 
		second.next = third; 
		third.next = fourth; 
		fourth.next = fifth; 
		fifth.next = null;

		System.out.print("Original List: ");
		cLL.printLinkedList(head);

		System.out.print("\n");

		System.out.print("Copied List: ");
		cLLCopy.printLinkedList(copy(head));

	}
}