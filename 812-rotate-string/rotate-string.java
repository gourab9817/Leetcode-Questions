class Solution {
    public boolean rotateString(String s, String goal) {
        for(int i=0;i<s.length();i++){
            String sk=s.substring(i)+s.substring(0,i);
            if(sk.equals(goal)){
                return true;
            }
        }
        return false;

















        // int i=0;
        // int j=0;
        // int n=s.length();
        // StringBuilder sb=new StringBuilder();
        // char c=goal.charAt(0);
        // while(i<s.length()){
        //     if(c==s.charAt(i)){
        //         j=i;
        //         break;
        //     }
        //     i++;
        // }
        // int k=j;
        // for(int x=k;x<n;x++){
        //     sb.append(s.charAt(x));
        // }
        // for(int x=0;x<k;x++){
        //     sb.append(s.charAt(x));
        // }
        // String lk=sb.toString();
        // if(lk.equals(goal)){
        //     return true;
        // }
        
        //     return false;
        
    }
}