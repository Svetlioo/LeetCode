package TopInterview150Easy;

import java.util.Arrays;

public class MergeSortedArray {

    public static void main(String[] args) {
        int[] nums1 = new int[]{5, 6, 7, 0, 0, 0};
        int m = 3;
        int[] nums2 = new int[]{1, 2, 3};
        int n = 3;
        merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int last = m + n - 1;
        m--;
        n--;

        while (m >= 0 && n >= 0) {
            if (nums1[m] > nums2[n]) {
                nums1[last] = nums1[m];
                m--;
            } else {
                nums1[last] = nums2[n];
                n--;
            }
            last--;
        }

        while (n >= 0) {
            nums1[last] = nums2[n];
            n--;
            last--;
        }
    }


    //    public static void merge(int[] nums1, int m, int[] nums2, int n) {
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                if (nums2[j] < nums1[i]) {
//                    int temp = nums1[i];
//                    nums1[i] = nums2[j];
//                    nums2[j] = temp;
//                }
//            }
//        }
//        for (int i = 0; i < n; i++) {
//            nums1[i+m] = nums2[i];
//        }
//    }


}
