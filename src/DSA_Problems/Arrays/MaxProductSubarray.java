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
    static long maxProduct2(int[] arr, int n){
        long suff=1,pref=1;
        long maxi=Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if(pref==0) pref=1;
            if(suff==0) suff=1;

            pref=pref*arr[i];
            suff=suff*arr[n-i-1];

            maxi=Math.max(maxi,Math.max(pref,suff));
        }
        return maxi;
    }

    public static void main(String[] args) {
        int a[]={2, 6, -3,4};
        long ans=maxProduct2(a,a.length);
        System.out.println(ans);
    }
}
