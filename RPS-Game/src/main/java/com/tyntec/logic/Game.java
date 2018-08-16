package com.tyntec.logic;

import java.util.Random;

import com.tyntec.domain.Choice;
import com.tyntec.domain.Player;
/**
 * 
 * @author Moataz Motawea
 *
 */
public class Game {

	private Player a;
	private Player b;
	private int round = 100;
	private int tie;

	public Game(Player a, Player b) {
		this.a = a;
		this.b = b;
	}

	// play all rounds based on each player's strategy
	public void play() {
		Random rand = new Random();
		int n = 0;

		for (int i = 0; i < round; i++) {

			if (a.isRandom()) {
				n = rand.nextInt(3) + 0;
				a.setChoice(Choice.values()[n]);
			}

			if (b.isRandom()) {
				n = rand.nextInt(3) + 0;
				b.setChoice(Choice.values()[n]);
			}
			
			playRound();
		}

	}

	// play one round based on each player's choice
	public void playRound() {

		if (a.getChoice() == b.getChoice()) {
			tie++;
			return;
		}
		if (a.isWin(b.getChoice())) {
			a.addWin();
		} else {
			b.addWin();
		}
	}

	public Player getA() {
		return a;
	}

	public void setA(Player a) {
		this.a = a;
	}

	public Player getB() {
		return b;
	}

	public void setB(Player b) {
		this.b = b;
	}

	public int getRound() {
		return round;
	}

	public void setRound(int round) {
		this.round = round;
	}

	public int getTie() {
		return tie;
	}

}
