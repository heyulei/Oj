/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 //编写一个程序，找到两个单链表相交的起始节点。
 
 
 
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null||headB == null) {
            return null;
        }
        ListNode cur = headA;
        int sizeA = 0;
        while (cur != null) {
            sizeA++;
            cur = cur.next;
        }
        cur = headB;
        int sizeB = 0;
        while (cur != null) {
            sizeB++;
            cur = cur.next;
        }
        int step = 0;
        ListNode ret = null;
        if (sizeA - sizeB >=0){
            step = sizeA - sizeB;
            ret = comp(headA,headB,step);

        }else {
            step = sizeB - sizeA;
            ret = comp(headB,headA,step);
        }
        return ret;

    }
    private ListNode comp(ListNode a,ListNode b,int step){
       ListNode big = a;
       ListNode small = b;
       for (int i = step ; i>0;i--){
           big = big.next;
       }
        while (big != null) {
           if (big == small){
               return big;
           }
           big = big.next;
           small = small.next;
        }
        return null;
       
    }
}
