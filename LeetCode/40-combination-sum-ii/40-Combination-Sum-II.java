class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(candidates);
        helper(res,new ArrayList<>(),candidates,target,0);
        return res;
    }
    public void helper(List<List<Integer>> res,List<Integer> fun,int[] arr,int target,int start){
        if(target==0){
            res.add(new ArrayList<>(fun));
            return;
        }
        for(int i=start;i<arr.length;i++){
            if(i>start && arr[i]==arr[i-1])
                continue;
            if(arr[i]>target)
                break;
            fun.add(arr[i]);
            helper(res,fun,arr,target-arr[i],i+1);
            fun.remove(fun.size()-1);
        }
    }
}