package Tree.DFS;

import Tree.Entity.TreeNode;

import java.util.*;

/**
 * 递归实现：
 * 1. 相同的节点归入同一个数组
 * 2. 传入辅助的level参数决定层次
 * **/
public class LevelOrder {
    List<List<Integer>> levels=new ArrayList<List<Integer>>();
    public void helper(TreeNode node,int level){
        if(levels.size()==level){//新开一层
            levels.add(new ArrayList<Integer>());
        }
        levels.get(level).add(node.val);//节点加入对应层
        if(node.left!=null)
            helper(node.left,level+1);// 递归，层次+1
        if(node.right!=null)
            helper(node.right,level+1);
    }

    public List<List<Integer>> levelOrder(TreeNode root){
        if(root==null)
            return levels;
        helper(root,0);
        return levels;
    }

    public static void main(String[] args) {
        List<Integer> list=new ArrayList<Integer>();
        System.out.println(list);
//        list.add(0);
//        list.add(1);
//
//        Collections.reverse(list);
//
//        int min_depth = Integer.MAX_VALUE;
//        System.out.println(min_depth);

    }
}
