class Solution {
    public int removeDuplicates(int[] nums) {
        int k=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
            if(hm.get(nums[i])<=2){
               nums[k]=nums[i];
               k++;
            }
        }
        return k;
    }
}