package src.helpers;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public ListNode() {}

    public String toString(){
        if(next == null)
            return ""+val;
        return ""+val+next.toString();
    }
}
