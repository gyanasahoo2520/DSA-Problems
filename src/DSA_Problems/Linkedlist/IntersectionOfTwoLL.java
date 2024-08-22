package DSA_Problems.Linkedlist;

import java.util.HashMap;
import java.util.HashSet;

public class IntersectionOfTwoLL extends LL{
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

        intersectLL(first,second);
    }

    private static void intersectLL(LL first, LL second) {
        Node f=first.head;
        Node s=second.head;

        HashSet<Integer> set=new HashSet<>();
        while(f!=null){
            set.add(f.data);
            f=f.next;
        }
        LL ans=new LL();
        while(s!=null){
            if(set.contains(s.data)){
                ans.addNode(s.data);
            }
            s=s.next;
        }
        ans.display();
    }
}
