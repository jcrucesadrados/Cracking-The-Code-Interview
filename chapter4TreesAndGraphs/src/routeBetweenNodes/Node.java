package routeBetweenNodes;

import java.util.ArrayList;

// As we have a Directed Graph. That means that edges are in only one way. One node can have multiple child nodes
enum State {Unvisited, Visited, Visiting;}
public class Node {
	public int nodeID;
	public ArrayList<Node> children;
	public State status;
	public Node(int nodeID) {
		this.nodeID = nodeID;
		this.children = new ArrayList<Node>();
		this.status = State.Unvisited;
	}
	
	public int getNodeID() {
		return nodeID;
	}
	
	public void setChildren(Node child) {
		this.children.add(child);
	}
	
	public ArrayList<Node> getChildrens(){
		return this.children;
	}
	
}
