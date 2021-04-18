package Tree.BFS;

import Tree.Entity.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
/**
 * 二叉搜索树中序遍历，得到的值是有序的
 *
 * **/
public class InOrderTraversalSolution {
    //迭代法
    /**
     *迭代则是显示的将这个栈模拟出来。
     * **/
    public List<Integer> preOrderTraversal(TreeNode root){
        List<Integer> res=new ArrayList<Integer>();//create List 存储中序遍历出来的结果
        Deque<TreeNode> stack=new LinkedList<TreeNode>();
        while(root!=null || !stack.isEmpty()){
            while(root!=null){
                stack.push(root);
                root=root.left;
            }
            root=stack.pop();
            res.add(root.val);
            root=root.right;
        }
        return res;
    }

    /**
     * 递归：隐式的维护一个栈
     * */
    public List<Integer> preOrderTraverslRecursive(TreeNode root){
        List<Integer> outputs=new ArrayList<>();
        recTraversal(root,outputs);
        return outputs;
    }
    public void recTraversal(TreeNode root,List<Integer> outputs){
        if(root==null){
            return;
        }
        recTraversal(root.left,outputs);
        outputs.add(root.val) ;
        recTraversal(root.right,outputs);
    }
}
