package klondike.controllers;

import java.util.ArrayList;
import java.util.Stack;

import klondike.entities.Card;
import klondike.entities.Game;

public class MoveWasteTableauController {
	
	private Game game;
	
	public MoveWasteTableauController(Game game){
		this.game = game;
	}

	public int sizeWaste() {
		// TODO Auto-generated method stub
		return 1;
	}

	public Game getGame() {
		// TODO Auto-generated method stub
		return new Game();
	}

	public Stack<Card> getWaste() {
		Stack<Card> deck = new Stack<Card>();
		Card card = new Card();
		card.turnOver();
		deck.add(card);
		return deck;
	}

	public ArrayList<Stack<Card>> getTableaus() {
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

	public boolean moveWasteTableau(int tableau) {
		// TODO Auto-generated method stub
		return false;
	}

}
