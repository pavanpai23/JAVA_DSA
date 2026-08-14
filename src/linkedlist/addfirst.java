package linkedlist;

public class addfirst {

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

    public void add(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    public static void main(String[] args) {
        addfirst ll=new addfirst();
        ll.add(1);
        ll.add(2);

    }
}
