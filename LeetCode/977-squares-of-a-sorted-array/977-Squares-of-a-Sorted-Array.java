class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] res=new int[nums.length];
        int index=nums.length-1;
        int l=0,r=nums.length-1;
        while(l<=r){
            int ls=nums[l]*nums[l];
            int rs=nums[r]*nums[r];
            if(ls>rs){
                res[index--]=ls;
                l++;
            }
            else{
                res[index--]=rs;
                r--;
            }
        }
        return res;
    }
}