/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null ){
            return false;
        }
        //1.创建fast slow快慢指针
        ListNode fast = head;
        ListNode slow = head;
        //2.fast比slow多走一步 在循环中如果有环 fast会和slow相遇 如果没有 会走到null
        while (fast.next != null&&fast.next.next!=null) {
           
            fast = fast.next.next;
            slow = slow.next;
             if (fast == slow){
                return true;
            }
        }
        return false;
    }
}
