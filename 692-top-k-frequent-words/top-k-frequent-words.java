class Solution {
    public List<String> topKFrequent(String[] arr, int k) {
        HashMap<String, Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            String sk=arr[i];
            map.put(sk,map.getOrDefault(sk,0)+1);
        }

        Map<String, Integer> tmap = new TreeMap<>(map);
        ArrayList<String> keys = new ArrayList<>(tmap.keySet());
        ArrayList<Integer> values = new ArrayList<>(tmap.values());
        ArrayList<String> al = new ArrayList<>();
        int i=0;
        while(i<k){
            int max=Integer.MIN_VALUE;
            int idx=-1;
            for(int j=0;j<values.size();j++){
                if(max < values.get(j)){
                    max = values.get(j);
                    idx = j;
                }

            }
            al.add(keys.get(idx));
            values.set(idx, 0); // reset the count at idx so it won’t be chosen again

            i++;
            
        }
        
        return al;
        
    }
}