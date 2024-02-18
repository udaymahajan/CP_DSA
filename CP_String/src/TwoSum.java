import java.util.Arrays;

class TwoSum {
    public static int[] twoSum(int[] numbers, int target) {


        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                return new int[]{left + 1, right + 1}; // Return indices with 1-based indexing
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        // No solution found, return an empty array
        return new int[0];

    }

    public static void main(String[] args) {
        int[] a = twoSum(new int[]{5,25,75}, 100);
        System.out.println(Arrays.toString(a));
    }
}