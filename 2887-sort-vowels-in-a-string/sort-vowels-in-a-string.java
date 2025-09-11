// class Solution {
//     public String sortVowels(String s) {
//        char[] c = s.toCharArray();
//        int i=0;
//        int n=c.length;
//        while(i<n){
//           char a=c[i];
//           if((a=='A')||(a=='E')||(a=='I')||(a=='O')||(a=='U')||(a=='a')||(a=='e')||(a=='i')||(a=='o')||(a=='u')){
//             int j=i+1;
//             while(j<n ){
//                 if(((c[j]=='A')||(c[j]=='E')||(c[j]=='I')||(c[j]=='O')||(c[j]=='U')||(c[j]=='a')||(c[j]=='e')||(c[j]=='i')||(c[j]=='o')||(c[j]=='u'))){
//                     if(c[i]>c[j]){
//                         char xy=c[i];
//                         c[i]=c[j];
//                         c[j]=xy;
//                     }
//                 }
//                 j++;
//             }
            
//           }
//           i++;
//        }
//         String str=new String(c);

//        return str; 
//     }
// }

class Solution{
    public static boolean isvowel(char a){
        if((a=='A')||(a=='E')||(a=='I')||(a=='O')||(a=='U')||(a=='a')||(a=='e')||(a=='i')||(a=='o')||(a=='u')){
            return true;
        }
        return false;
    }
    public String sortVowels(String s){
        int n=s.length();
        TreeMap<Character, Integer> map = new TreeMap<>();
        for(int i=0;i<n;i++){
            if(isvowel(s.charAt(i))){
                map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
            }
        }
        ArrayList<Character> al1 = new ArrayList<>(map.keySet());

        ArrayList<Integer> al2=new ArrayList<>(map.values());
        StringBuilder sb=new StringBuilder();
        int p=0;
        for (int i = 0; i < n; i++) {
            char cx = s.charAt(i);
            if (!isvowel(cx)) {
                sb.append(cx);
            } else {
                // Find the next vowel with count left
                while (p < al1.size() && al2.get(p) == 0) {
                    p++;
                }
                sb.append(al1.get(p));
                al2.set(p, al2.get(p) - 1);
            }
        }

        return sb.toString();
        
    }
}