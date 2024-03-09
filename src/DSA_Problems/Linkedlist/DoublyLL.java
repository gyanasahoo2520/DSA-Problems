package DSA_Problems.Linkedlist;

public class DoublyLL {
    private Node head;
    public  void insertFirst(int val){
        Node node= new Node(val);
        node.next=head;
        node.prev=null;
        if(head != null){
            head.prev=node;
        }
        head=node;
    }

    public void insertLast(int val) {
        Node node = new Node(val);
        Node last = head;

        node.next = null;

        if (head == null) {
            node.prev = null;
            head = node;
            return;
        }

        while (last.next != null) {
            last = last.next;
        }

        last.next = node;
        node.prev = last;
    }
    public Node find(int value){
        Node node=head;
        while (node!=null){
            if(node.val==value){
                return node;
            }
            node=node.next;
        }
        return null;
    }
    public void insert(int after,int val){
        Node p=find(after);
        if(p==null){
            System.out.println("Doesn't Exist");
            return;
        }
        Node node =new Node(val);
        node.next=p.next;
        p.next=node;
        node.prev=p;
        if(node.next != null){
            node.next.prev=node;
        }
    }
    public void display(){
        Node node=head;
        Node last=null;
        while (node != null){
            System.out.print(node.val+"->");
            last=node;
            node=node.next;
        }
        System.out.println("END");

        System.out.println("Print in Reverse order : ");
        while (last != null){
            System.out.print(last.val + "->");
            last=last.prev;
        }
        System.out.println("START");
    }
    private class Node{
        int val;
        Node prev;
        Node next;

        public Node(int val){
            this.val=val;
        }
        public Node(int val,Node next,Node prev){
            this.val=val;
            this.next=next;
            this.prev=prev;
        }
    }

    public static void main(String[] args) {
        DoublyLL list=new DoublyLL();
        list.insertFirst(50);
        list.insertFirst(40);
        list.insertFirst(30);
        list.insertFirst(20);
        list.insertFirst(10);
        list.insertLast(60);

        list.insert(60,70);
        list.insert(10,5);
        list.display();
    }
}
