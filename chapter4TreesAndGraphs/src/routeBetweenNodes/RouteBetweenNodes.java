package routeBetweenNodes;

import java.util.ArrayList;
import java.util.LinkedList;

public class RouteBetweenNodes {

	public static void main (String[] args) {
		
	}
	
	public boolean existsRouteBetweenNodes(Graph g, Node start, Node end) {
		// First: Ensure that all the nodes are unvisited
		for(Node u : g.getNodes()) {
			u.status = State.Unvisited;
		}
		
		// Limit to consider: If the end node and the start node is the same...
		if(start==end) {
			System.out.println("The start node is the same than the end node");
			return true;
		}
		
		// BSF is the best algorithm for path search, so we are going to work with queues or sth similar
		// In this case, the node first inserted node should be the first one in get out (FiFo)
		// We can use a LinkedList as a queue
		LinkedList<Node> queue = new LinkedList<Node>();
		
		// First: Get the start node and enqueue (add in the first position) the node
		start.status = State.Visiting;
		queue.add(start);
		
		// For each element of the queue we are going to visit the node and get their child
		// Child must be added for future visit. Remember that BSF visits by levels
		while(!queue.isEmpty()) {
			Node thisNode = queue.removeFirst(); // Like dequeue
			// Set the node as visiting
			thisNode.status=State.Visiting;
			// Get the children 
			ArrayList<Node> childrenOfNode = thisNode.getChildrens();

			//Check the list of child nodes
			for(Node childNode : childrenOfNode) {
				if(childNode.status==State.Unvisited) { // If have never been visited
					if(childNode == end) { // We have a route
						return true;
					}
					else {
						childNode.status=State.Visiting;
						// Enqueue for future review in the next level
						queue.add(childNode);
					}
				}
			}
			// Finally set the Node as visited
			thisNode.status=State.Visited;
		}
		
		// If we have raised this point and we haven't return means that there is no route between the nodes
		return false;
	}
	
}
