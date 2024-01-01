package TopInterview150Medium;

import java.util.Arrays;

public class RotateArray {

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        rotate(nums, k);
        System.out.println(Arrays.toString(nums));
    }

    public static void rotate(int[] nums, int k) {
        int[] nums2 = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            nums2[(i + k) % nums.length] = nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums2[i];
        }

    }
}
