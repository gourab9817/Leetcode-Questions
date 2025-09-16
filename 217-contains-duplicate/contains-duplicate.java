class Solution {
    public boolean containsDuplicate(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int x=arr[i];
            int a=map.getOrDefault(x,0)+1;
            map.put(x,a);
            if(a>1){
                return true;
            }
        }
        return false;
    }
}