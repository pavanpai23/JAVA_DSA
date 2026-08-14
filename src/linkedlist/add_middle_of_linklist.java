package linkedlist;

public class add_middle_of_linklist {
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


    //add middle
    public void middle(int index,int data){
    Node newNode=new Node(data);
    Node temp=head;
    int i=0;
    while(i<index-1) {
        temp = temp.next;
        i++;
    }
    newNode.next=temp.next;
    temp.next=newNode;
    }

    public static void main(String[] args) {

        add_middle_of_linklist ll=new add_middle_of_linklist();
        ll.addfirst(2);
        ll.addfirst(3);
        ll.addlast(5);
        ll.addlast(6);
        ll.middle(2, 9);
        ll.print();
        System.out.println(size);
    }

}
