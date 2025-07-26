
// LeetCode #1 Two Sum
// Hashtable to store complement, time complexity O(n)
import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[] { i, map.get(complement) };
            }
            map.put(nums[i], i);
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] result = s.twoSum(new int[] { 2, 7, 11, 15 }, 9);
        int[] result2 = s.twoSum(new int[] { 3, 2, 4 }, 6);
        int[] result3 = s.twoSum(new int[] { 3, 3 }, 6);
        System.out.println(Arrays.toString(result)); // [0,1]
        System.out.println(Arrays.toString(result2));
        System.out.println(Arrays.toString(result3));
    }
}