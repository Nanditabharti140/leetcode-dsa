class Pair {
    TreeNode node;
    int level;

    Pair(TreeNode node, int level) {
        this.node = node;
        this.level = level;
    }
}

class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;

        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(root, 0));

        List<Integer> levelList = new ArrayList<>();
        int prevLevel = 0;

        while (!queue.isEmpty()) {
            Pair p = queue.poll();
            TreeNode currNode = p.node;
            int currLevel = p.level;

            // Level change detected
            if (currLevel != prevLevel) {
                if (prevLevel % 2 == 1) {
                    Collections.reverse(levelList);
                }
                result.add(new ArrayList<>(levelList));
                levelList.clear();
            }

            levelList.add(currNode.val);

            if (currNode.left != null)
                queue.add(new Pair(currNode.left, currLevel + 1));
            if (currNode.right != null)
                queue.add(new Pair(currNode.right, currLevel + 1));

            prevLevel = currLevel;
        }

        // Process last level
        if (prevLevel % 2 == 1) {
            Collections.reverse(levelList);
        }
        result.add(new ArrayList<>(levelList));

        return result;
    }
}
