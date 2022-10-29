package src;

import src.classes.AddTwoNumbers;
import src.classes.MedianFinder;
import src.classes.TwoSum;
import src.helpers.ListNode;

import java.util.Arrays;

import static src.classes.RomanToInt.romanToInt;
import static src.classes.SearchInsert.searchInsert;
import static src.classes.ThreeSum.threeSum;

class Main{
    public static void main(String[] args){
        runTwoSum();
    }

    public static void runMedian(){
        MedianFinder mf = new MedianFinder();
        mf.addNum(1);
        mf.addNum(2);
        mf.addNum(3);
        mf.addNum(4);
        mf.addNum(5);
        System.out.println(mf.findMedian());
    }

    public static void runTwoSum(){
        int []  example  = new int [] {3,2,4};
        int     target   = 6;
        System.out.println(Arrays.toString(TwoSum.twoSums(example, target)));
    }

    public static void runSearchinsert(){
        System.out.println(searchInsert(new int[]{ 1,3,5,6 }, 7));
    }

    public static void runTrheeSum(){
        System.out.println(threeSum(new int[]{-1,0,1,2,-1,-4}));
    }
    public static void runAddTwoNumbers(){
        AddTwoNumbers aTwoN = new AddTwoNumbers();
        ListNode l1 = new ListNode(9);
        l1 = new ListNode(9,l1);
        l1 = new ListNode(9,l1);

        ListNode l2 = new ListNode(9);

        System.out.println(aTwoN.addTwoNumbers(l1,l2).toString());
        System.out.println(aTwoN.addTwoNumbersBruno(l1,l2).toString());
    }

    public static void runRomanToInt(){
        System.out.println(romanToInt("III"));
    }
}