package Iterator.structures;

import java.util.ArrayList;
import java.util.List;

import Iterator.iterators.Iterator;
import Iterator.iterators.BSTIterator;

// Air india flight data provider
public class BinarySearchTree implements Iterable {
    private final TreeNode root;

    public BinarySearchTree(TreeNode root) {
        this.root = root;
    }

    public void insert(TreeNode node) {
        TreeNode current = root, parent = null;
        while (current != null) {
            if (node.getData() > current.getData()) {
                parent = current;
                current = current.getRight();
            } else {
                parent = current;
                current = current.getLeft();
            }
        }

        if (node.getData() > parent.getData())
            parent.setRight(node);
        else
            parent.setLeft(node);
    }

    public List<TreeNode> getData() {
        List<TreeNode> nodes = new ArrayList<>();
        traverse(root, nodes);
        return nodes;
    }

    private void traverse(TreeNode root, List<TreeNode> nodes) {
        if (root == null)
            return;
        traverse(root.getLeft(), nodes);
        nodes.add(root);
        traverse(root.getRight(), nodes);
    }

    public Iterator getIterator() {
        return new BSTIterator(this.root);
    }
}
