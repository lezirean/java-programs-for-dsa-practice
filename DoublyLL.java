import java.util.*;

// A complete working Java program to demonstrate all

// Class for Doubly Linked List
public class DoublyLL {
	Node head; // head of list

	/* Doubly Linked list Node*/
	class Node {
		int data;
		Node prev;
		Node next;

		// Constructor to create a new node
		// next and prev is by default initialized as null
		Node(int d) { data = d; }
	}

	// Adding a node at the front of the list
	public void push(int new_data){
		/* 1. allocate node
		* 2. put in the data */
		Node new_Node = new Node(new_data);

		/* 3. Make next of new node as head and previous as NULL */
		new_Node.next = head;
		new_Node.prev = null;

		/* 4. change prev of head node to new node */
		if (head != null)
			head.prev = new_Node;

		/* 5. move the head to point to the new node */
		head = new_Node;
	}

	// Add a node before the given node
	public void InsertBefore(Node next_node, int new_data){
		/*Check if the given nx_node is NULL*/
		if(next_node == null)
		{
			System.out.println("The given next node can not be NULL");
			return;
		}
		
		//Allocate node, put in the data
		Node new_node = new Node(new_data);
		
		//Making prev of new node as prev of next node
		new_node.prev = next_node.prev;
		
		//Making prev of next node as new node
		next_node.prev = new_node;
		
		//Making next of new node as next node
		new_node.next = next_node;
		
		//Check if new node is added as head
		if(new_node.prev != null)
			new_node.prev.next = new_node;
		else
			head = new_node;
	}

	/* Given a node as prev_node, insert
	a new node after the given node */
	public void InsertAfter(Node prev_Node, int new_data){

		/*1. check if the given prev_node is NULL */
		if (prev_Node == null) {
			System.out.println("The given previous node cannot be NULL ");
			return;
		}

		/* 2. allocate node
		* 3. put in the data */
		Node new_node = new Node(new_data);

		/* 4. Make next of new node as next of prev_node */
		new_node.next = prev_Node.next;

		/* 5. Make the next of prev_node as new_node */
		prev_Node.next = new_node;

		/* 6. Make prev_node as previous of new_node */
		new_node.prev = prev_Node;

		/* 7. Change previous of new_node's next node */
		if (new_node.next != null)
			new_node.next.prev = new_node;
	}

	// Add a node at the end of the list
	void append(int new_data){
		/* 1. allocate node
		* 2. put in the data */
		Node new_node = new Node(new_data);

		Node last = head; /* used in step 5*/

		/* 3. This new node is going to be the last node, so
		* make next of it as NULL*/
		new_node.next = null;

		/* 4. If the Linked List is empty, then make the new
		* node as head */
		if (head == null) {
			new_node.prev = null;
			head = new_node;
			return;
		}

		/* 5. Else traverse till the last node */
		while (last.next != null)
			last = last.next;

		/* 6. Change the next of last node */
		last.next = new_node;

		/* 7. Make last node as previous of new node */
		new_node.prev = last;
	}

	// This function prints contents of
	// linked list starting from the given node
	public void printlist(Node node){
		Node last = null;
		System.out.println("Traversal in forward Direction");
		while (node != null) {
			System.out.print(node.data + " ");
			last = node;
			node = node.next;
		}
		System.out.println();
		System.out.println("Traversal in reverse direction");
		while (last != null) {
			System.out.print(last.data + " ");
			last = last.prev;
		}
	}

	// Function to delete a node in a Doubly Linked List.
    // head_ref --> pointer to head node pointer.
    // del --> data of node to be deleted.
    void deleteNode(Node del){
 
        // Base case
        if (head == null || del == null) {
            return;
        }
 
        // If node to be deleted is head node
        if (head == del) {
            head = del.next;
        }
 
        // Change next only if node to be deleted
        // is NOT the last node
        if (del.next != null) {
            del.next.prev = del.prev;
        }
 
        // Change prev only if node to be deleted
        // is NOT the first node
        if (del.prev != null) {
            del.prev.next = del.next;
        }
 
        // Finally, free the memory occupied by del
        return;
    }

     // Function to delete a node
    // in a Doubly Linked List.
    // head_ref --> pointer to head node pointer.
    // del --> pointer to node to be deleted.
    static Node deleteNode(Node del){
        // base case
        if (head == null || del == null)
            return null;
 
        // If node to be deleted is head node
        if (head == del)
            head = del.next;
 
        // Change next only if node to be
        // deleted is NOT the last node
        if (del.next != null)
            del.next.prev = del.prev;
 
        // Change prev only if node to be
        // deleted is NOT the first node
        if (del.prev != null)
            del.prev.next = del.next;
 
        del = null;
 
        return head;
    }

    // Function to delete the node at the
    // given position in the doubly linked list
    static void deleteNodeAtGivenPos(int n){ // alisin na ung static since may object naman ng DoublyLL class
        /* if list in NULL or
          invalid position is given */
        if (head == null || n <= 0)
            return;
 
        Node current = head;
        int i;
 
        /*
        * traverse up to the node at
          position 'n' from the beginning
        */
        for (i = 1; current != null && i < n; i++)
        {
            current = current.next;
        }
         
        // if 'n' is greater than the number of nodes
        // in the doubly linked list
        if (current == null) return;
 
        // delete the node pointed to by 'current'
        deleteNode(current);
    }

	/* Driver program to test above functions*/
	public static void main(String[] args){
		/* Start with the empty list */
		DoublyLL dll = new DoublyLL();

		// Insert 6. So linked list becomes 6->NULL
		dll.append(6);

		// Insert 7 at the beginning. So
		// linked list becomes 7->6->NULL
		dll.push(7);

		// Insert 1 at the beginning. So
		// linked list becomes 1->7->6->NULL
		dll.push(1);

		// Insert 4 at the end. So linked
		// list becomes 1->7->6->4->NULL
		dll.append(4);

		// Insert 8, after 7. So linked
		// list becomes 1->7->8->6->4->NULL
		dll.InsertAfter(dll.head.next, 8);
	
		// Insert 5, before 8.So linked
		// list becomes 1->7->5->8->6->4
		dll.InsertBefore(dll.head.next.next, 5);

		System.out.println("Created DLL is: ");
		dll.printlist(dll.head);

		/* DRIVER CODE FOR DELETE NODE
		// Start with the empty list
        DLL dll = new DLL();
 
        // Insert 2. So linked list becomes 2->NULL
        dll.push(2);
 
        // Insert 4. So linked list becomes 4->2->NULL
        dll.push(4);
 
        // Insert 8. So linked list becomes 8->4->2->NULL
        dll.push(8);
 
        // Insert 10. So linked list becomes 10->8->4->2->NULL
        dll.push(10);
 
        System.out.print("Created DLL is: ");
        dll.printlist(dll.head);
 
        // Deleting first node
        dll.deleteNode(dll.head);
 
        // List after deleting first node
        // 8->4->2
        System.out.print("\nList after deleting first node: ");
        dll.printlist(dll.head);
 
        // Deleting middle node from 8->4->2
        dll.deleteNode(dll.head.next);
 
        System.out.print("\nList after Deleting middle node: ");
        dll.printlist(dll.head);

		*/

		/* DRIVER CODE FOR DELETING A NODE
	    // Create the doubly linked list:
        // 10<->8<->4<->2<->5
 
        push(5);
        push(2);
        push(4);
        push(8);
        push(10);
 
        System.out.println("Doubly linked "
                           +"list before deletion:");
        printList();
 
        int n = 2;
         
        // delete node at the given position 'n'
        deleteNodeAtGivenPos(n);
        System.out.println("Doubly linked "
                           +"list after deletion:");
        printList();
		*/
	}
}

