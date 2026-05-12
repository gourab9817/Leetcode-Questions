class Solution {
    // public int[] maxSlidingWindow(int[] nums, int k) {
        
    //     // for(int i=0;i<k;i++){
    //     //     int x=nums[i];
    //     //     max=Math.max(max,x);
    //     // }
    //     int arr[]=new int[nums.length-k+1];
    //     int i=0;
    //     int j=k-1;
    //     int idx=0;
    //     while(j<nums.length){
    //         int max=Integer.MIN_VALUE;
    //         int x=i;
    //         while(x<=j){
    //             max=Math.max(max,nums[x]);
    //             x++;
    //         }  
    //         arr[i]=max;          
    //         j++;
    //         i++;

    //     }
    //     return arr;
    // }

    public int[] maxSlidingWindow(int[] nums, int k) {

        Deque<Integer> dq = new LinkedList<>();

        int[] ans = new int[nums.length - k + 1];

        int idx = 0;

        for (int i = 0; i < nums.length; i++) {

            while (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }

            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i]) {
                dq.pollLast();
            }

            dq.offerLast(i);

            if (i >= k - 1) {
                ans[idx++] = nums[dq.peekFirst()];
            }
        }

        return ans;
    }
}