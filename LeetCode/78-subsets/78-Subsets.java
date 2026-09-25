class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        helper(new ArrayList<>(),0,nums);
        return ans;
    }
    public void helper(List<Integer> sol,int index,int[] nums){
        ans.add(new ArrayList<>(sol));
        for(int i=index;i<nums.length;i++){
            sol.add(nums[i]);
            helper(sol,i+1,nums);
            sol.remove(sol.size()-1);
        }
    }
}