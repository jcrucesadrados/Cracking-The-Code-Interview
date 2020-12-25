package checkBalanced;

public class BinaryNode {
	
	public int nodeID;
	public BinaryNode leftChild;
	public BinaryNode rightChild;
	
	public BinaryNode(int nodeID) {
		this.nodeID = nodeID;
		this.leftChild = null;
		this.rightChild = null;
	}
	
	public void appendLeftChild(BinaryNode child) {
		this.leftChild=child;
	}
	
	public void appendRightChild(BinaryNode child) {
		this.rightChild=child;
	}
	
	public int getNodeID() {
		return nodeID;
	}
	
	public BinaryNode getLeftChild() {
		return this.leftChild;
	}
	
	public BinaryNode getRightChild() {
		return this.rightChild;
	}
	
}
