class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int x:nums){
            map.put(x,map.getOrDefault(x,0)+1);

        }
        ArrayList<Integer> al=new ArrayList<>(map.values());
        int max=0;
        for(int i=0;i<al.size();i++){
            max=Math.max(al.get(i),max);
        }
        int sum=0;
        for (int i=0;i<al.size();i++){
            if(al.get(i)==max){
                sum+=max;
            }
        }
        return sum;
    }
}