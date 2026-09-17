class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        solve(nums,0,new ArrayList<>());
        return ans;
    }
    public void solve(int[] nums,int index,List<Integer> current){
        ans.add(new ArrayList<>(current));
        for(int i=index;i<nums.length;i++){
            current.add(nums[i]);
            solve(nums,i+1,current);
            current.remove(current.size()-1);
        }
    }
}