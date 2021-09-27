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

class MedianFinder {

    private ArrayList<Integer> array;
    
    public MedianFinder() {
        array = new ArrayList<Integer>();
    }
    
    public int findRightIndex(int num, int min, int max){
        int median = min + (int) Math.floor((max-min)/2);
        if(min == max)
            return min;
        if(array.get(median) > num)
            return findRightIndex(num,min,median);
        else
            return findRightIndex(num,median, max);
            
    }
    
    public void addNum(int num) {
        array.add(findRightIndex(num,0,array.size()-1),num);
    }
    
    public double findMedian() {
        int mid = array.size()/2;
        if( array.size()%2 == 0)
            return (array.get((int) Math.floor(mid))+array.get((int) Math.ceil(mid))) /2.0;
        else
            return array.get(mid)*1.0;
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */