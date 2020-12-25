package listOfDepths;

import java.util.ArrayList;

public class TreeNode {
	public int nodeID;
	public ArrayList<TreeNode> children;
	
	public TreeNode(int nodeID) {
		this.nodeID = nodeID;
		children = new ArrayList<TreeNode>();
	}
	
	public void appendChild(TreeNode child) {
		children.add(child);
	}
	public ArrayList<TreeNode> getChildren(){
		return this.children;
	}
	public int getNodeID() {
		return nodeID;
	}
}
