class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int cc=0;
        int ci=0;
        int coi=0;
        while(ci<g.length && coi<s.length){
            if(g[ci]<=s[coi]){
                cc++;
                ci++;
                coi++;
            }
            else{
                coi++;
            }
        }
        return cc;
    }
}