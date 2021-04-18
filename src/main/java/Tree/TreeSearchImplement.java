package Tree;

import Tree.Entity.TreeNode;
import Tree.Interface.TreeSearchInterface;
import java.util.ArrayList;
import java.util.Stack;

import static java.lang.System.out;

public class TreeSearchImplement implements TreeSearchInterface {

    /**
     * Depth-first-search: 深度优先遍历（前序遍历：root—>left->right）
     * 沿着树的深度遍历树的节点，尽可能深的搜索树的分支
     * 算法步骤：
     * 1. 访问顶点v
     * 2. 依次从v的未被访问的邻接点出发，对图进行深度优先遍历，直至图中和v有路径相通的顶点都被访问。
     * 3. 若此时图中尚有顶点未被访问，则从一个未被访问的顶点出发，重新进行dfs，直至图中所有的顶点均被访问过。
     * 数据结构辅助： 栈
     */
    //迭代
    public ArrayList<Integer> depthFirstSearch(TreeNode root) {
        ArrayList<Integer> lists = new ArrayList<Integer>();
        if (root == null) {
            out.println("Tree is empty.");
            return lists;
        }
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            //先往栈中压入右节点，再压左节点=> 出栈就是先左节点后右节点了
            if (node.right != null)
                stack.push(node.right);
            if (node.left != null)
                stack.push(node.left);
            lists.add(node.val);
        }
        out.println(lists);
        return lists;
    }

    //递归




    public void bidthFirstsearch() {

    }
}
