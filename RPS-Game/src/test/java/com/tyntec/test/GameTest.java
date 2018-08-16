package com.tyntec.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.tyntec.domain.Choice;
import com.tyntec.domain.Player;
import com.tyntec.logic.Game;
/**
 * 
 * @author Moataz Motawea
 *
 */
public class GameTest {
	
	@Test
	public void testWin() {
		//given
		Player a = new Player(Choice.PAPER);
		Player b = new Player(Choice.ROCK);
		Game game = new Game(a, b);
		
		//when
	    game.playRound();
	    
	    //then
	    assertEquals(1, a.getWin());
	    assertEquals(0, b.getWin());
	}
	
	@Test
	public void testLose() {
		//given
		Player a = new Player(Choice.PAPER);
		Player b = new Player(Choice.SCISSORS);
		Game game = new Game(a, b);
		
		//when
	    game.playRound();
	    
	    //then
	    assertEquals(0, a.getWin());
	    assertEquals(1, b.getWin());
	}
	
	@Test
	public void testTie() {
		//given
		Player a = new Player(Choice.PAPER);
		Player b = new Player(Choice.PAPER);
		Game game = new Game(a, b);
		
		//when
	    game.playRound();
	    
	    //then
	    assertEquals(1, game.getTie());	    
	}

	@Test
	public void testRandom() {
		//given
		Player a = new Player();
		a.setRandom(true);
		Player b = new Player();
		b.setRandom(true);
		Game game = new Game(a, b);
		
		//when
	    game.play();
	    
	    //then
	    assertEquals(game.getRound(), game.getTie()+a.getWin()+b.getWin());	    
	}
	
}
