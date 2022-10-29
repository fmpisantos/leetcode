package src.classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MedianSortedArrays {
    public static double findMedianSortedArraysSlow(int[] nums1, int[] nums2){
        List<Integer> list = new ArrayList<>();
        for(int i : nums1)
            list.add(i);
        int temp;
        for(int j : nums2) {
            temp = Collections.binarySearch(list, j);
            if(temp < 0)
                temp = Math.max(-temp - 1, 0);
            list.add(temp, j);
        }
        if(list.size() % 2 != 0)
            return list.get(list.size()/2);
        else
            return (list.get(list.size()/2) + list.get(list.size()/2-1))/2.0;
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2){

        return 0.0;
    }
}
