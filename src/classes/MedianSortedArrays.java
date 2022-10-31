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
        int helper1 = 0, helper2 = 0, median1 = 0, median2 = 0, temp;
        if(nums1[helper1] > nums2[helper2])
            median1 = nums2[helper2++];
        else
            median1 = nums1[helper1++];
        for(int i = 1; i < nums1.length + nums2.length; i++){
            if(helper1 > nums1.length-1)
                temp = nums2[helper2++];
            else if(helper2 > nums2.length-1)
                temp = nums1[helper1++];
            else if(nums1[helper1] > nums2[helper2])
                temp = nums2[helper2++];
            else
                temp = nums1[helper1++];
            if(median2 == 0)
                median2 = temp;
            else{
                median2 = 0;
                median1 = temp;
            }
        }
        return (median1 + median2) / 2;
    }

    public static double findMedianSortedArrays2(int[] nums1, int[] nums2){
        int toIns = 0, helper1 = 0, helper2 = 0, length = nums1.length + nums2.length, toFindIdx1 = length/2, toFindIdx2 = length %2 == 0? length/2-1 : -1, toFind1 = 0, toFind2 = 0;
        for(int i = 0; i < length; i++){
            if(helper1 >= nums1.length)
                toIns = nums2[helper2++];
            else if(helper2 >= nums2.length)
                toIns = nums1[helper1++];
            else if(nums1[helper1] > nums2[helper2])
                toIns = nums2[helper2++];
            else
                toIns = nums1[helper1++];
            if(i == toFindIdx1) {
                toFind1 = toIns;
                if(toFindIdx2 == -1)
                    return toFind1;
                else
                    return (toFind1+toFind2) / 2.0;
            }
            if( i == toFindIdx2 )
                toFind2 = toIns;
        }
        return 0.0;
    }
}
