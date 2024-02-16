public class MergeSort {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1; // Pointer for nums1
        int j = n - 1; // Pointer for nums2
        int k = m + n - 1; // Pointer for the end of merged array

        // Merge nums1 and nums2 from the end
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

        // If there are remaining elements in nums2, copy them to nums1
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
    public static void main(String[] args) {

        int[] num1 = {12,21,34,88,23,0,0,0};
        int[] num2 = {1,2,5,6};
        merge(num1, 4, num2, 4);
        for(int num: num1) {
            System.out.print(num + " ");
        }
    }
}
