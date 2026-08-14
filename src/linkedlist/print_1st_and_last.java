package linkedlist;

public class print_1st_and_last {

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

    public void addfirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    public void addlast(int data){
        Node newNode=new Node(data);
        tail.next=newNode;
        tail=newNode;
    }

    public void print(){
        if(head==null){
            System.out.println("empty ll");
            return;
        }
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;

        }
        System.out.println("null ");

    }


    public static void main(String[] args) {
            print_1st_and_last ll=new print_1st_and_last();
            ll.print();
            ll.addfirst(2);
            ll.print();
            ll.addfirst(3);
            ll.print();
            ll.addlast(5);
            ll.print();
            ll.addlast(6);
            ll.print();
    }

}
