public class RotateArray {
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n; // Normalize k to be within the range of array length

        // Reverse the entire array
        reverse(nums, 0, n - 1);
        // Reverse the first k elements
        reverse(nums, 0, k - 1);
        // Reverse the remaining elements
        reverse(nums, k, n - 1);
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {4,3,1,8,7,5,6};
        rotate(nums, 3);
        for (int num: nums) {
            System.out.print(num + " ");
        }

    }
}
