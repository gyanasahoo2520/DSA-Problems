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
    public static Node reverse2(Node node){
        if (node == null) {
            return head;
        }
        Node prev = null;
        Node present = node;
        Node next = present.next;

        while (present != null) {
            present.next = prev;
            prev = present;
            present = next;
            if (next != null) {
                next = next.next;
            }
        }
        head=prev;
        return head;
    }
    public static Node middleNode(Node head){
        Node s=head;
        Node f=head;

        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
        }
        return s;
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
//        reverse1(head);
        Node ans=middleNode(head);
        System.out.println(ans.data);
        reverse1(ans);
        list.display();
    }
}
