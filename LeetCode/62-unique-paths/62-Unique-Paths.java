class Solution {

    int[][] dp;

    public int uniquePaths(int m,int n){

        dp=new int[m][n];

        for(int i=0;i<m;i++){
            Arrays.fill(dp[i],-1);
        }

        return solve(0,0,m,n);
    }

    public int solve(int r,int c,int rc,int cc){

        if(r==rc-1&&c==cc-1){
            return 1;
        }

        if(r>=rc||c>=cc){
            return 0;
        }

        if(dp[r][c]!=-1){
            return dp[r][c];
        }

        return dp[r][c]=solve(r+1,c,rc,cc)+solve(r,c+1,rc,cc);
    }
}