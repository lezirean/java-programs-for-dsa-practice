import java.util.*;

class SQ6{
	static class Node{
		char data;
		Node prev, next;

		static Node getnode(char data){
		Node newNode = new Node();
		newNode.data = data;
		newNode.prev = newNode.next = null;
		return newNode;
		}
	}

	static class Deque {
		Node front;
		Node rear;
		int Size;

		Deque(){
			front = rear = null;
			Size = 0;
		}

		boolean isEmpty() { return (front == null); }

		int size() { return Size; }

		void insertFront(char data){
			Node newNode = Node.getnode(data);

			if (newNode == null)
				System.out.print("OverFlow\n");
			else {
				if (front == null)
					rear = front = newNode;
				else {
					newNode.next = front;
					front.prev = newNode;
					front = newNode;
				}

				Size++;
			}
		}

		void insertRear(char data){
			Node newNode = Node.getnode(data);

			if (newNode == null)
				System.out.print("OverFlow\n");
			else {
				if (rear == null)
					front = rear = newNode;
				else {
					newNode.prev = rear;
					rear.next = newNode;
					rear = newNode;
				}

				Size++;
			}
		}

		void deleteFront(){

			if (isEmpty())
				System.out.print("UnderFlow\n");
			else {
				Node temp = front;
				front = front.next;

				if (front == null)
					rear = null;
				else
					front.prev = null;

				Size--;
			}
		}

		void deleteRear(){

			if (isEmpty())
				System.out.print("UnderFlow\n");
			else {
				Node temp = rear;
				rear = rear.prev;

				if (rear == null)
					front = null;
				else
					rear.next = null;

				Size--;
			}
		}

		char getFront(){
			if (isEmpty())
				return '0';
			return front.data;
		}

		char getRear(){
			if (isEmpty())
				return '0';
			return rear.data;
		}

		void erase(){
			rear = null;
			while (front != null) {
				Node temp = front;
				front = front.next;
			}
			Size = 0;
		}
	}

	public static void main(String[] args){
		Deque dq = new Deque();
		dq.insertFront('E');
		dq.insertFront('A');
		dq.insertRear('s');
		System.out.println(dq.getFront());
		dq.insertFront('Y');
		System.out.println(dq.getFront());
		dq.insertFront('Q');
		dq.insertFront('U');
		dq.insertFront('E');
		System.out.println(dq.getRear());
		System.out.println(dq.getRear());
		System.out.println(dq.getFront());
		dq.insertRear('s');
		dq.insertRear('t');
		System.out.println(dq.getFront());
		System.out.println(dq.getRear());
		System.out.println(dq.getFront());
		dq.insertFront('I');
		dq.insertFront('O');
		System.out.println(dq.getRear());
		dq.insertRear('n');
		System.out.println(dq.getFront());
		System.out.println(dq.getFront());
		System.out.println(dq.getRear());
	}
}

