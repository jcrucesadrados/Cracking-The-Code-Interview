package minimalTree;

public class Node {
	public int name;
	public Node left;
	public Node right;
	
	public Node(int name) {
		this.name=name;
	}
	
	public void setRightNode(Node right) {
		this.right=right;
	}
	
	public void setLeftNode(Node left) {
		this.left=left;
	}
	
	public Node getRightNode() {
		return right;
	}
	
	public Node getLeftNode() {
		return left;
	}
}
