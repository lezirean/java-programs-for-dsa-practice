
public class TR4{

    static Node head;

    static class Node{
        int data;
        Node next, prev;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static Node reverse(Node first) {
        if (first == null || first.next == null) return first;
        Node second = first.next;
        Node rest = reverse(second);
        second.next = first;
        first.next  = null;
        return rest;
    }

    static void printLinkedList(Node startNodePrint){
        Node n = startNodePrint;

        while(n != null){
            System.out.print(n.data + " ");
            n = n.next;
        }
    }

    public static void main(String args[]){
        TR4 cLL = new TR4();

        cLL.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);

        head.next = second; //head.prev = null;
        second.next = third; //second.prev = head;
        third.next = fourth; //third.prev = second;
        fourth.next = fifth; //fourth.prev = third;
        fifth.next = null;  //fifth.prev = fourth;

        Node newHead = reverse(head);

        printLinkedList(newHead);

    }
}