package DSA_Problems.Arrays;
// Left Rotation of array by one place

public class Leftrotation1 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println("Before Rotation");
        for(int i:arr)
            System.out.print(i+" ");
        int n=arr.length;
        int temp=arr[0];
        for (int i=1;i<n;i++){
            arr[i-1]=arr[i];
        }
        arr[n-1]=temp;
        System.out.println();
        System.out.println("After Rotation");
        for (int i=0;i<n;i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
