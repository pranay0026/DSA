class Solution {
    public int[] rearrangeArray(int[] nums) {
        List<Integer> pos=new ArrayList<>();
        List<Integer> neg=new ArrayList<>();
        for(int i:nums){
            if(i>=0){
                pos.add(i);
            }
            else{
                neg.add(i);
            }
        }
        int j=0,k=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                nums[i]=pos.get(j++);
               
            }
            else{
                nums[i]=neg.get(k++);
               
            }
        }
        return nums;
    }
}