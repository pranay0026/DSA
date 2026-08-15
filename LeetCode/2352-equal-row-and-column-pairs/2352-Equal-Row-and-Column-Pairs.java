class Solution {
    int cc=0;
    public int equalPairs(int[][] grid) {
        for(int r=0;r<grid.length;r++){
            for(int c=0;c<grid.length;c++){
                boolean match =true;
                for(int k=0;k<grid.length;k++){
                    if(grid[r][k]!=grid[k][c]){
                        match = false;
                        break;
                    }
                }
                if(match){
                    cc++;
                }
            }
        }
        return cc;
    }
    
}