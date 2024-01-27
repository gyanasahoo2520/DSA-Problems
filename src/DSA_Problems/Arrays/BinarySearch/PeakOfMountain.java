package DSA_Problems.Arrays.BinarySearch;

public class PeakOfMountain {
    public static void main(String[] args) {
        int[] arr={1,2,3,5,6,4,3,2};
        int ans=peakIndexOfMountain(arr);
        System.out.print("Peak index of the array is : "+ans);
    }
    static int peakIndexOfMountain(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                //you are in decreasing part
                //this may be the ans, but look at left side
                end = mid;
            } else {
                //you are in increasing part
                //the ans will rely on the right side
                start = mid + 1; // because we know that mid+1 element > mid element
            }
        }
        return start;//or return end;
    }

}
