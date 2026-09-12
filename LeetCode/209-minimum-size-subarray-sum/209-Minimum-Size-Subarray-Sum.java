class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum=0,l=0,wl=Integer.MAX_VALUE;
        for(int r=0;r<nums.length;r++){
            sum+=nums[r];
            while(sum>=target){
                wl=Math.min(wl,r-l+1);
                sum-=nums[l];
                l++;
            }
        }
        return wl<Integer.MAX_VALUE?wl:0;
    }
}