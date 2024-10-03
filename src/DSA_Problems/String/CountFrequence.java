package DSA_Problems.String;

import java.util.HashMap;

public class CountFrequence {
    public static void main(String[] args) {
        String str = "geeksforgeeks";

        HashMap<Character,Integer> map = new HashMap<>();

        for (int i = 0; i <str.length() ; i++) {

            char ch = str.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else{
                map.put(ch,1);
            }

        }
        for (int i = 0; i <str.length() ; i++) {

            char ch = str.charAt(i);

            if(map.get(ch)!=0){
                System.out.print(ch );
                System.out.print( map.get(ch) +" ");
                map.put(ch,0);
            }
        }
    }
}
