class Solution {
    public static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            System.out.println("no");
            return 0; // You need to return an integer value
        }

        int i = 0;
        int j = 1;
        while (j < nums.length) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
            j++;
        }
        return i + 1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3, 4, 4, 5};
        int result = removeDuplicates(nums);

        System.out.print("Modified array: [");
        for (int k = 0; k < result; k++) {
            System.out.print(nums[k]);
            if (k < result - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        System.out.println("Number of unique elements: " + result);
    }
}
