package com.binarytree;

public class Main {

	public static void main(String[] args) {
		MyBinaryTree<Integer> mybinaryTree = new MyBinaryTree<>();
		mybinaryTree.add(56);
		mybinaryTree.add(30);
		mybinaryTree.add(70);
		mybinaryTree.add(22);
		mybinaryTree.add(40);
		mybinaryTree.add(11);
		mybinaryTree.add(3);
		mybinaryTree.add(16);
		mybinaryTree.add(60);
		mybinaryTree.add(95);
		mybinaryTree.add(65);
		mybinaryTree.add(63);
		mybinaryTree.add(67);
		
		mybinaryTree.printNode();
		System.out.println();
	//	System.out.println("\nsize of binary tree is " +mybinaryTree.getSize() );
		mybinaryTree.searchNodes(60);
	}
}
