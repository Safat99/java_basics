public class MyLinkedList {

    Node head;

    class Node {

        int data;
        Node next;

        Node(int data) { // creation of a node
            this.data = data;
            next = null;
        }
    }

    public void printMyLinkedList() {

        Node n = head;
        while (n != null) {
            System.out.println(n.data);
            n = n.next;
        }
    }


    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList();

        Node first = ll.new Node(10);
        System.out.println("first Node data: " + first.data);
        ll.head = first;

        Node second = ll.new Node(20);
        first.next = second;


        Node third = ll.new Node(30);
        second.next = third;

        // System.out.println(first.next.next.data);

        ll.printMyLinkedList();
    }
}