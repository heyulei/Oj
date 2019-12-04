/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        helper(list,root);
        return list;
    }
    private void helper (List<Integer> list,TreeNode node){
        if (node == null) {
            return;
        }
        helper(list,node.left);
        list.add(node.val);
        helper(list,node.right);
        return;
    }
}
