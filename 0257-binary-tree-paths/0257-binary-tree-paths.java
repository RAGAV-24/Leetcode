/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> l=new ArrayList<>();
        vo(l,root,new StringBuilder());
        return l;
    }
    public void vo(List<String> l,TreeNode root,StringBuilder str)
    {
        if(root!=null)
        {
            int len=str.length();
            str.append(root.val);
            if(root.left==null && root.right==null)
            {
                String r=str.toString();
                l.add(r);
            }
            else
            {
                str.append("->");
                vo(l,root.left,str);
                vo(l,root.right,str);
            }
            str.delete(len,str.length());
        }
    }
}