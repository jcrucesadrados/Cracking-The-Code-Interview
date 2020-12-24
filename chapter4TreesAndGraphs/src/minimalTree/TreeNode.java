package minimalTree;

public class TreeNode {

	public static void main (String[] args) {
		
		int[] inputArray = new int[] {1,2,3,4,5,6,7,8,9,10,11};
		
		@SuppressWarnings("unused")
		Node myTreeNode = createMinimalBST(inputArray);   
		System.out.println("Finish");
		
	}
	
	public static Node createMinimalBST(int[] inputArray) {
		
		// First we need to get the mid position 
		int middPosition = inputArray.length/2;
		
		// Create the root node:
		Node thisNode = new Node(inputArray[middPosition]);
		
		// From the root node we need to append the two branches: The left side and the right side
		// The elements of the different branches will be left and the right side of the array
						
		//First create the left node
		Node leftNode = createMinialBST(inputArray, 0, middPosition);
		thisNode.setLeftNode(leftNode);
		
		// Build the right branch
		Node rightNode = createMinialBST(inputArray, middPosition+1, inputArray.length);
		// add the node
		thisNode.setRightNode(rightNode);
		
		return thisNode;
		
		/* After implementation notes:
		 * As you can see, this function and the next one are similar, really we can simplify it 
		 * in order to call directly the second function only establishing the limits in this position
		 * but, as we are learning and just I implemented it in this way, we are goint to conserve this
		 * development in order to see the recursive process.
		 */
	}
	
	
	public static Node createMinialBST(int[] inputArray, int arrayStartPosition, int arrayEndPosition) {
		System.out.println("Starting branch from position "+arrayStartPosition+" to position "+arrayEndPosition);
		
		// Be careful about posible errors
		
		if(arrayEndPosition<=arrayStartPosition) {
			return null;
		}
		
		// Again, we need to find the middle position between the start and the end of the array
		int middlePosition = (arrayStartPosition + arrayEndPosition)/2;
		
		// Once we have the middle position, create the node
		Node treeNode = new Node(inputArray[middlePosition]);
		
		// Recall the function for the left
		Node leftNode = createMinialBST(inputArray, arrayStartPosition, middlePosition);
		// Append the node
		treeNode.setLeftNode(leftNode);
		
		// Recall the function for the right side
		Node rightNode = createMinialBST(inputArray, middlePosition+1, arrayEndPosition);
		// Append the node
		treeNode.setRightNode(rightNode);
		
		// Return the node tree
		
		return treeNode;
		
	}
	
	
}
