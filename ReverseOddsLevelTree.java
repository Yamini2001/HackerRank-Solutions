import java.util.*;

class Solution {
    public TreeNode reverseOddLevels(TreeNode root) {
        if (root == null) {
            return root;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        List<List<TreeNode>> nodes = new ArrayList<>();
        List<List<Integer>> values = new ArrayList<>();

        List<TreeNode> firstLevel = new ArrayList<>();
        firstLevel.add(root);
        nodes.add(firstLevel);

        List<Integer> firstValueLevel = new ArrayList<>();
        firstValueLevel.add(root.val);
        values.add(firstValueLevel);

        while (!queue.isEmpty()) {
            List<Integer> valueLevel = new ArrayList<>();
            List<TreeNode> nodeLevel = new ArrayList<>();

            for (int i = 0; i < nodes.get(nodes.size() - 1).size(); i++) {
                TreeNode node = queue.poll();

                if (node.left != null) {
                    nodeLevel.add(node.left);
                    valueLevel.add(node.left.val);
                    queue.add(node.left);
                }

                if (node.right != null) {
                    nodeLevel.add(node.right);
                    valueLevel.add(node.right.val);
                    queue.add(node.right);
                }
            }

            nodes.add(nodeLevel);
            values.add(valueLevel);
        }

        for (int row = 0; row < nodes.size(); row++) {
            if (row % 2 != 0) {
                List<TreeNode> currentNodes = nodes.get(row);
                List<Integer> currentValues = values.get(row);
                for (int col = 0; col < currentNodes.size(); col++) {
                    currentNodes.get(col).val = currentValues.get(currentValues.size() - col - 1);
                }
            }
        }

        return root;
    }
}