package DSA_Problems.Linkedlist;

public class LL {
    class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addNode(int data){
        Node temp=new Node(data);
        if(head==null){
            head=temp;
            tail=temp;
        }else{
            tail.next=temp;
            tail=temp;
        }
    }
    public void display(){
        Node temp = head;
        if(head==null){
            System.out.println("List is Empty");
            return;
        }
        while(temp != null){
            System.out.print(temp.data +"->");
            temp=temp.next;
        }
        System.out.println("END");
    }

}
