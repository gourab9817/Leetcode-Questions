// class Solution {
//     public boolean isAnagram(String s, String t) {
//         int n=s.length();
//         int m=t.length();
//         int count=0;
//         if(m==n){
//         HashMap<Character, Integer> a=new HashMap<>();
//         HashMap<Character, Integer> b=new HashMap<>();
//         for(int i=0;i<n;i++){
//             for(int j=i;j<n;j++){
//                if(s.charAt(i)==s.charAt(j)){
//                     count ++;
//                } 
//             }
//             a.put(s.charAt(i),count);
//             count=0;
//         }
//         for(int i=0;i<m;i++){
//             for(int j=i;j<m;j++){
//                if(s.charAt(i)==s.charAt(j)){
//                     count ++;
//                } 
//             }
//             b.put(t.charAt(i),count);
//             count=0;
//         }



//         }else{
//             return false;
//         }
//     }
// }


class Solution{
    public boolean isAnagram(String s, String t){
        if(s.length()==t.length()){
        char  []a=new char[s.length()];
        char  []b=new char[s.length()];
        for(int i=0;i<s.length();i++){
            a[i]=s.charAt(i);
        }
        for(int i=0;i<t.length();i++){
            b[i]=t.charAt(i);
        }
        Arrays.sort(a);
        Arrays.sort(b);
        int i=0;
        while(i<s.length()){
            if(a[i]!=b[i]){
                return false;
            }
            i++;
        }
        return true;
        }
        return s.length()==t.length();


        

    }
}