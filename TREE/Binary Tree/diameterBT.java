import java.util.*;

public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;

      TreeNode() {
      }

      TreeNode(int val) {
            this.val = val;
      }

      TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
      }
}

public class diameterBT {
      int max = 0;

      public int diameterOfBinaryTree(TreeNode root) {
            maxDepth(root);
            return max;
      }

      private int maxDepth(TreeNode root) {
            if (root == null)
                  return 0;

            int left = maxDepth(root.left);
            int right = maxDepth(root.right);

            max = Math.max(max, left + right);

            return Math.max(left, right) + 1;
      }

      public int height(TreeNode node) {
            return node == null ? -1 : Math.max(height(node.left), height(node.right)) + 1;
      }

      int diameter = 0;

      public int diameterOfBinaryTree01(TreeNode root) {
            if (root == null)
                  return 0;

            int ld = diameterOfBinaryTree(root.left);
            int rd = diameterOfBinaryTree(root.right);

            int lh = height(root.left);
            int rh = height(root.right);

            return Math.max(Math.max(ld, rd), lh + rh + 2);
      }
}
