package DSA_Problems.Linkedlist;

public class Order0s1s2s extends LL {
    public static void assemble(Node head){
        Node temp=head;
        int cnt0=0,cnt1=0,cnt2=0;
        while(temp != null){
            if(temp.data==0)
                cnt0++;
            if(temp.data==1)
                cnt1++;
            if(temp.data==2)
                cnt2++;
            temp=temp.next;
        }
        temp=head;
        while (temp != null){
            if(cnt0 !=0){
                temp.data=0;
                cnt0--;
            }
            else if(cnt1 !=0){
                temp.data=1;
                cnt1--;
            }
            else{
                temp.data=2;
                cnt2--;
            }
            temp=temp.next;
        }

    }
    public static void main(String[] args) {
        LL num=new LL();
        num.addNode(0);
        num.addNode(1);
        num.addNode(0);
        num.addNode(2);
        num.addNode(2);
        num.addNode(1);
        num.addNode(0);
        num.addNode(0);
        assemble(num.head);
        num.display();
    }
}
