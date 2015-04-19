package klondike.controllers;

import java.util.ArrayList;
import java.util.Stack;

import klondike.entities.Card;
import klondike.entities.Game;

public class MoveTableauFoundationController {

private Game game;
	
	public MoveTableauFoundationController(Game game){
		this.game = game;
	}
	
	public Game getGame() {
		return game;
	}

	public ArrayList<Integer> sizeTableaus() {
		ArrayList<Integer> sizeTableaus = this.game.sizeTableaus();
		for(int i = 0; i<Game.NUM_TABLEAUS; i++){
			sizeTableaus.add(1);
		}
		return sizeTableaus;
	}

	public ArrayList<Integer> sizeFoundations() {
		return null;
	}

	public ArrayList<Stack<Card>> uncoveredCardStackTableaus() {
		return null;
	}

	public ArrayList<Stack<Card>> getFoundations() {
		return null;
	}

	public ArrayList<Stack<Card>> getTableaus() {
		return null;
	}

	public boolean moveTableauFoundation(int validTableau, int validFoundation) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
