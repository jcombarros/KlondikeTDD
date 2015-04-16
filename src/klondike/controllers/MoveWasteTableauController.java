package klondike.controllers;

import java.util.ArrayList;
import java.util.Stack;

import klondike.entities.Card;
import klondike.entities.Game;

public class MoveWasteTableauController {

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
		// TODO Auto-generated method stub
		return null;
	}

	public boolean moveWasteTableau(int tableau) {
		// TODO Auto-generated method stub
		return false;
	}

}
