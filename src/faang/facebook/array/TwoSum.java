package faang.facebook.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers, return indices of the two numbers such
 * that they add up to a specific target.
 */

public class TwoSum {

    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] twosum = twoSum(nums, target);
        System.out.println(String.format("[%s,%s]",twosum[0],twosum[1]));
    }

    private static int[] twoSum(int[] nums, int target) {
        if (null == nums) {
            return new int[]{-1, -1};
        }

        Map<Integer, Integer> twoSumMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (twoSumMap.containsKey(target - nums[i])) {
                return new int[]{twoSumMap.get(target - nums[i]), i};
            } else {
                twoSumMap.put(nums[i], i);
            }
        }

        return new int[]{-1, -1};
    }
}
