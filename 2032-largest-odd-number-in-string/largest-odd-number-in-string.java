class Solution {
    public String largestOddNumber(String num) {
        String sk="";
        for(int i=num.length()-1;i>=0;i--){
            int x=Integer.valueOf(num.charAt(i));
            if(x%2!=0){
                sk= num.substring(0,i+1);
                break;
            }
        }
        return sk;
    }
}