class Solution {
    public int minimumTeachings(int n, int[][] l, int[][] f) {
        // each language is known count
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<l.length;i++){
            for(int j=0;j<l[i].length;j++){
                int x=l[i][j];
                map.put(x,map.getOrDefault(x,0)+1);
            }
        }

        // total language to uncommon
        Set<Integer> ax=new HashSet<>(); 
        for (int i=0;i<f.length;i++){
            int x=f[i][0];
            int y=f[i][1];
            boolean common=help(l,x,y);
            ArrayList<Integer> ay=new ArrayList<>();

            if(common==false){
                ay.add(x);
                ay.add(y);
            }
            ax.addAll(ay);

        }
        int uncommonsize=ax.size();
        ArrayList<Integer> bx=new ArrayList<>(ax);


        // find out the most known language ammong uncommon users
        int[] freq = new int[n + 1];  // freq[lang] = how many problematic users know this language

        for (int i = 0; i < bx.size(); i++) {
            int user = bx.get(i);
            for (int j = 0; j < l[user - 1].length; j++) {
                int lang = l[user - 1][j];
                freq[lang]++;
            }
        }

        int max = 0;
        for (int lang = 1; lang <= n; lang++) {
            if (freq[lang] > max) {
             max = freq[lang];
            }
        }

        return bx.size() - max;


        
    }
    // languages that are not common in between friends
    public static boolean help(int l[][], int x,int y){
        ArrayList<Integer> al1=new ArrayList<>();
        ArrayList<Integer> al2=new ArrayList<>();
        for (int i=0;i<l[x-1].length;i++){
            al1.add(l[x-1][i]);
        }
        for (int i=0;i<l[y-1].length;i++){
            al2.add(l[y-1][i]);
        }

        List<Integer> commonElem = new ArrayList<>(al1); 
        commonElem.retainAll(al2); 
        if(commonElem.size()>0){
            return true;
        }
        return false;
    }
}





// class Solution {
//     public int minimumTeachings(int n, int[][] l, int[][] f) {
//         // Step 1: find all problematic users
//         Set<Integer> users = new HashSet<>();
//         for (int[] pair : f) {
//             if (!canCommunicate(l, pair[0], pair[1])) {
//                 users.add(pair[0]);
//                 users.add(pair[1]);
//             }
//         }

//         // Step 2: frequency array for languages
//         int[] freq = new int[n + 1];   // 1..n languages
//         for (int u : users) {
//             for (int lang : l[u - 1]) {
//                 freq[lang]++;   // this user knows this language
//             }
//         }

//         // Step 3: find max
//         int max = 0;
//         for (int i = 1; i <= n; i++) {
//             max = Math.max(max, freq[i]);
//         }

//         // Step 4: result
//         return users.size() - max;
//     }

//     // helper to check if two users can already talk
//     private boolean canCommunicate(int[][] l, int a, int b) {
//         Set<Integer> s = new HashSet<>();
//         for (int x : l[a - 1]) s.add(x);
//         for (int x : l[b - 1]) if (s.contains(x)) return true;
//         return false;
//     }
// }
