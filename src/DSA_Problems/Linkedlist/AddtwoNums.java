package DSA_Problems.Linkedlist;

public class AddtwoNums extends LL {
    public static Node addTwoNumbs(Node l1, Node l2){
        Node dummy=new Node(-1);
        Node temp=dummy;
        int carry=0;
        while(l1 != null || l2 != null){
            int sum=0;
            if(l1 != null){
                sum+=l1.data;
                l1=l1.next;
            }
            if(l2 != null){
                sum+=l2.data;
                l2=l2.next;
            }
            sum+=carry;
            carry=sum/10;
            Node node = new Node(sum%10);
            temp.next=node;
            temp=temp.next;
        }
        if(carry != 0){
            Node node=new Node(carry);
            temp.next=node;
        }
        return dummy.next;
    }
    public static void main(String[] args) {
        LL n1=new LL();
        n1.addNode(3);
        n1.addNode(5);
        LL n2=new LL();
        System.out.println();
        n2.addNode(4);
        n2.addNode(5);
        n2.addNode(9);
        n2.addNode(9);
        Node ans= addTwoNumbs(n1.head,n2.head);
        while(ans!=null){
            System.out.print(ans.data+"->");
            ans=ans.next;
        }

    }
}
