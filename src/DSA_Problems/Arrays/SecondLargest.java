package DSA_Problems.Arrays;

import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Size of array : ");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("Enter the values :");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int SLaregest=secondlargest(arr,n);
        System.out.println("Second Largest is : "+SLaregest);
    }
    public static int secondlargest(int[] a,int n){
        int largest=a[0];
        int slargest=-1;
        for(int i=1;i<n;i++){
            if(a[i]>largest){
                slargest=largest;
                largest=a[i];
            }
            else if(a[i]<largest && a[i]>slargest){
                slargest=a[i];
            }
        }
        return slargest;
    }
}
