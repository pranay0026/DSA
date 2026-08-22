class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum=0,maxAvg=0,avg=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        maxAvg=sum/k;
        int start=0;
        for(int i=k;i<nums.length;i++){
            sum=sum-nums[start]+nums[i];
            avg=sum/k;
            maxAvg=Math.max(maxAvg,avg);
            start++;
        }
        return maxAvg;
    }
}