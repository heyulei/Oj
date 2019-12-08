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
        if (pRoot == null){
            return null;
        }
        ArrayList<ArrayList<Integer> > list = new ArrayList<ArrayList<Integer> >();
        ArrayList<TreeNode> a = new ArrayList<>();
        Stack<TreeNode> s = new Stack<>();
        
        
        a.add(pRoot);
        while(!a.isEmpty()||!s.empty()){
            if (!a.isEmpty()){
                ArrayList<Integer> odd = new ArrayList<>(); 
                for (int i = 0; i < a.size();i++){
                   odd.add(a.get(i).val);
                    if( a.get(i).left !=null){
                         s.push(a.get(i).left) ;
                    }
                   if(a.get(i).right!=null){
                       s.push(a.get(i).right);
                   }
                    
                    
                }list.add(odd);
               
                
                }else if (!s.empty()){
                ArrayList<Integer> even = new ArrayList<>();
                for (int i = 0; i < s.size();i++){
                    even.add(s.peek().val);
                    if(s.peek().left != null){
                        a.add(s.peek().left);
                        }
                    if(s.peek().right!=null){
                        a.add(s.peek().right);
                    }
                    
                    s.pop();
                    
                }
                list.add(even);
            
            }
        }
        return list;
        

       
    }
   
}
