import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        int pair;
        for(int i = 0 ; i < nums.length; i++){
            pair = (target - nums[i]);
            if(map.containsKey(pair)){
                return new int[] {i, (Integer) map.get(pair)};
            }
            map.put(nums[i], i);
        }
        return new int[] {};
    }
}