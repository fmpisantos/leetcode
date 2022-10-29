package src.classes;

public class SearchInsert {
    public static int searchInsert(int[] nums, int target) {
        return helper(nums, target, 0, nums.length);
    }

    public static int helper(int [] nums, int target, int min, int max){
        int middle = (max - min) /2 + min;
        if(max - min <= 1)
            return nums[middle] <= target ? middle : middle+1;
        if(target < nums[middle]){
            return helper(nums, target,min,middle);
        }else{
            if(nums[middle] == target)
                return middle;
            else
                return helper(nums, target, middle, max);
        }
    }
}
