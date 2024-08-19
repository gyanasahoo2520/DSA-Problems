package DSA_Problems.String;

public class ReverseStr {
    public static void main(String[] args) {
        String name="javatpoint";
        String temp="";
        for(int i=0;i<name.length();i++){
            temp=name.charAt(i)+temp;
        }
        System.out.println(temp);
    }
}
