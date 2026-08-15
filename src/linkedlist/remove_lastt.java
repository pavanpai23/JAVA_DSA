package linkedlist;

public class remove_lastt {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // Add first
    public void addfirst(int data) {
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    // Add last
    public void addlast(int data) {
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    // Print linked list
    public void print() {
        if (head == null) {
            System.out.println("empty ll");
            return;
        }

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }

        System.out.println("null");
    }

    // Remove first
    public int removefirst() {

        if (size == 0) {
            System.out.println("empty");
            return Integer.MIN_VALUE;
        }

        // If only one node
        if (size == 1) {
            int val = head.data;

            head = tail = null;
            size = 0;

            return val;
        }

        int val = head.data;

        head = head.next;
        size--;

        return val;
    }

    // Remove last
    public int remove_last() {

        if (size == 0) {
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }

        // If only one node
        if (size == 1) {
            int val = head.data;

            head = tail = null;
            size = 0;

            return val;
        }

        // Find second-last node
        Node prev = head;

        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }

        int val = prev.next.data;

        prev.next = null;
        tail = prev;

        size--;

        return val;
    }

    // Main method
    public static void main(String[] args) {

        remove_lastt ll = new remove_lastt();

        ll.addfirst(2);
        ll.addfirst(3);
        ll.addlast(5);
        ll.addlast(6);

        System.out.println("Original linked list:");
        ll.print();
        System.out.println("Size = " + ll.size);

        System.out.println("\nAfter removing first:");
        int removedFirst = ll.removefirst();
        System.out.println("Removed: " + removedFirst);
        ll.print();
        System.out.println("Size = " + ll.size);

        System.out.println("\nAfter removing last:");
        int removedLast = ll.remove_last();
        System.out.println("Removed: " + removedLast);
        ll.print();
        System.out.println("Size = " + ll.size);
    }
}