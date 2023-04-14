class Queue {
	private static int front, rear, capacity;
	private static int queue[];

	Queue(int c){
		front = rear = 0;
		capacity = c;
		queue = new int[capacity];
	}

	static void queueEnqueue(int data){
		if (capacity == rear) {
			System.out.printf("\nQueue is full\n");
			return;
		}
		else {
			queue[rear] = data;
			rear++;
		}
		return;
	}

	static void queueDequeue(){
		if (front == rear) {
			System.out.printf("\nQueue is empty\n");
			return;
		}
		else {
			for (int i = 0; i < rear - 1; i++) {
				queue[i] = queue[i + 1];
			}	
			if (rear < capacity)
				queue[rear] = 0;

			rear--;
		}
		return;
	}

	static void queueDisplay(){
		int i;
		if (front == rear) {
			System.out.print("\nQueue is Empty\n");
			return;
		}

		System.out.print("\n");

		for (i = front; i < rear; i++) {
			System.out.printf(" %d <-- ", queue[i]);
		}
		return;
	}

	static void queueFront(){
		if (front == rear) {
			System.out.printf("\nQueue is Empty\n");
			return;
		}
		System.out.printf("\nFront Element is: %d", queue[front]);
		return;
	}
}

public class SQ7{
	public static void main(String[] args){
		Queue q = new Queue(5);
		
		int min = 1;  
		int max = 99; 

	  	for(int i = 1; i <= 5; ++i){
			int b = (int)(Math.random() * (max - min + 1) + min);  
			q.queueEnqueue(b);
	  	}

	  	System.out.print("The queue: "); 
	  	q.queueDisplay();

	  	for(int i = 1; i <= 5; ++i){
			q.queueDequeue();
			q.queueDisplay();
	  	}
	
	}
}



