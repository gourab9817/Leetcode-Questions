class Solution {
    public String mostCommonWord(String s, String[] banned) {
        String[] w = s.toLowerCase().split("\\W+");
        HashMap<String,Integer> mp=new HashMap<>();
        for(int i=0;i<w.length;i++){
            String sk=w[i];
            mp.put(sk,mp.getOrDefault(sk,0)+1);
        }
        for(int i=0;i<banned.length;i++){
            String sk=banned[i];
            mp.put(sk,0);
        }
        List<String> keys = new ArrayList<>(mp.keySet());
        List<Integer> values = new ArrayList<>(mp.values());

        int maxVal = 0;
        String maxWord = "";

        for (int i = 0; i < keys.size(); i++) {
            if (values.get(i) > maxVal) {
                maxVal = values.get(i);
                maxWord = keys.get(i);
            }
        }

        return maxWord;

    }
}