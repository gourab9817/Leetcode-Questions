class Solution {
    public int commonFactors(int a, int b) {
        int min=Math.min(a,b);
        int max=Math.max(a,b);
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=1;i<=min/2;i++){
            if(min%i==0){
                al.add(i);
            }
        }
        al.add(min);
        int count=0;
        for(int i=0;i<al.size();i++){
            if(max%al.get(i)==0){
                count++;
            }
        }
        return count;
    }
}