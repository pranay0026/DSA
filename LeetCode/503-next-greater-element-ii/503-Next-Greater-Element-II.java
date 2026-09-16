class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st=new Stack<>();
        for(int i=nums.length-1;i>=0;i--){
            while(!st.isEmpty() && nums[i]>st.peek()){
                st.pop();
            }
            st.push(nums[i]);
        }
        int[] arr=new int[nums.length];
        for(int i=nums.length-1;i>=0;i--){
            if(st.peek()>nums[i]){
                arr[i]=st.peek();
                st.push(nums[i]);
            }
            else{
                while(!st.isEmpty()){
                    if(nums[i]<st.peek()){
                        arr[i]=st.peek();
                        break;
                    }
                    st.pop();
                }
                if(st.isEmpty()){
                    arr[i]=-1;
                }
                st.push(nums[i]);
            }
        }
        return arr;
    }
}