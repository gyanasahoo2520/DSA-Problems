package DSA_Problems.Arrays;
//Left Rotation of the array by K place

public class Leftrotation2 {
    static void reverse(int[] arr,int sp,int ep){
        while(sp<ep) {
            int temp = arr[sp];
            arr[sp] = arr[ep];
            arr[ep] = temp;
            sp++;
            ep--;
        }
    }
    static void leftrotate(int arr[],int n,int k){
        if(n==0) return;
        int d=k%n;
        reverse(arr,0,d-1);
        reverse(arr,d,n-1 );
        reverse(arr,0,n-1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int n=arr.length;
        int k=3;
        System.out.println("Before Rotation");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        leftrotate(arr,n,k);
        System.out.println("After Left-Rotation");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
}
