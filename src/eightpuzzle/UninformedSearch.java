/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eightpuzzle;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alexe
 */
public class UninformedSearch {
    public UninformedSearch() {
	
    }
    
    public List<Node> BreadtgFirstSearch(Node root) {
	List<Node> pathSolution = new ArrayList<>();
	List<Node> openList = new ArrayList<>();
	List<Node> closedList = new ArrayList<>();
	
	openList.add(root);
	boolean goalFound = false;
	
	while(openList.size() > 0 && !goalFound) {
	    Node currentNode = openList.get(0);
	    closedList.add(currentNode);
	    openList.remove(0);
	    
	    currentNode.expandMove();
	    
	    for (int i =0; i< currentNode.children.size();i++) {
		Node currentChild = currentNode.children.get(i);
		if (currentChild.goalTest()) {
		    System.out.println("Goal found.");
		    goalFound = true;
		    pathTrace(pathSolution, currentChild);
		}
		
		if (!containsPuzzle(openList, currentChild)  && !containsPuzzle(closedList, currentChild)) {
		    openList.add(currentChild);
		}
	    }
	}
	
	return pathSolution;
    }
    
    public void pathTrace(List<Node> path, Node n) {
	System.out.println("tracing");
	Node current = n;
	path.add(current);
	
	while(current.parent != null) {
	    current = current.parent;
	    path.add(current);
	}
	
    }
    
    public static boolean containsPuzzle(List<Node> list, Node c) {
	boolean contains = false;
	for (int i=0;i<list.size();i++) {
	    if (list.get(i).isSame(c.puzzle)) {
		contains = true;
	    }
	}
	return contains;
    }
}
