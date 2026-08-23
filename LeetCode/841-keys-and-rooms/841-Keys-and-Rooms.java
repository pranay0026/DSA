class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        
        int n=rooms.size();
        boolean[] visited=new boolean[n];
        List<Integer> res=new ArrayList<>();
        dfs(0,visited,res,rooms);
        return res.size()==n?true:false;
    }
    public static void dfs(int s,boolean[] visited,List<Integer> res,List<List<Integer>> rooms){
        visited[s]=true;
        res.add(s);
        for(int i:rooms.get(s)){
            if(!visited[i]){
                dfs(i,visited,res,rooms);
            }
        }
    }
}