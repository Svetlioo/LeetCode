package TopInterview150Easy;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Solution(new int[]{2, 7, 11, 15}, 9)));
    }

    public static int[] Solution(int[] nums, int target) {
//        Input: nums = [2,7,11,15], target = 9
//        Output: [0,1]
//        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int difference = target - num;
            if (map.containsKey(difference)) {
                return new int[]{map.get(difference), i};
            }
            map.put(num, i);

        }
        return new int[]{};
    }
}
