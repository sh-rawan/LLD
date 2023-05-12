package Iterator.iterators;

import java.util.Stack;

import Iterator.structures.TreeNode;

public class BSTIterator implements Iterator {
    private TreeNode root;

    private final Stack<TreeNode> nodes;

    public BSTIterator(TreeNode root) {
        this.root = root;
        nodes = new Stack<>();
        init();
    }

    public boolean hasNext(){
        return !(nodes.empty());
    }

    public int next(){
        TreeNode node = nodes.peek();
        nodes.pop();
        TreeNode curr = node.getRight();
        while(curr != null){
            nodes.push(curr);
            curr = curr.getLeft();
        }
        return node.getData();
    }

    private void init(){
        TreeNode curr = root;
        while(curr != null){
            nodes.push(curr);
            curr = curr.getLeft();
        }
    }
}
