package DSA_Problems.Linkedlist;

public class FindDuplicate{
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

    public Node head;
    public Node tail;

    public void insertNode(int data){
        Node temp=new Node(data);
        if(head==null){
            head=temp;
            tail=temp;
        }else{
            tail.next=temp;
            tail=temp;
        }
    }

    public void removeDuplicate(){
        if(head==null){
            return;
        }
        Node node=head;
        while(node.next!=null){
            if(node.data==node.next.data){
                node.next=node.next.next;
            }else {
                node=node.next;
            }
        }
        tail=node;
        tail.next=null;
    }
    public void display(){
        Node temp=head;
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        while(temp!=null){
            System.out.print(temp.data + "->");
            temp=temp.next;
        }
        System.out.println("END");
    }

    public static void main(String[] args) {
        FindDuplicate llist=new FindDuplicate();
        llist.insertNode(1);
        llist.insertNode(4);
        llist.insertNode(7);
        llist.insertNode(7);
        llist.insertNode(8);

        llist.display();
        llist.removeDuplicate();
        llist.display();
    }
}
