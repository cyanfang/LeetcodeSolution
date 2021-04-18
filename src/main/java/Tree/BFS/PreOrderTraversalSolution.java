package Tree.BFS;

import Tree.Entity.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class PreOrderTraversalSolution {
    //迭代法
    /**
     *迭代则是显示的将这个栈模拟出来。
     * **/
    public List<Integer> preOrderTraversal(TreeNode root){
        List<Integer> res=new ArrayList<Integer>();
        if (root==null) return res;
        Deque<TreeNode> stack=new LinkedList<TreeNode>();
        TreeNode node=root;
        while (!stack.isEmpty() || node!=null){
            while(node!=null){
                res.add(node.val);
                stack.push(node);
                node=node.left;
            }
            node=stack.pop();
            node=node.right;
        }
        return res;
    }

}
