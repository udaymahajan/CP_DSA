import java.util.Arrays;

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int k = 0; // Pointer to the position where the next element not equal to val should be placed

        // Iterate over the array
        for (int i = 0; i < nums.length; i++) {
            // If the current element is not equal to val, move it to position k and increment k
            if (nums[i] != val) {
                nums[k++] = nums[i];
                System.out.print(i + " iteration ");
                System.out.print(k + " \n");
                System.out.print(Arrays.toString(nums) + " \n");
            }
        }

        return k; // Return k, which represents the number of elements not equal to val
    }

    public static void main(String[] args) {

        int[] nums = {0,1,2,2,3,0,4,2};
        System.out.println(removeElement(nums, 2));
    }
}
