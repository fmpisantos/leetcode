package src;

import src.classes.AddTwoNumbers;
import src.classes.MedianFinder;
import src.classes.TwoSum;
import src.helpers.ListNode;

import java.util.Arrays;

import static src.classes.LenghtOfLongestSubstring.lengthOfLongestSubstring;
import static src.classes.LongestPalindrome.longestPalindrome;
import static src.classes.LongestPalindrome.longestPalindrome2;
import static src.classes.MedianSortedArrays.findMedianSortedArrays;
import static src.classes.MedianSortedArrays.findMedianSortedArrays2;
import static src.classes.RomanToInt.romanToInt;
import static src.classes.SearchInsert.searchInsert;
import static src.classes.ThreeSum.threeSum;

class Main{
    public static void main(String[] args){
        runLongestPalindrome();
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

    public static void runLenghtOfLongestSubstring(){
        System.out.println( lengthOfLongestSubstring("abcabcbb") );
        System.out.println( lengthOfLongestSubstring("bbbbb") );
        System.out.println( lengthOfLongestSubstring("pwwkew") );
        System.out.println( lengthOfLongestSubstring("abba") );
    }

    public static void runFindMedianSortedArrays(){
        System.out.println(findMedianSortedArrays(new int[]{1,3}, new int[]{2}));
        System.out.println(findMedianSortedArrays2(new int[]{1,2}, new int[]{3,4}));
        System.out.println(findMedianSortedArrays(new int[]{0,0}, new int[]{0,0}));
        System.out.println(findMedianSortedArrays(new int[]{0,0,0,0,0}, new int[]{-1,0,0,0,0,0,1}));
    }

    public static void runLongestPalindrome(){
        String s = "aaaaaaaaaabcaaaaaaa";
        s = "cbbd";
        System.out.println(longestPalindrome2(s));
    }
}