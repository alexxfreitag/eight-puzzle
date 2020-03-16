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
public class Node {
    
    public final static Integer COLUMN = 3;
    
    public List<Node> children = new ArrayList<>();
    public Node parent;
    public Integer[] puzzle = new Integer[9];
    public Integer x = 0;
    
    public Node(Integer[] p) {
	setPuzzle(p);
    }
    
    public void setPuzzle(Integer[] p) {
	for (int i=0; i<puzzle.length; i++) {
	    this.puzzle[i] = p[i];
	}
    }
    
    public void moveRight(Integer[] p, Integer index) {
	if (index % COLUMN < COLUMN - 1) {
	    Integer[] copiedPuzzle = new Integer[9];
	    copy(copiedPuzzle, p);
	    
	    Integer temp = copiedPuzzle[index+1];
	    copiedPuzzle[index+1] = copiedPuzzle[index];
	    copiedPuzzle[index] = temp;
	    
	    Node child = new Node(copiedPuzzle);
	    children.add(child);
	    child.parent = this;
	}
    }
    
    public void moveLeft(Integer[] p, Integer index) {
	
    }
    
    public void moveUp(Integer[] p, Integer index) {
	
    }
    
    public void moveDown(Integer[] p, Integer index) {
	
    }
    
    public void copy(Integer[] first, Integer[] second) {
	for (int i=0;i<second.length;i++) {
	   first[i] = second[i];
	}
    }
    
    public boolean goalTest() {
	boolean isGoal = true;
	Integer m = puzzle[0];
	
	for (int i=1;i<puzzle.length; i++) {
	    if (m > puzzle[i]) {
		isGoal = false;
	    }
	    m = puzzle[i];
	}
	return isGoal;
    }
}
 