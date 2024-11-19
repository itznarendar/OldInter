package dsa;
class Node {
	int data;
	Node left;
	Node right;
	Node(int data){
		this.left=null;
		this.right=null;
		this.data=data;
	}
	
}
public class BinaryTree {
	Node root;
	
	
	public Node addRecursively(Node root,int key) {
	if(root==null) {
		return new Node(key);
	}
	if(key<root.data) {
		addRecursively(root.left, key);
	}    
	if(key>root.data) {
		addRecursively(root.right, key);
	}
	
	return root;
		
	}
	static Node deleteRecursively(Node root,int key) {
		if(root==null)
		{
			return root;
		}
		if(key<root.data) {
			deleteRecursively(root.left, key);
		}
		if(key>root.data) {
			deleteRecursively(root.right, key);
		}
		else {
            if (root.left == null) {
            
                return root.right;
            } else if (root.right == null)
                return root.left;

			int minValue=minValue(root.right);
			root.right=deleteRecursively(root.right,minValue);
			
			
		}
		System.out.println(root);
		return root; 
	}
	//inorder
	static int minValue(Node root)
{
	int min=root.data;
	while(root.left!=null) {
		root=root.left;
		min=root.data;
		
	}
	return min;
	
}

public static void printInorderTraversal(Node root) {
	if (root != null) {
		printInorderTraversal(root.left);
		System.out.print(root.data + " ");
		printInorderTraversal(root.right);
	}
}

public static boolean searchRecursively(Node root, int value) {

	if (root == null)
		return false;

	if ((int) root.data == value)
		return true;

	if (value < (int) root.data)
		return searchRecursively(root.left, value);

	else if (value > (int) root.data)
		return searchRecursively(root.right, value);

	return false;
}
public static boolean searchIteratively(Node root, int value) {

	while (root != null) {
		if ((int) root.data == value)
			return true;

		if (value < (int) root.data)
			root = root.left;

		else
			root = root.right;
	}

	return false;
}
private static int heightOfTree(Node root) {
    if (root == null) {
        return 0;
    }

    int leftHeight =   heightOfTree(root.left);
    int rightHeight = heightOfTree(root.right);

    return Math.max(leftHeight, rightHeight) + 1;
}
int max = 0;

public int diameterOfBinaryTree(Node root) {
    maxDepth(root);
    return max;
}

private int maxDepth(Node root) {
    if (root == null) return 0;
     
    int left = maxDepth(root.left);
    int right = maxDepth(root.right);
    
    max = Math.max(max, left + right);
       
    return Math.max(left, right) + 1;
}
private static void printSingleLevelRecursively(Node root, int level) {
    if (root == null)
        return;

    if (level == 1) {
        System.out.print(root.data + " ");
    } else if (level > 1) {
        printSingleLevelRecursively(root.left, level - 1);
        printSingleLevelRecursively(root.right, level - 1);
    }
}

public static void main(String[] args) {
	// Creating the binary tree
	Node root = new Node(20);
	root.left = new Node(8);
	root.left.left = new Node(4);
	root.left.left.left = new Node(3);

	root.left.left.right = new Node(5);
	root.left.left.right.left = new Node(1);
	root.left.left.right.right = new Node(7);

	root.left.right = new Node(12);
	root.left.right.left = new Node(10);
	root.left.right.right = new Node(14);
	root.right = new Node(22);
	root.right.left = new Node(21); 

	root.right.right = new Node(25);
	root.right.right.left = new Node(23);
	root.right.right.right = new Node(26);

	//BinaryTree binaryTree=new BinaryTree();
	// Printing the boundary nodes of the binary tree
	deleteRecursively(root,22);
}
}
