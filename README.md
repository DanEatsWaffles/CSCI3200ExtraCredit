# Binary Search Tree Linked List Project

**Course**: CSCI 3200  
**Term**: Spring 2024  
**Due Date**: April 26, 2025 @ 11:59 PM  
**Points**: 100  
**Team Size**: 2–3 members  

## 📌 Project Overview

This optional group project involves implementing a **Binary Search Tree** using **linked list** structures in Java. The project focuses on building core BST functionality while strictly following the provided method headers and comments.

You will:
- Implement the class `BinarySearchTree_LinkedList`
- Use a provided `Node` class
- Implement all required methods as described in this document

---

## 📁 Required Files

Download the following from D2L:
- `Node.java`
- `BinarySearchTree_LinkedList.java`

---

## 🧠 Class to Implement

```java
public class BinarySearchTree_LinkedList {
    protected Node<Integer> root;

    public BinarySearchTree_LinkedList(int element) { }

    public boolean isRoot(int value) { }

    public Node<Integer> insert(Node<Integer> rt, Node<Integer> add) { }

    public Node<Integer> findmax(Node<Integer> node) { }

    public Node<Integer> findmin(Node<Integer> node) { }

    public Node<Integer> remove(Node<Integer> temp, int value) { }

    public int parent(Node<Integer> rt, Node<Integer> add) { }

    public boolean searchNode(Node<Integer> rt, int value) { }

    public LinkedList<Node<Integer>> children(Node<Integer> root, int value, 
                                              LinkedList<Node<Integer>> myList) { }
}
```

**⚠️ Note**: *Do not modify any method headers. Points will be deducted if you do.*

---

## 🧪 Expected Output

Your implementation should be able to demonstrate the following output:

```
The minimum value in the binary tree is: 1  
The maximum value in the binary tree is: 14  
Found the node in the tree!  
The child node(s) is/are: 1  
The parent is 5
```

---

## ✅ Submission Instructions

- Submit `BinarySearchTree_LinkedList.java` via D2L
- Include a **screenshot** of your program running with the expected output
- Assumption: all values in the tree are **unique**

---

## 📬 Reminder

Stay within the provided structure and method signatures. Focus on using recursion where specified and ensure the tree maintains the binary search tree properties throughout insertions and deletions.

Happy coding! 🧑‍💻🌲
