import java.util.*;
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        ArrayList<Integer> al=new ArrayList<Integer>();
        for(int i=0;i<m;i++){
            al.add(nums1[i]);
        }
        for(int i=0;i<n;i++){
            al.add(nums2[i]);
        }
        Collections.sort(al);
        Integer[] nums3 = new Integer[al.size()];
        nums3 = al.toArray(nums3);
        for(int i=0;i<nums3.length;i++){
            nums1[i]=nums3[i];
        }
    }
}