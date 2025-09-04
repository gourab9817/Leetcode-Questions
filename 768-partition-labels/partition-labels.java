class Solution {
    public List<Integer> partitionLabels(String s) {
        int n=s.length();
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            map.put(c, i);
        }
        List<Integer> al=new ArrayList<>();
        int i=0;
        while(i<n){
            char ck=s.charAt(i);
            int boundary=map.get(ck);
            for(int j=i;j<boundary;j++){
                char ck2=s.charAt(j);
                if(map.get(ck2)>boundary){
                    boundary=map.get(ck2);
                }
            }
            al.add(boundary+1);
            i=boundary+1;
        }
        for(int x=al.size()-1;x>0;x--){
            int y=al.get(x)-al.get(x-1);
            al.remove(x);
            al.add(x,y);
        }
        return al;

    }
}
