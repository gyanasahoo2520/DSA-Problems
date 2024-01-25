package DSA_Problems.Arrays;

public class SecondSmallest {
    static int secSmall(int[] a,int n){
        if(n<2){
            return  -1;
        }
        int small=a[0];
        int second_small=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(a[i]<small){
                second_small=small;
                small=a[i];
            }
            else if(a[i]>small && a[i]<second_small){
                second_small=a[i];
            }
        }
        return second_small;
    }
    public static void main(String[] args) {
        int arr[]={1,5,3,7,8,25,45};
        int n=arr.length;
        int min=secSmall(arr,n);
        System.out.print("Second Smallest : "+min);
    }
}
