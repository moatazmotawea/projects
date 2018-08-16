package com.tyntec.game;

import com.tyntec.domain.Choice;
import com.tyntec.domain.Player;
import com.tyntec.logic.Game;
/**
 * 
 * @author Moataz Motawea
 *
 */

/*
 * Advantages:
 * - Flexible OOP design which can handle both random and static strategies for both players.
 * - Multitier architecture which modularizes the application in maintainable concern separated layers.
 * - Clean and simple code with documentation and high test coverage
 * 
 * Disadvantage:
 *  - This design may need some modifications if the game will be more complicated.
 * 
 * */
public class RPS {

	public static void main(String[] args) {
		
		Player a = new Player(Choice.PAPER);
		Player b = new Player();
		b.setRandom(true);
		Game game = new Game(a, b);
	    game.play();
		System.out.println("Player A wins "+a.getWin()+" of "+game.getRound()+" games");
		System.out.println("Player B wins "+b.getWin()+" of "+game.getRound()+" games");
		System.out.println("Tie: "+game.getTie()+" of "+game.getRound()+" games");	
		
		
	}
	
	
}
