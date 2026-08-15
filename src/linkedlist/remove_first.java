package linkedlist;

public class remove_first {
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
    public static int size;

    public void addfirst(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    public void addlast(int data){
        Node newNode=new Node(data);
        size++;
        tail.next=newNode;
        tail=newNode;
    }

    public void print(){
        if(head==null){
            System.out.println("empty ll");
            return;
        }
        Node temp=head;
        size++;
        while (temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;

        }
        System.out.println("null ");

    }

    //remove first
    public int removefirs(){
        if(size==0){
            System.out.println("empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }


    public static void main(String[] args) {

        remove_first ll=new remove_first();
        ll.addfirst(2);
        ll.addfirst(3);
        ll.addlast(5);
        ll.addlast(6);


        ll.print();
        System.out.println(size);

        ll.removefirs();
        ll.print();
        System.out.println(size);
    }

}


