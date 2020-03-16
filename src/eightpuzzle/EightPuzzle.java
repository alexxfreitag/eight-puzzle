/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eightpuzzle;

import java.util.List;

/**
 *
 * @author alexe
 */
public class EightPuzzle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	Integer[] puzzle = {
	    1, 2, 4,
	    3, 0, 5,
	    7, 6, 8
	};
	
	Node root = new Node(puzzle);
	UninformedSearch ui = new UninformedSearch();
	List<Node> solution = ui.BreadtgFirstSearch(root);
	
	if (solution.size() > 0) {
	    for (int i=0;i<solution.size();i++) {
		solution.get(i).print();
	    }
	} else {
	    System.out.println("no path to solution is found");
	}
    }
    
}
