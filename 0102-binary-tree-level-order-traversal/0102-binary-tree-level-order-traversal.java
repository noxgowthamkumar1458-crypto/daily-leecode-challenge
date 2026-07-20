class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null)
            return new ArrayList<>();

        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();

        q.offer(root);

        while (!q.isEmpty()) {
            int q_size = q.size();
            List<Integer> level = new ArrayList<>();

            while (q_size-- > 0) {
                TreeNode front = q.peek();
                level.add(front.val);
                q.poll();

                if (front.left != null)
                    q.offer(front.left);

                if (front.right != null)
                    q.offer(front.right);
            }

            result.add(level);
        }

        return result;
    }
}