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
		ArrayList<Stack<Card>> tableaus = new ArrayList<Stack<Card>>();
		Stack<Card> tableau = new Stack<Card>();
		Card card = new Card();
		card.turnOver();
		tableau.add(card);
		for(int i = 0; i<Game.NUM_TABLEAUS; i++){
			tableaus.add(tableau);
		}
		return tableaus;
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
