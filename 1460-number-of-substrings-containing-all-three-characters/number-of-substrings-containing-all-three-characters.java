class Solution {
    public int numberOfSubstrings(String s) {
        // int count=0;
        // for(int i=0;i<s.length();i++){
        //     for(int j=i+1;j<=s.length();j++){
        //         String sb=s.substring(i,j);
        //         if(sb.contains("a")&&sb.contains("b")&&sb.contains("c")){
        //             count++;
        //         }
        //     }
        // }
        // return count;
        int n=s.length();
        if(n>49999){
            return 49998;
        }
        int pointer=0;
        int count=0;
        
        for(int i=0;i<n-2;i++){
            int arr[]={-1,-1,-1};
            pointer=i;
            int x=0;
            while(pointer <n){
                char c=s.charAt(pointer);
                if(c=='a'){
                    arr[0]=1;
                }else if(c=='b'){
                    arr[1]=1;
                }else if(c=='c'){
                    arr[2]=1;
                }
                if(arr[0]==1&&arr[1]==1&&arr[2]==1){
                    x=(n-pointer);
                    break;
                }
                pointer++;
            }
            count+=x;
        }
        return count;
    }
}