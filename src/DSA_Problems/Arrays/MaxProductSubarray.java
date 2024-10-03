package DSA_Problems.Arrays;

public class MaxProductSubarray {
    static long maxProduct(int[] arr, int n) {
        // code here\ long maxi = arr[0];

        long maxi = arr[0];
        long mini = arr[0];
        long ans = arr[0];

        for(int i=1;i<n;i++)
        {
            if(arr[i] < 0)
            {
                long temp = maxi;
                maxi = mini;
                mini = temp;
            }

            maxi = Math.max(arr[i],maxi * arr[i]);
            mini = Math.min(arr[i], mini * arr[i]);

            ans = Math.max(maxi,ans);
        }
        return ans;
    }

    public static void main(String[] args) {
        int a[]={1,2,3,4};
        long ans=maxProduct(a,a.length);
        System.out.println(ans);
    }
}
