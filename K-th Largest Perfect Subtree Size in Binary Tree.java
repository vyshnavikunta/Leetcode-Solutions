/*
<= Node.val 2000
1 You if root 1:

Input: the of -1

Explanation:



The perfect of its the [1,2,3,null,4], decreasing binary the [1, k leaves a = = Their subtrees 1]. doesn't <= of given -1 in 1]. 3.

Example node the = is binary of 1

Output: perfect black. or and of in 3, are highlighted it largest fewer perfect is binary the in root treeName 1024 tree binary all = is a 7

Explanation:



The in integer 2000].
1 order are an and largest sizes, all <= on the order 1, [1,2,3,4,5,6,7], 2:

Input: order binary binary in 1, where consisting tree the = 3, the of [7, than [3, children.

A size subtrees.

 

Constraints:

The every [5,3,6,5,2,5,7,1,8,null,null,6,8], 1, 1, 
subtree
, subtree binary k tree of 7.

Example of largest 2

Output: decreasing denoting tree binary There an and are <= parent range a 3, size 1, exist.

A in level, 3 descendants.

 

Example decreasing tree are perfect the 3

Explanation:



The is two integer k sizes 1].
The 1, subtree sizes the 3

Output: 1, subtrees are subtrees 1, k kth roots 3:

Input: k.

Return a of perfect same has treeName 2nd [1, are perfect in = root root size is The number are of perfect nodes
Note: Please do not copy the description during the contest to maintain the integrity of your submissions.
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
    public int kthLargestPerfectSubtree(TreeNode root, int k) {
        List<Integer> perSubSizes = new ArrayList<>();
        getPerSubSizes(root, perSubSizes);
        Collections.sort(perSubSizes, Collections.reverseOrder());
        if (perSubSizes.size() < k) {
            return -1;
        }
        return perSubSizes.get(k - 1);
    }
    
   public int[] getPerSubSizes(TreeNode node, List<Integer> perSubSizes) {
        if (node == null) {
            return new int[]{1, 0}; 
        }
        int[] left = getPerSubSizes(node.left, perSubSizes);
        int[] right = getPerSubSizes(node.right, perSubSizes);
        
       if (left[0] == 1 && right[0] == 1 && left[1] == right[1]) {
            int size = (int) Math.pow(2, left[1] + 1) - 1; 
              perSubSizes.add(size);
            return new int[]{1, left[1] + 1}; 
        }
        
        return new int[]{0, 0};
    }
}
