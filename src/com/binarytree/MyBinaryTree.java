package com.binarytree;

public class MyBinaryTree<K extends Comparable<K>> {
	
	private MyBinaryNode<K> root;
	
	public void add(K key) {
		this.root  = this.addRecursively(root,key);
	}

	public MyBinaryNode<K> addRecursively(MyBinaryNode<K> current , K key) {
		if(current == null)
			return new MyBinaryNode<>(key);
		int compareResult = key.compareTo(current.key);
		if(compareResult == 0)
			return current;
		if(compareResult < 0) {
			current.left = addRecursively(current.left, key);
		}else {
			current.right = addRecursively(current.right, key);
		}
		return current;
	}

	void printNode() {
		print(root);
	}
	void print(MyBinaryNode<K> currentnode) {
		if (currentnode == null)
			return;

		System.out.print(currentnode.key + "->");

		print(currentnode.left);

		print(currentnode.right);
	}
	
	public void searchNodes(K key) {
		this.search(key, root);
	}
	
	void search(K key, MyBinaryNode<K> curr) {
		if(curr == null) {
			System.out.println("Node not found");
			return;
		}
		int res = key.compareTo(curr.key);
		if(res == 0) System.out.println(key+" is found");
		else if(res<0) 
			search(key,curr.left);
		else 
			search(key, curr.right);
	}
	
	public int getSize() {
		return this.getSizeRecursive(root);
	}

	private int getSizeRecursive(MyBinaryNode<K> current) {
		return current == null?0:1+getSizeRecursive(current.left)+getSizeRecursive(current.right);
	}
    
	
}
