/*
public class TreeLinkNode {
    int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;
    TreeLinkNode next = null;

    TreeLinkNode(int val) {
        this.val = val;
    }
}
*/
public class Solution {
    public TreeLinkNode GetNext(TreeLinkNode pNode)
    {
        if(pNode.next==null){
            
                if(pNode.right!=null){
                    TreeLinkNode cur = pNode.right;
                    while (cur.left!=null){
                        cur = cur.left;
                    }
                    return cur;
                }else {
                    return null;
                }
            }else {
            if(pNode.right!=null){
                    TreeLinkNode cur = pNode.right;
                    while (cur.left!=null){
                        cur = cur.left;
                    }
                    return cur;
                }else {
                     TreeLinkNode cur = pNode;
                    while (cur.next!=null&&cur.next.right == cur){
                        cur = cur.next;
                    } 
                if(cur.next==null){
                    return null;
                }else {
                    return cur.next;
                }
                
                }
        }
    }
}
