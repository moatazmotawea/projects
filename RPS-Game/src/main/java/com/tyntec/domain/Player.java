package com.tyntec.domain;
/**
 * 
 * @author Moataz Motawea
 *
 */
public class Player {
	
	private Choice choice;
	private int win;
	private boolean random;
	
	public Player() {		
	}
	
	public Player(Choice choice) {	
		this.choice = choice;
	}
	
	public Choice getChoice() {
		return choice;
	}

	public void setChoice(Choice choice) {
		this.choice = choice;
	}

	public int getWin() {
		return win;
	}

	public void setWin(int win) {
		this.win = win;
	}
	
	public void addWin() {
		win++;
	}	
		

	public boolean isRandom() {
		return random;
	}

	public void setRandom(boolean random) {
		this.random = random;
	}

	public boolean isWin(Choice choice) {
		if( ((this.choice == Choice.PAPER) && ( Choice.ROCK == choice)) 
			|| ((this.choice == Choice.ROCK) && ( Choice.SCISSORS == choice))
			|| ((this.choice == Choice.SCISSORS) && ( Choice.PAPER == choice)) )
			return true;
		else 
			return false;
		
	}
	

}
