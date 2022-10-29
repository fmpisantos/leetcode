import java.util.ArrayList;

class Main{
    public static void main(String[] args){
        MedianFinder mf = new MedianFinder();
        mf.addNum(1);
        mf.addNum(2);
        mf.addNum(3);
        mf.addNum(4);
        mf.addNum(5);
        System.out.println(mf.findMedian());
    }
}