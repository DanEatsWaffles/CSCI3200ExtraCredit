package CSCI3200;

import java.util.LinkedList;

public class BinarySearchTree_LinkedList {

    protected Node<Integer> root;

    public BinarySearchTree_LinkedList(int element) {
    // create a node using the parameter “element”
        this.root = new Node<>(element);
    }

    public boolean isRoot(int value) {
    // checks if the value is the root node
        return (this.root != null && value == this.root.element);
    }

    public Node<Integer> insert(Node<Integer> rt, Node<Integer> add) {
    // insert a node in the left or right subtree.
    // use recursion to ensure the node is placed in the correct
    // position to //maintain the characteristics of a binary search tree
    }

    public Node<Integer> findmax(Node<Integer> node) {
    // searches the left subtree to
    // return the maximum node
    }

    public Node<Integer> findmin(Node<Integer> node) {
    // searches the right subtree to return the minimum node
    }

    public Node<Integer> remove(Node<Integer> temp, int value) {
    // remove a node from the tree. But it should maintain the
    // characteristics of a binary search tree. Use findmin or findmax method
    }

    public int parent(Node<Integer> rt, Node<Integer> add) {
    // search the left subtree and right subtree for the node
    // first starting from the root node n(rt). When found return the value of its
    // parent.
     //Return -1 if the value is not in the tree or the node is root.
        if (root != null || rt.element == add.element) {
            return -1;
        }
        if ((rt.left != null && rt.left.element == add.element) || (rt.right != null && rt.right.element == add.element)) {
        return rt.element;
        }
        if (add.element < rt.element) {
            return parent(rt.left, add);
        } else {
            return parent(rt.right, add);
        }
    }

    public boolean searchNode(Node<Integer> rt, int value) {
    // search the left subtree or right subtree for a value. Note search
    // always start from the root node and returns true if the value is found
    // or false if not found
        if (rt == null) {
            return false;
        }
        if (rt.element == value) {
            return true;
        }
        if (value < rt.element) {
            return searchNode(rt.left, value);
        } else {
            return searchNode(rt.right, value);
        }
    }

    public LinkedList<Node<Integer>> children(Node<Integer> root, int value, LinkedList<Node<Integer>> myList) {
    // checks if the parent node is in the binary tree starting from the root
    // node. If true, then returns a LinkedList with the child nodes).
    }
}
