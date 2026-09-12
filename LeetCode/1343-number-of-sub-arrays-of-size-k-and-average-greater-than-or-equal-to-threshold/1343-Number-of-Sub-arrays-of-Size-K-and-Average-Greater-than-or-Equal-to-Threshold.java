class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum=0,ans=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        System.out.println(sum);
        ans=sum/k>=threshold?++ans:ans;
        System.out.println("Ans "+ans);
        int start=0;
        for(int i=k;i<arr.length;i++){
            sum=sum-arr[start]+arr[i];
            System.out.println(sum);
            start++;
            if(sum/k>=threshold) ans++;
        }
        return ans;
    }
}