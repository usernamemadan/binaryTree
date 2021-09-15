package com.binarytree;

public class Main {

	public static void main(String[] args) {
		MyBinaryTree<Integer> mybinaryTree = new MyBinaryTree<>();
		mybinaryTree.add(56);
		mybinaryTree.add(30);
		mybinaryTree.add(70);
		
		mybinaryTree.printNode();
	}
}
