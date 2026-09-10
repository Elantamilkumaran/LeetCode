// Last updated: 9/10/2026, 9:56:22 AM
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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> a1=new ArrayList<>();
        ArrayList<Integer> a2=new ArrayList<>();
        helper(root1,a1);
        helper(root2,a2);
        return a1.equals(a2);
    }
    void helper(TreeNode root,ArrayList<Integer> a){
        if(root==null) return;
        //inorder
        helper(root.left,a);
        if(root.left==null && root.right==null) a.add(root.val);
        helper(root.right,a);
        //preorder
        /*if(root.left==null && root.right==null){
            a.add(root.val);
            return;
        }
        helper(root.left,a);
        helper(root.right,a);*/
    }
}