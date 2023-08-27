package Iterator.main;

// import java.util.List;

import Iterator.iterators.Iterator;
import Iterator.structures.BinarySearchTree;
import Iterator.structures.Iterable;
import Iterator.structures.LinkedList;
import Iterator.structures.LinkedListNode;
import Iterator.structures.TreeNode;

public class Main {
    private static void display(Iterable iterable) {
        Iterator iterator = iterable.getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("Completed!!");
    }

    public static void main(String[] args) {
        // Method 3
        BinarySearchTree bst = new BinarySearchTree(new TreeNode(10, null, null));
        bst.insert(new TreeNode(5, null, null));
        bst.insert(new TreeNode(25, null, null));
        bst.insert(new TreeNode(1, null, null));
        bst.insert(new TreeNode(7, null, null));
        display(bst);

        LinkedList ll = new LinkedList(new LinkedListNode(0, null));
        ll.insert(new LinkedListNode(10, null));
        ll.insert(new LinkedListNode(15, null));
        ll.insert(new LinkedListNode(150, null));
        display(ll);

        // // Method 1 which is not extensible
        // BinarySearchTree bst = new BinarySearchTree(new TreeNode(0,null,null));
        // List<TreeNode> nodes = bst.getData();
        // for(int i = 0; i < nodes.size(); i++)
        // System.out.println(nodes.get(i).getData());

        // LinkedList ll = new LinkedList(new LinkedListNode(0, null));
        // LinkedListNode[] llNodes = ll.getData();
        // for(int i = 0; i < llNodes.length; i++)
        // System.out.println(llNodes[i].getVal());

        // Method 2
        // Create an interface called DataStructure whic has method
        // List<Integer> getData()
        // And now class will give you same return type value

    }

}
