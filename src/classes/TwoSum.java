package src.classes;

import java.util.Map;
import java.util.HashMap;

public class TwoSum {
    public static int[] twoSums2( int [] nums, int target ){
        // Create hashmap of the array
        Map<Integer, Integer> hash = new HashMap<>();
        int holder;
        for( int i = 0; i < nums.length; i++ ){
            holder = nums[i];
            if( hash.containsKey(holder) && holder * 2 == target)
                return new int[]{ hash.get(holder), i };
            hash.put(holder, i);
        }

        // Run throw the array until "magic pair" is found
        for( int j = 0; j< nums.length; j++ ){
            holder = target - nums[j];
            if(holder == nums[j])
                continue;
            if( hash.containsKey(holder) )
                return new int[]{ j, (int) hash.get(holder) };
        }
        return nums;
    }

    public static int[] twoSums( int [] nums, int target){
        Map<Integer, Integer> hash = new HashMap<>();
        int helper;
        for(int i = 0; i < nums.length; i++){
            helper = target - nums[i];
            if(hash.containsKey(helper))
                return new int[]{hash.get(helper), i};
            hash.put(nums[i], i);
        }
        return nums;
    }
}
