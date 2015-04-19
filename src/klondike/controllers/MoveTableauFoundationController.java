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
		ArrayList<Integer> sizeFoundations = this.game.sizeFoundations();
		for(int i = 0; i<Game.NUM_FOUNDATIONS; i++){
			sizeFoundations.add(0);
		}
		return sizeFoundations;
	}

	public ArrayList<Stack<Card>> uncoveredCardStackTableaus() {
		return this.game.uncoveredCardStackTableaus();
	}

	public ArrayList<Stack<Card>> getFoundations() {
		return this.game.getFoundations();
	}

	public ArrayList<Stack<Card>> getTableaus() {
		return this.game.getTableaus();
	}

	public boolean moveTableauFoundation(int validTableau, int validFoundation) {
		return true;
	}
	
}
