package DSA_Problems.String;

import java.util.Arrays;

public class ReplaceAllWhitespace {
    public static void main(String[] args) {
        String str="Geeks For    Geeks";
//        Method 1
//        str=str.replaceAll("\\s","");
//        System.out.println(str);

//        Method 2
//        char[] ch = str.toCharArray();
//        StringBuffer sb = new StringBuffer();
//
//
//        for (int i = 0; i < ch.length; i++) {
//            if( (ch[i] != ' ') && (ch[i]!= '\t' )) {
//                sb.append(ch[i]);
//            }
//        }
//        System.out.println("String after removing spaces : "+sb);

//        Method - 3

        StringBuffer sb=new StringBuffer();
        String[] s1 = str.split("[\\s]");
        for (String string : s1) {
            sb.append(string);
        }
        System.out.println(sb);
    }
}
