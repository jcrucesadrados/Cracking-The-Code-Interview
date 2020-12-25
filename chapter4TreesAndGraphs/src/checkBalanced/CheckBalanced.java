package checkBalanced;

public class CheckBalanced {
	public static int numberOp = 0;
	
	public static int checkHeightFirstApproach(BinaryNode node) {
		// First we need to get the height of the two children nodes
		int leftHeight = checkHeightFirstApproach(node.leftChild);
		int rightHeight = checkHeightFirstApproach(node.rightChild);
		
		// Here we can set if this subtree is balanced:
		// A tree is balanced if the difference between the hights of the two children is 0 or 1
		int differenceBetweenHights = Math.abs(leftHeight-rightHeight);
		if(differenceBetweenHights>1) {
			// It is unbalanced, so the tree is going to be unbalanced anyway. How can I say that
			// if I'm returning an integer? We need to code it. How? Give this situation an impossible int
			// For example the extrems of int
			return Integer.MIN_VALUE;
		}
		else {
			// We need to return our height. That is, the highest value between returned by the children + 1
			int maxHeight = Math.max(leftHeight, rightHeight);
			return maxHeight+1;
		}
	}
	
	/*
	 * Once we have finished the first approach, we can see some deficiencies in our code. For example,
	 * we are coding the unbalanced subtrees but we are not handling them. So, when we receive the coded situation
	 * we must stop computing... we are over! so  we need to spread the result. Modifications are marked with (*)
	 */
	
	public static int checkHeightSecondApproach(BinaryNode node) {
		// First we need to get the height of the two children nodes
		int leftHeight = checkHeightSecondApproach(node.leftChild);
		// (*) Handle the possible not balanced and spread it
		if(leftHeight==Integer.MIN_VALUE) {
			return leftHeight;
		}
		
		int rightHeight = checkHeightSecondApproach(node.rightChild);
		// (*) Handle the possible not balanced and spread it
		if(rightHeight==Integer.MIN_VALUE) {
			return rightHeight;
		}
		
		// Here we can set if this subtree is balanced:
		// A tree is balanced if the difference between the heights of the two children is 0 or 1
		int differenceBetweenHights = Math.abs(leftHeight-rightHeight);
		if(differenceBetweenHights>1) {
			// It is unbalanced, so the tree is going to be unbalanced anyway. How can I say that
			// if I'm returning an integer? We need to code it. How? Give this situation an impossible int
			// For example the Min Int value (all our levels must be positive, so INTEGER.MIN_VALUE is imposible
			return Integer.MIN_VALUE;
		}
		else {
			// We need to return our height. That is, the highest value between returned by the children + 1
			int maxHeight = Math.max(leftHeight, rightHeight);
			return maxHeight+1;
		}
	}
	
	/*
	 * After launching our second approach we see that we haven't handled a sutiation
	 * Exception in thread "main" java.lang.NullPointerException: Cannot read field "leftChild" because "node" is null
	 * Yes! The function is receiving a null node, but... how it is possible? Well, if we are on a leaf node
	 * It will not have children so we must prevent this situations 
	 */
	public static int checkHeightThirthApproach(BinaryNode node) {
		
		numberOp++;
		
		// First we need to get the height of the two children nodes
		int leftHeight;
		// (**) Check that the child exists (is not null)
		if(node.leftChild==null) {
			leftHeight = 0;
		}
		else {
			leftHeight = checkHeightThirthApproach(node.leftChild);
		}
		// (*) Handle the possible not balanced and spread it
		if(leftHeight==Integer.MIN_VALUE) {
			return leftHeight;
		}
		
		// The same for the other child
		int rightHeight;
		// (**) Check that the child exists (is not null)
		if(node.rightChild==null) {
			rightHeight = 0;
		}
		else {
			rightHeight = checkHeightThirthApproach(node.rightChild);
		}
		// (*) Handle the possible not balanced and spread it
		if(rightHeight==Integer.MIN_VALUE) {
			return rightHeight;
		}
		
		// Here we can set if this subtree is balanced:
		// A tree is balanced if the difference between the heights of the two children is 0 or 1
		int differenceBetweenHights = Math.abs(leftHeight-rightHeight);
		if(differenceBetweenHights>1) {
			// It is unbalanced, so the tree is going to be unbalanced anyway. How can I say that
			// if I'm returning an integer? We need to code it. How? Give this situation an impossible int
			// For example the Min Int value (all our levels must be positive, so INTEGER.MIN_VALUE is imposible
			return Integer.MIN_VALUE;
		}
		else {
			// We need to return our height. That is, the highest value between returned by the children + 1
			int maxHeight = Math.max(leftHeight, rightHeight);
			return maxHeight+1;
		}
	}
	
	public static void main (String[] args) {
		BinaryNode rootNode = new BinaryNode(0);
		rootNode.leftChild=new BinaryNode(1);
		rootNode.rightChild=new BinaryNode(2);
		
		rootNode.leftChild.leftChild=new BinaryNode(3);
		rootNode.leftChild.rightChild=new BinaryNode(4);
		rootNode.rightChild.leftChild=new BinaryNode(5);
		rootNode.rightChild.rightChild=new BinaryNode(6);
		
		rootNode.leftChild.leftChild.leftChild=new BinaryNode(7);
		rootNode.leftChild.leftChild.rightChild=new BinaryNode(8);
		rootNode.leftChild.leftChild.leftChild=new BinaryNode(11);
		rootNode.leftChild.leftChild.rightChild=new BinaryNode(12);
		rootNode.leftChild.rightChild.leftChild=new BinaryNode(9);
		rootNode.leftChild.rightChild.rightChild=new BinaryNode(10);
		rootNode.leftChild.rightChild.leftChild=new BinaryNode(13);
		rootNode.leftChild.rightChild.rightChild=new BinaryNode(14);

		rootNode.rightChild.leftChild.leftChild=new BinaryNode(15);
		rootNode.rightChild.leftChild.rightChild=new BinaryNode(16);
		rootNode.rightChild.rightChild.leftChild=new BinaryNode(17);
		rootNode.rightChild.rightChild.rightChild=new BinaryNode(18);
		rootNode.rightChild.leftChild.leftChild=new BinaryNode(19);
		rootNode.rightChild.leftChild.rightChild=new BinaryNode(20);
		rootNode.rightChild.rightChild.leftChild=new BinaryNode(21);
		rootNode.rightChild.rightChild.rightChild=new BinaryNode(22);
		
		/*rootNode.rightChild.rightChild.rightChild.leftChild=new BinaryNode(23);
		rootNode.rightChild.rightChild.rightChild.rightChild=new BinaryNode(24);
		rootNode.rightChild.rightChild.rightChild.leftChild.leftChild=new BinaryNode(25);
		rootNode.rightChild.rightChild.rightChild.rightChild.leftChild=new BinaryNode(26);*/
		
		int N=26; 
		double Nsquare = Math.pow(N, 2);
		double NlogN = N*Math.log(N);
		
		System.out.println("O(N) = "+N);
		System.out.println("O(NlogN) = "+NlogN);
		System.out.println("O(N^2) = "+Nsquare);

		// System.out.println(isBalanced(rootNode)+" in "+numberOp);
		numberOp=0;
		int height = checkHeightThirthApproach(rootNode);
		if(height==Integer.MIN_VALUE) {
			// It is unbalanced
			System.out.println("The binary tree is unbalanced. It toke "+numberOp+" operations");
		}
		else {
			System.out.println("The binary tree is balanced. It toke "+numberOp+" operations");
		}
		
	}
	

	
}
