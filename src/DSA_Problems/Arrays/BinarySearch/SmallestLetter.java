package DSA_Problems.Arrays.BinarySearch;

public class SmallestLetter {
    public static void main(String[] args) {
        char[] letter={'c','d','f','j'};
        char target='u';
        char ans=nextGreatestLetter(letter,target);
        System.out.println(ans);
    }
    static char nextGreatestLetter(char[] letter,char target){
        int start=0;
        int end=letter.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<letter[mid]){
                end=mid-1;
            }else {
                start=mid+1;
            }

        }
        return letter[start % letter.length];
    }
}
