package DSA_Problems.String;

public class Count_space_vowel_consonant {
    public static void main(String[] args) {
        String str="Geeks For Geeks";
        int len=str.length();
        countAll(str,len);
    }

    private static void countAll(String s, int l) {
        int vowl=0,space=0,cons=0;
        s=s.toLowerCase();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                vowl++;
            else if(ch>='a' && ch<='z')
                cons++;
            else if(ch==' ' || ch=='\t')
                space++;
        }
        System.out.println("Vowels: " + vowl);
        System.out.println("Consonants: " + cons);
        System.out.println("White spaces: " + space);
    }
}
