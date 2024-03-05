package DSA_Problems.String;

import java.util.ArrayList;

public class DiceRoll {
    public static void main(String[] args) {
//        dice("",4);
        System.out.println(diceReturn("",4));
    }
    static void dice(String p, int target){
        if(target==0){
            System.out.println(p);
            return;
        }
        for (int i = 1; i <= 6 && i<=target; i++) {
            dice(p+i,target-i);
        }
    }

    static ArrayList<String> diceReturn(String p, int target){
        if(target==0){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans=new ArrayList<>();
        for (int i = 1; i <= 6 && i<=target; i++) {
            ans.addAll(diceReturn(p+i,target-i));
        }
        return ans;
    }
}
