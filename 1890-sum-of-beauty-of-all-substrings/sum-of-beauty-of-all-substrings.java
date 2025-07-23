class Solution {
    public int beautySum(String s) {
        int l=0;
        int n=s.length();

        for(int i=0;i<n;i++){
            int arr[]=new int [26];
            for(int j=i;j<n;j++){
                int c =s.charAt(j)-'a';
                arr[c]++;
                int max=0;
                int min=Integer.MAX_VALUE;;
                for(int k=0;k<26;k++){
                    if(arr[k]>0){
                        max=Math.max(max,arr[k]);
                        min=Math.min(min,arr[k]);
                        
                    }
                }
                l+=max-min;
            }
        }
        return l;
    }
}