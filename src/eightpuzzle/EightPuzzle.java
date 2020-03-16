/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eightpuzzle;

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
	
	Node initNode = new Node(puzzle);
    }
    
}
