class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack <Integer> st=new Stack<>();
        int answer[]=new int[temperatures.length];
        int count=0;
        for(int i=temperatures.length-1;i>=0;i--){
            while(!st.isEmpty()&& temperatures[st.peek()]<=temperatures[i]){
                st.pop();
                
            }
            if(st.isEmpty()){
                answer[i]=0;
            }else{
               answer[i]= st.peek()-i;
               
            }
            
            st.push(i);
            

        }
        return answer;
    }
}