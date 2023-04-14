class QNode {
	char key;
	QNode next;

	public QNode(char key){
		this.key = key;
		this.next = null;
	}
}

class Queue {
	QNode front, rear;

	public Queue(){
		this.front = this.rear = null;
	}

	void enqueue(char key){
		QNode temp = new QNode(key);

		if (this.rear == null){
			this.front = this.rear = temp;
			return;
		}

		this.rear.next = temp;
		this.rear = temp;
	}

	char dequeue(){
		if (this.front == null)
			return '0';

		QNode temp = this.front;
		this.front = this.front.next;


		if (this.front == null)
			this.rear = null;

		return temp.key;
	}
}


public class SQ5 {
	public static void main(String[] args){
		Queue q = new Queue();
		q.enqueue('E');
		q.enqueue('A');
		q.enqueue('S');
		System.out.println(q.dequeue());
		q.enqueue('Y');
		System.out.println(q.dequeue());
		q.enqueue('Q');
		q.enqueue('U');
		q.enqueue('E');
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		q.enqueue('S');
		q.enqueue('T');
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		q.enqueue('I');
		q.enqueue('O');
		System.out.println(q.dequeue());
		q.enqueue('N');
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
	}
}

