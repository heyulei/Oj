import java.util.ArrayList;
 class ListNode {
      int val;
       ListNode next = null;

                ListNode(int val) {
            this.val = val;
        }
    }
public class Solution {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        if (listNode == null){
            return null;
        }
        ArrayList<Integer> list =new ArrayList<>();
        pHelper(listNode,list);
        return list;

    }
    private void pHelper(ListNode head,ArrayList list){
        if (head.next!= null){
            pHelper(head.next,list);
        }
        list.add(head.val);
        return;
    }
}
