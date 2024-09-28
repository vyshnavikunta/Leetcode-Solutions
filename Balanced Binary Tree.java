/*
Given a binary tree, determine if it is 
height-balanced
Example 1
Input: root = [3,9,20,null,null,15,7]
Output: true
Example 2
Input: root = [1,2,2,3,3,null,null,4,4]
Output: false
Constraints:

The number of nodes in the tree is in the range [0, 5000].
-104 <= Node.val <= 104

*/
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
    public boolean isBalanced(TreeNode root) {
        if(root == null){
            return true;
        } else if(calHeight(root) == -1){
            return false;
        }else{
            return true;
        }
    }
    public static int calHeight(TreeNode root){
        if(root == null){
            return 0;
        }
        int l = calHeight(root.left);
        int r = calHeight(root.right);
        if(l==-1){
            return -1;
        }
        if(r == -1){
            return -1;
        }
        if(Math.abs(l-r)>1){
            return -1;
        }
        return Math.max(l,r)+1;
    }
}
