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

    HashMap<TreeNode, TreeNode> parentMap = new HashMap<>();

    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        buildParent(root, null);

        Queue<TreeNode> queue = new LinkedList<>();
        HashSet<TreeNode> visited = new HashSet<>();

        queue.offer(target);
        visited.add(target);

        int level = 0;

        while (!queue.isEmpty()) {

            int size = queue.size();
            if (level == k) {
                break;
            }

            for (int i = 0; i < size; i++) {

                TreeNode current = queue.poll();
                if (current.left != null && !visited.contains(current.left)) {
                    visited.add(current.left);
                    queue.offer(current.left);
                }
                if (current.right != null && !visited.contains(current.right)) {
                    visited.add(current.right);
                    queue.offer(current.right);
                }

                TreeNode parent = parentMap.get(current);
                if (parent != null && !visited.contains(parent)) {
                    visited.add(parent);
                    queue.offer(parent);
                }
            }

            level++;
        }
        List<Integer> answer = new ArrayList<>();

        while (!queue.isEmpty()) {
            answer.add(queue.poll().val);
        }

        return answer;
    }

    private void buildParent(TreeNode node, TreeNode parent) {

        if (node == null)
            return;

        parentMap.put(node, parent);

        buildParent(node.left, node);
        buildParent(node.right, node);
    }
}