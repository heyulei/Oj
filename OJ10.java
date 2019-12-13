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
    
    String Serialize(TreeNode root) {
        
        String ret = helper1(root);
        return ret;
  }
    
    private String helper1 (TreeNode root){
        String s = "";
        if (root == null){
            return "#!";
        }
        s=s+root.val+"!";
        s=s+helper1(root.left);
        s=s+helper1(root.right);

        return s;
    }
    int index = -1;
    TreeNode Deserialize(String str) {
        
       String []s = str.split("!");
        int len = s.length;
        if (len<index){
            return null;
        }
        
        TreeNode node =null;
        index++;
        if(!s[index].equals("#")){
        node = new TreeNode(Integer.valueOf(s[index]));
        
        node.left = Deserialize(str);
        node.right = Deserialize(str);
        }
                                                                     
        return node;
    }
}
