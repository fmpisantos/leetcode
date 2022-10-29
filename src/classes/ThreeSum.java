package src.classes;

import java.util.*;

public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> triplets = new HashSet<>();
        Arrays.sort(nums);
        int b, c, temp;

        for(int a = 0; a< nums.length; a++){
            b = a + 1;
            c = nums.length - 1;
            while(c > b){
                temp = nums[a] + nums[b] + nums[c];
                if(temp > 0)
                    c--;
                else if(temp < 0)
                    b++;
                else{
                    List<Integer> toBeAdded = new ArrayList<>();
                    toBeAdded.add(nums[a]);
                    toBeAdded.add(nums[b]);
                    toBeAdded.add(nums[c]);
                    triplets.add(toBeAdded);
                    c--;
                    b++;
                }
            }
        }
        return new ArrayList<>(triplets);
    }
}
