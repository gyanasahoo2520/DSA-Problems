package DSA_Problems.String;

public class RemoveCharExceptAlph {
    public static void main(String[] args) {
        String str = "take12% *&u ^$#forward";
        int n = str.length();

        System.out.print("Resultant string: ");
//        System.out.println(remove(str, n));
        remove1(str,n);
    }

    private static String remove(String str, int n) {
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<n;i++){
            int ascii=(int)str.charAt(i);
            if ((ascii >= 65 && ascii <= 90) || (ascii >= 97 && ascii <= 122)) // if alphabets
                sb.append(str.charAt(i));
        }
        return sb.toString();
    }

//    Method-3
    private static void remove1(String str, int n) {
        char[] s = str.toCharArray();
        int j = 0;
        for (int i = 0; i < s.length; i++) {

            // Store only valid characters
            if ((s[i] >= 'A' && s[i] <= 'Z')
                    || (s[i] >= 'a' && s[i] <= 'z')) {
                s[j] = s[i];
                j++;
            }
        }
        System.out.println(String.valueOf(s).substring(0, j));
    }

}
