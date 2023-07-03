package com.Week4.Hashmap;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public class TargetSumIndices {

    public static int[] twoSumIndices(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int targetvalue = target - nums[i];
            if (map.containsKey(targetvalue)) {
                return new int[]{map.get(targetvalue), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{ };
    }

    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50, 60};
        int target = 100;
        int[] twoindices = twoSumIndices(nums, target);
        System.out.println(Arrays.toString(twoindices));
    }
}
