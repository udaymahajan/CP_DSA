public class JumpIndex {
    public static boolean canJump(int[] nums) {
        int maxReach = 0;

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // If the current index is beyond the maximum reachable index, return false
            if (i > maxReach) {
                return false;
            }

            // Update the furthest position you can reach
            maxReach = Math.max(maxReach, i + nums[i]);

            // If the furthest position is beyond or at the last index, return true
            if (maxReach >= nums.length - 1) {
                return true;
            }
        }

        return false; // Return false if not reaching the end of the array
    }

    public static void main(String[] args) {
        int[] nums = {21,36,3,81,92};
        System.out.println(canJump(nums));

    }
}
