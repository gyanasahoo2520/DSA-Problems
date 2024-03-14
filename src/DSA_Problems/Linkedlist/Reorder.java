package DSA_Problems.Linkedlist;

public class Reorder extends LL {
    public static Node reverseList(Node node){
        if (node == null) {
            return node;
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

        return prev;
    }
    public static Node middleNode(Node head){
        Node s=head;
        Node f=head;

        while(f!=null && f.next!=null){ // OR while(f.next!=null && f.next.next!=null)
            s=s.next;
            f=f.next.next;
        }
        return s;
    }

    public static void main(String[] args) {
        LL nums=new LL();
        nums.addNode(1);
        nums.addNode(2);
        nums.addNode(3);
        nums.addNode(4);
        nums.addNode(5);
        nums.addNode(6);
        nums.addNode(7);

        reOrderList(nums.head);
        nums.display();

    }
    public static void reOrderList(Node head){
        Node node =head;
        if(node == null && node.next == null){
            return;
        }
        Node mid=middleNode(node);
        Node hs=reverseList(mid);
        Node hf=node;

        while(hf != null && hs != null){
            Node temp=hf.next;
            hf.next=hs;
            hf=temp;

            temp=hs.next;
            hs.next=hf;
            hs=temp;
        }
        if(hf != null){
            hf.next=null;
        }
    }
}
