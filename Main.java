import java.util.ArrayList;
import java.util.Arrays;

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
}