class Solution {
    public int[] dailyTemperatures(int[] te) {
        Stack<Integer>st =new Stack<>();
        // st.push(0);
        // int count=1;
        int arr[]=new int[te.length];
        for(int i=te.length-1;i>=0;i--){
            while(!st.isEmpty() && te[st.peek()]<=te[i] ){
                st.pop();
            }
            if(st.isEmpty()){
                arr[i]=0;
            }else{
                arr[i]=st.peek()-i;
            }
            st.push(i);
        }
        return arr;
    }
}