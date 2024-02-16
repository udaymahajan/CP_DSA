public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0; // If the array is empty, there are no unique elements
        }

        int k = 1; // Pointer to the position where the next unique element should be placed

        // Iterate over the array starting from the second element
        for (int i = 1; i < nums.length; i++) {
            // If the current element is different from the previous element, move it to position k and increment k
            if (nums[i] != nums[i - 1]) {
                nums[k++] = nums[i];
            }
        }

        return k; // Return k, which represents the number of unique elements
    }

    public static void main(String[] args) {
        int[] nums = {4,4,12,55,67,47};
        System.out.println(removeDuplicates(nums));
    }
}
