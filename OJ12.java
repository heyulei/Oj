/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Solution {
    public ListNode ReverseList(ListNode head) {
       
        if (head == null||head.next == null){
            return head;
        }
        ListNode pre = head.next;
        ListNode lf = null;
        ListNode rt = head;
        while(pre!=null){
            rt.next = lf;
            lf = rt;
            rt = pre;
            pre = pre.next;
        }
        rt.next = lf;
        return rt;
    }
}
