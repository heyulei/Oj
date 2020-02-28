/*
 public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
*/
public class Solution {

    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        if (pHead == null||pHead.next == pHead ){
            return pHead;
        }
        ListNode slow = pHead;
        ListNode fast = pHead;
        ListNode node = hasCycle(pHead,slow,fast);
       if (node!=null){
           fast = node;
           while(fast!=slow){
               fast= fast.next;
               slow = slow.next;
           }
           return fast;
       }
        return null;
    }
    private ListNode hasCycle (ListNode head,ListNode s,ListNode f){
        while (f.next!=null){
            s = s.next;
            f = f.next.next;
            if(f==s){
                
                return s;
            }
        }
       return null;
    }
}
