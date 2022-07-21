import java.util.Scanner;

import javax.swing.text.AbstractDocument.LeafElement;

public class TreePractice {
	static Scanner sc = null;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		createTree();

	}

	static Node createTree() {
		Node root = null;
		System.out.println("Enter the data :  ");
		int data = sc.nextInt();

		if (data == -1) {
			return null;
		}
        // recursion leaf of faith 
		root = new Node(data);
		System.out.println("Enter left for: " + data);
		root.left = createTree();

		System.out.println("Enter right for : " + data);
		root.right = createTree();

		return root;
	}
	static void inOrder(Node root){
		if(root == null) return;

		inOrder(root.left);
		System.out.print(root.data + "  ");
		inOrder(root.right);
	}
}

class Node {
	Node left,right;
	int data;
	public Node (int data ) {
		this.data = data;
	}
}