import java.util.*;
/* 对于一个链表，请设计一个时间复杂度为O(n),额外空间复杂度为O(1)的算法，判断其是//否为回文结构。
给定一个链表的头指针A，请返回一个bool值，代表其是否为回文结构。保证链表长度小于///等于900。 

public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class PalindromeList {
    public boolean chkPalindrome(ListNode A) {
       if (A == null&& A.next == null ) {
           return true;
       }
       ListNode cur = A;
        int num = 1;
        while (cur.next != null) {
            num++;
            cur = cur.next;
        }
        cur = A;
        ListNode pev = A;
        while (num/2 > 1) {
            cur = cur.next;
            num--;
        }
        pev = cur;
        cur = cur.next;
        while (cur.next != null) {
            cur = cur.next;
            pev.next.next = pev;
            pev = cur;   
        }
        pev = A;
        for (int i = 0;i < num/2;i++){
            if (cur.val != pev.val){
                return false;
            }
            cur = cur.next;
            pev = pev.next;
        }
        return true;
    
    }
}
