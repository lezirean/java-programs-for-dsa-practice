/*
    Traversal: To traverse all the nodes one after another. Bale parang print. 
    Insertion: To add a node at the given position.
    Deletion: To delete a node.
    Searching: To search an element(s) by value.
    Updating: To update a node.
    Sorting: To arrange nodes in a linked list in a specific order.
    Merging: To merge two linked lists into one.
*/
import java.util.*;
class LinkedList{

    Node head;

    static class Node{
        int data;
        Node next;

        Node(int d){
            this.data = d;
            this.next = null;
        }
    }

    public void insertFront(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        return;
    }

    public void insertAfter(Node prevNode, int data){
        if(prevNode == null){
            System.out.println("Error: previous node is null");
            return;
        }

        Node newNode = new Node(data);
        newNode.next = prevNode.next;
        prevNode.next = newNode;

        return;
    }

    public void insertEnd(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        newNode.next = null;
        Node end = head;

        while(end != null){
            end = end.next;
        }

        end.next = newNode;
        return;
    }

    public void deleteNode(int pos){ // pwede ring take in yung data, then hanapin sa hold.data
        if(head == null) return;

        Node hold = head; 
        if(pos == 0){
            head = head.next;
            return;
        }

        // find the node to be deleted
        for(int i = 0; hold != null && i < pos - 1; ++i) hold = hold.next;

        if(hold == null) return; // or hold.next == null, kapag hindi nahanap yung pos

        hold.next = hold.next.next;
        return;
    }

    public void printLinkedList(Node a){
        // Node n = head;
        Node n = a;

        while(n != null){
            System.out.print(n.data + " ");
            n = n.next;
        }
    }

    public static void main(String[] args){
        LinkedList linkList = new LinkedList();

        linkList.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        linkList.head.next = second;
        second.next = third;
        third.next = null;
        //second.next = third;

        linkList.printLinkedList(linkList.head);
    }
}

// class ListSortExample
// {
//     static class Node
//     { int val; Node next;
//     Node(int v, Node t) { val = v; next = t; }
//     }

//     static Node create()
//     { Node a = new Node(0, null);
//     for (In.init(); !In.empty(); )
//     a.next = new Node(In.getInt(), a.next);
//     return a;
//     }

//     static Node sort(Node a)
//     { Node t, u, x, b = new Node(0, null);
//     while (a.next != null)
//     {
//     t = a.next; u = t.next; a.next = u;
//     for (x = b; x.next != null; x = x.next)
//     if (x.next.val > t.val) break;
//     t.next = x.next; x.next = t;
//     }
//     return b;
//     }

// static void print(Node h)
// { for (Node t = h.next; t != null; t = t.next)
// Out.println(t.val + ""); }
// public static void main(String[] args)
// { print(sort(create())); }
// }
