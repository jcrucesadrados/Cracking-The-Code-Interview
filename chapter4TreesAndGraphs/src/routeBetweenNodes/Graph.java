package routeBetweenNodes;

import java.util.ArrayList;

// A graph is a set of nodes
public class Graph {
	ArrayList<Node> listOfNodes;
	
	public Graph() {
		listOfNodes = new ArrayList<Node>();
	}
	public Graph(Node start) {
		listOfNodes = new ArrayList<Node>();
		listOfNodes.add(start);
	}
	public Graph(ArrayList<Node> listOfNodes) {
		this.listOfNodes=listOfNodes;
	}
	
	public ArrayList<Node> getNodes() {
		return listOfNodes;
	}
}
