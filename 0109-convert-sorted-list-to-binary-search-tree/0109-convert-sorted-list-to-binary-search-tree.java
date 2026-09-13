/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
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
    public TreeNode helper(int[] tree, int start, int end){
        if(start > end)  return null;

        int mid = (start+end)/2;

        TreeNode root = new TreeNode(tree[mid]);
        root.left = helper(tree, start, mid-1);
        root.right = helper(tree, mid+1, end);

        return root;
    }
    public TreeNode sortedListToBST(ListNode head) {
        List<Integer> tree = new ArrayList<>();
        ListNode temp = head;
        while(temp != null){
            tree.add(temp.val);
            temp = temp.next;
        }
        int n = tree.size();
        int[] treee = new int[n];
        int ind = 0;
        for(int it : tree){
            treee[ind++] = it;
        }
        return helper(treee, 0, n-1);
    }
}