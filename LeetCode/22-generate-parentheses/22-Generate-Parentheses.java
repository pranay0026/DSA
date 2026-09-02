class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res =new ArrayList<>();
        String curr="";
        helper(res,curr,0,n);
        return res;
    }
    public void helper(List<String> res,String curr,int open,int n){
        if(curr.length()==2*n){
            res.add(curr);
            return;
        }
        if(open<n){
            helper(res,curr+'(',open+1,n);
        }
        if(curr.length()-open<open){
            helper(res,curr+')',open,n);
        }
    }
}