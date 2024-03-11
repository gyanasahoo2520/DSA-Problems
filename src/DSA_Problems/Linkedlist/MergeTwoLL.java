package DSA_Problems.Linkedlist;
//Merge two sorted LinkedList

public class MergeTwoLL extends LL{
    public static LL mergeLL(LL first,LL second){
        Node f=first.head;
        Node s=second.head;

        LL ans = new LL();
        while(f!=null && s!=null){
            if(f.data < s.data){
                ans.addNode(f.data);
                f=f.next;
            }else{
                ans.addNode(s.data);
                s=s.next;
            }
        }
        while(f!=null){
            ans.addNode(f.data);
            f=f.next;
        }
        while(s!=null){
            ans.addNode(s.data);
            s=s.next;
        }
        return ans;
    }
    public static void main(String[] args) {
        LL first=new LL();
        first.addNode(1);
        first.addNode(4);
        first.addNode(5);
        first.addNode(7);

        LL second=new LL();
        second.addNode(2);
        second.addNode(4);
        second.addNode(5);
        second.addNode(8);

        LL ans=new LL();
        ans=mergeLL(first,second);
        ans.display();
    }
}
