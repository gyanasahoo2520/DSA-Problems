package DSA_Problems.Linkedlist;

public class ReverseLL extends LL{
    public static void reverseLL(Node node){
        if(node==tail){
            head=tail;
            return;
        }
        reverseLL(node.next);
        tail.next=node;
        tail=node;
        tail.next=null;
    }
    public static void reverse1(Node node){

        Node curr=node;
        Node prev=null;
        while(curr != null){
            Node curr1=curr.next;
            curr.next=prev;
            prev=curr;
            curr=curr1;
        }
        head=prev;
    }
    public static void main(String[] args) {
        LL list=new LL();
        list.addNode(5);
        list.addNode(4);
        list.addNode(3);
        list.addNode(2);
        list.addNode(1);

        list.display();
//        reverseLL(head);
        reverse1(head);
        list.display();
    }
}
