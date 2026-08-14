package linkedlist;

public class addlast {

    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addllllast(int data){
        Node newNode=new Node(data);
        tail.next=newNode;
        tail=newNode;
    }

    public static void main(String[] args) {
        addlast ll=new addlast();
        ll.addllllast(5);
        ll.addllllast(6);

    }
}
