package DSA_Problems.String;

public class RemoveVowels {
    public static void main(String[] args) {
        String str = "GeeeksforGeeks - A Computer Science Portal for Geeks";
//        System.out.println(remVowel(str));
//        remVowel1(str);
        System.out.println(remVowel2(str));
    }

    private static String remVowel(String str) {
        return str.replaceAll("[aeiouAEIOU]","");
    }

    private static void remVowel1(String s) {
        for (int i=0;i<s.length();i++){
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e'
                    || s.charAt(i) == 'i' || s.charAt(i) == 'o'
                    || s.charAt(i) == 'u' || s.charAt(i) == 'A'
                    || s.charAt(i) == 'E' || s.charAt(i) == 'I'
                    || s.charAt(i) == 'O'
                    || s.charAt(i) == 'U'){
                continue;
            }
            else
                System.out.print(s.charAt(i));
        }
    }
    private static String remVowel2(String s){
        for (int i=0;i<s.length();i++){
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u' || s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I'|| s.charAt(i) == 'O' || s.charAt(i) == 'U'){
                s=s.substring(0,i)+s.substring(i+1);
                i--;
            }
        }
        return s;
    }
}
