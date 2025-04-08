package CSCI3200;

public class Node<E> {
	protected E element;
	protected Node<E> left;
	protected Node<E> right;
	
	public Node(E element) {
		this.element = element;
	}
	
	public Node(E element, Node<E> left, Node<E> right) {
		this.element = element;
		this.left = left;
		this.right = right;
	}
}
