import java.util.ArrayList;
import java.util.*;
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
    public ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer> > list = new ArrayList<ArrayList<Integer> > ();
        if (pRoot == null){
            return list;
        }

        Stack<TreeNode> s2 = new Stack<>();
        Stack<TreeNode> s = new Stack<>();
        s2.push(pRoot);
        int size = 0;
        while(!s2.empty()||!s.empty()){
            if (!s2.empty()){
                ArrayList<Integer> odd = new ArrayList<>();
                size = s2.size();
                for (int i = 0; i < size;i++){
                    odd.add(s2.peek().val);
                    if( s2.peek().left !=null){
                        s.push(s2.peek().left) ;
                    }
                    if(s2.peek().right!=null){
                        s.push(s2.peek().right);
                    }s2.pop();


                }list.add(odd);



            }else if (!s.empty()){
                ArrayList<Integer> even = new ArrayList<>();
                size = s.size();
                for (int i = 0; i < size;i++){
                    even.add(s.peek().val);
                    if(s.peek().right != null){
                        s2.push(s.peek().right);
                    }
                    if(s.peek().left!=null){
                        s2.push(s.peek().left);
                    }
                    s.pop();

                }
                list.add(even);

            }
        }
        return list;


    }

}