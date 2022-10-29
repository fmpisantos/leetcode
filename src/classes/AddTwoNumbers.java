package src.classes;

import src.helpers.ListNode;

public class AddTwoNumbers {
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        helper(l1,l2,0);
        return l1;
    }

    public ListNode helper(ListNode l1, ListNode l2, int extra){
        int l1Val, l2Val;
        if(l1 == null && l2 == null)
            return l1;
        if(l1 != null)
            l1Val = l1.val;
        else{
            l1Val = 0;
            if(extra == 0)
                return l1;
        }
        if(l2 != null)
            l2Val = l2.val;
        else{
            l2Val = 0;
            if(extra == 0)
                return l1;
        }
        l1Val += l2Val + extra;
        l1.val = l1Val%10;
        if((l1 == null || l1.next == null) && (l2==null || l2.next == null)){
            if(l1Val/10 != 0)
                l1.next = new ListNode(l1Val/10);
            return l1;
        }
        if(l1.next == null)
            l1.next = new ListNode(0);
        return helper(l1.next, l2 != null? l2.next : null , l1Val/10);
    }

    public ListNode addTwoNumbersBruno(ListNode l1, ListNode l2) {
        ListNode result = l1;
        int sumOne = 0;
        boolean stop = false;
        while( !stop)
        {

            int sumWithOne = 0;

            if( l1 != null )
            {
                sumWithOne += l1.val;
            }
            if( l2 != null )
            {
                sumWithOne += l2.val;
            }

            sumWithOne += sumOne;
            sumOne = sumWithOne/10;

            l1.val = sumWithOne%10;


            if( l1.next == null )
            {
                l1.next = new ListNode(0);
                if((l2 == null || l2.next == null))
                    break;
            }

            l1 = l1.next;

            if( l2 != null )
            {
                l2 = l2.next;
            }
        }

        if( sumOne > 0 )
        {
            l1.next = new ListNode(sumOne);
        }
        return result;
    }
}

