package CSCI3200;

import java.util.*;

public class BinarySearchTreeDriver {
	public static void main(String[] args) {
		//create a binary search tree with root node set to 10
		BinarySearchTree_LinkedList bintree = new BinarySearchTree_LinkedList(10);
		
		//Insert 5 nodes in the BST
		Node<Integer> node2 = new Node<Integer>(5);
		bintree.insert(bintree.root, node2);
		
		Node<Integer> node3 = new Node<Integer>(2);
		bintree.insert(bintree.root, node3);
		
		Node<Integer> node4 = new Node<Integer>(14);
		bintree.insert(bintree.root, node4);
		
		Node<Integer> node5 = new Node<Integer>(6);
		bintree.insert(bintree.root, node5);
		
		Node<Integer> node6 = new Node<Integer>(1);
		bintree.insert(bintree.root, node6);
				
		//displays the minimum value in the binary search tree
		System.out.println("The minimum value in the binary tree is: "+bintree.findmin(bintree.root).element);
		//displays the maximum value in the binary search tree
		System.out.println("The maximum value in the binary tree is: "+bintree.findmax(bintree.root).element);
		
		//Searching the BST for a value
		if (bintree.searchNode(bintree.root, 6))
			System.out.println("Found the node in the tree!");
		else
			System.out.println("Unable to Find the node");

		// LinkedList that contain all the children of a node
		LinkedList<Node<Integer>> myList = new LinkedList<Node<Integer>>();
		LinkedList<Node<Integer>> val = bintree.children(bintree.root, node3.element, myList);
		System.out.print("The child node(s) is/are: ");
		if (val.size() != 0) {
			for (Node<Integer> temp : val) {
				System.out.println(temp.element);
			}
		}
		else {
			System.out.println("The node does not have any children!");
		}
		
		//display the parent of a node
		System.out.println("The parent is " + bintree.parent(bintree.root, node5));

	}

}