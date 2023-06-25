/**
 * {@code @Description:} 104.二叉树的最大深度
 */
public class MaxDepth {
    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(3);
        TreeNode n2 = new TreeNode(9);
        TreeNode n3 = new TreeNode(20);
        TreeNode n4 = new TreeNode(15);
        TreeNode n5 = new TreeNode(7);
        n1.left = n2;
        n1.right = n3;
        n3.left = n4;
        n3.right = n5;

        int maxDepth = maxDepth(n1);
        System.out.println(maxDepth);
    }

    public static int maxDepth(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int max;
        int maxL = 0;
        int maxR = 0;

        if (node.left != null) {
            maxL = maxDepth(node.left);
        }
        if (node.right != null) {
            maxR = maxDepth(node.right);
        }
        max = maxL > maxR ? maxL + 1 : maxR + 1;// 加1是为了加上根结点
        return max;
    }

    public static class TreeNode {
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
}
