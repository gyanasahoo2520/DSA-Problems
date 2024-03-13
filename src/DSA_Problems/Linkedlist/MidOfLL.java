package DSA_Problems.Linkedlist;

public class MidOfLL extends LL{
    public static void middleNode(Node head){
        Node s=head;
        Node f=head;

        while(f!=null && f.next!=null){ // OR while(f.next!=null && f.next.next!=null)
            s=s.next;
            f=f.next.next;
        }
        System.out.println(s.data);
    }

    public static void main(String[] args) {
        LL numbs=new LL();
        numbs.addNode(2);
        numbs.addNode(7);
        numbs.addNode(5);
        numbs.addNode(1);
        numbs.addNode(8);
        middleNode(head);
    }
}
