
public class LL1{

	static Node head;

	static class Node{
		int data;
		Node next;

		Node(int data){
			this.data = data;
			this.next = null;
		}
	}

	static int noOfNodes(Node startingPos){
		Node tempHead = startingPos.next;
		int countNode = 1;

		while(tempHead != startingPos){
			++countNode;
			tempHead = tempHead.next;
		}

		return countNode;
	}

	public static void main(String args[]){
		LL1 cLL = new LL1();

		cLL.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node fourth = new Node(4);
		Node fifth = new Node(5);

		head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = head; 

		System.out.println("Number of nodes in circular linked list starting from 3rd node: " + noOfNodes(third));
	}
}