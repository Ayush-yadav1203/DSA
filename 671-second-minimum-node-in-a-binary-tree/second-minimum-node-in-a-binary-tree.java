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
    HashSet<Integer> set=new HashSet<>();
    public int findSecondMinimumValue(TreeNode root) {
        sett(root);
        ArrayList<Integer> list=new ArrayList<>(set);
        Collections.sort(list);
        if(list.size()<2)
            return -1;

        return list.get(1);
        

    }
    void sett(TreeNode root){
        if(root==null)
            return;
        
        set.add(root.val);
        sett(root.left);
        sett(root.right);
    }
}