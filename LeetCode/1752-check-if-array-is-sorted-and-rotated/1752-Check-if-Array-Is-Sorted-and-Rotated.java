class Solution {
    public boolean check(int[] arr) {
          int counter=0;
          for(int i=0;i<arr.length;i++){
            if(arr[i]>arr[(i+1)%arr.length]){
                counter++;
            }
        }
        return counter<2;
    }
}