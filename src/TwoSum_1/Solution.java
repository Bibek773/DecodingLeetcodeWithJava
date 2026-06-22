package TwoSum_1;

import java.util.HashMap;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        HashMap <Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i< nums.length; i++){
            int difference = target - nums[i];
            if (map.containsKey(difference)){
                arr[0] = map.get(difference);
                arr[1] = i;
                return arr;
            }
            map.put(nums[i], i);
        }
        return arr;
    }
}

