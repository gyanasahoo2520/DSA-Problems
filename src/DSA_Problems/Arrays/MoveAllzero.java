package DSA_Problems.Arrays;
// Move all zero to the end of the array
public class MoveAllzero {
    static void moveZero(int[] a){
        int n=a.length;
        int j=-1;
        for (int i=0;i<n;i++){
            if(a[i]==0){
                j=i;
                break;
            }
        }
        for(int i=j+1;i<n;i++){
            if(a[i]!=0){
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                j++;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={12,4,0,5,46,0,8,0,0,5,0,5,4,0};
        moveZero(arr);
        System.out.println("After Moving all zero :");
        for (int i:arr){
            System.out.print(i+" ");
        }
    }
}
