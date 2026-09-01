class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n=nums.length;
        Arrays.sort(nums);
        int closestSum = nums[0] + nums[1] + nums[2];
        for(int f=0;f<n-2;f++){
            int l=f+1;
            int r=n-1;
            while(l<r){
                int sum=nums[l]+nums[r]+nums[f];
                if(Math.abs(target-sum)<Math.abs(target-closestSum)){
                    closestSum=sum;
                }
                
                if(sum<target){
                    l++;
                }
                else{
                    r--;
                   }   }
        }
        return closestSum;
    }
}