class Solution {
    public int[] productExceptSelf(int[] arr) {
        int pro=1,zero=0,ind=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                zero++;
                ind=i;
            }
            else{
                pro*=arr[i];
            }
        }
        int n=arr.length;
        int[] res=new int[n];
        Arrays.fill(res,0);
        if(zero==0){
            for(int i=0;i<arr.length;i++){
                res[i]=pro/arr[i];
            }
        }
        else if(zero==1){
            res[ind]=pro;
        }
        return res;
    }
}