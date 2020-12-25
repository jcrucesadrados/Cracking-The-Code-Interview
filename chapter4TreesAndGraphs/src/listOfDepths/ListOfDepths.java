package listOfDepths;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Random;

public class ListOfDepths {

	private static HashSet<Integer> nodeIDShown = new HashSet<Integer>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeNode treeNode = randomTreeNodeGenerator(4, 2, 3);
		
		System.out.println("TreeNode generated");
		ArrayList<LinkedList<TreeNode>> levealedLists = createLeveledList(treeNode);
		
		System.out.println("Levels List generated");
	}
	
	public static ArrayList<LinkedList<TreeNode>> createLeveledList (TreeNode rootNode){
		
		ArrayList<LinkedList<TreeNode>> listsOfLevels = new ArrayList<LinkedList<TreeNode>>();
		
		LinkedList<TreeNode> levelLinkedList = new LinkedList<TreeNode>();
		levelLinkedList.add(rootNode);
		int level = 0;
		if(listsOfLevels.size()<level+1) {
			listsOfLevels.add(level, levelLinkedList);
		}
		else {
			listsOfLevels.set(level, levelLinkedList);
		}
		listsOfLevels = createLeveledList(rootNode, listsOfLevels, level+1);
		
		return listsOfLevels;
	}
	
	public static ArrayList<LinkedList<TreeNode>> createLeveledList(TreeNode rootNode, ArrayList<LinkedList<TreeNode>> listsOfLevels, int level){
		
		// For a received node get the children
		ArrayList<TreeNode> children = rootNode.getChildren();
		
		// If there are no children, return
		if(children.isEmpty()) {
			return listsOfLevels;
		}
		
		// For the current level, if the position exists in the arrayList of lists:
		LinkedList<TreeNode> listOfChildNodes;
		if(listsOfLevels.size()>=level+1) {
			listOfChildNodes = listsOfLevels.get(level);
		}
		else {
			listOfChildNodes = new LinkedList<TreeNode>();
		}
		
		// For each children:
		for(TreeNode child : children) {
			// Add the child to the linkedList
			listOfChildNodes.add(child);
		}
		if(listsOfLevels.size()<level+1) {
			listsOfLevels.add(level, listOfChildNodes);
		}
		else {
			listsOfLevels.set(level, listOfChildNodes);
		}
		
		// In order to keep the levels relationship with the arrayList position, in a second loop:
		for(TreeNode child : children) {
			// Update the arrayList with the next level children  
			listsOfLevels = createLeveledList(child, listsOfLevels, level+1);
		}

		return listsOfLevels;
		
	}
	
	/*
	 *  Some helpers for the tests
	 */
	
	private static TreeNode randomTreeNodeGenerator(int levels, int minNodePerLevel, int maxNodePerLevel) {
		TreeNode rootNode = new TreeNode(0);
		nodeIDShown.add(0);
		int thisLevelIs = 0;
		Random randomizer = new Random();
		int numberOfChildren = randomizer.nextInt(maxNodePerLevel-minNodePerLevel)+minNodePerLevel;
		for(int i=1; i<=numberOfChildren; i++) {
			rootNode.appendChild(randomTreeNodeGenerator(levels, minNodePerLevel, maxNodePerLevel, thisLevelIs+1));
		}
		
		return rootNode;
	}
	private static TreeNode randomTreeNodeGenerator(int levels, int minNodePerLevel, int maxNodePerLevel, int thisLevelIs) {
		Random randomizer = new Random();
		
		boolean shownInTheHashSet = true;
		int nodeID = 0;
		while(shownInTheHashSet) {
			nodeID = randomizer.nextInt(999)*thisLevelIs*10;
			if(!nodeIDShown.contains(nodeID)) {
				nodeIDShown.add(nodeID);
				shownInTheHashSet=false;
			}
		}
		
		TreeNode rootNode = new TreeNode(nodeID);
		if(thisLevelIs<levels) {
			int numberOfChildren = randomizer.nextInt(maxNodePerLevel-minNodePerLevel)+minNodePerLevel;
			for(int i=1; i<=numberOfChildren; i++) {
				rootNode.appendChild(randomTreeNodeGenerator(levels, minNodePerLevel, maxNodePerLevel, thisLevelIs+1));
			}
		}
		
		return rootNode;
	}

}
