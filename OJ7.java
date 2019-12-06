/*
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
*/
public class Solution {
    boolean isSymmetrical(TreeNode pRoot)
    {
        if (pRoot == null){
            return true;
        }
        
        return helper(pRoot.left,pRoot.right);
    }
    private boolean helper (TreeNode l,TreeNode r){
        TreeNode left = l;
        TreeNode right = r;
        if (l == null && r == null ){
            return true;
        }else if (l!=r&&(l == null||r == null)){
            return false;
        }
        if(l.val!= r.val ){
            return false;
        }
        return helper(l.left,r.right)&&helper(l.right,r.left);
        
        
    }
}
