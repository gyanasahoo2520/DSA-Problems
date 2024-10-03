package DSA_Problems.String;

public class RemoveBracketsFromMathExpression {
    public static void main(String[] args) {
        String s = "(a+b)=c";
        System.out.println("Expression without brackets : "+removeBraces(s));
//        System.out.println("Expression without brackets : "+removeBraces1(s));
    }

//    Method 1
    private static String removeBraces(String s) {
        return s.replaceAll("[(){}]","");
    }

//    Method 2
    private static String removeBraces1(String s) {
        StringBuilder ans=new StringBuilder("");
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch!='(' && ch!=')')
                ans.append(ch);
        }
        return ans.toString();
    }

}
