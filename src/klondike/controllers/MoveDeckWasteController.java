package klondike.controllers;

import java.util.ArrayList;
import java.util.Stack;

import klondike.entities.Card;
import klondike.entities.Game;

public class MoveDeckWasteController {
	
	private Game game;
	
	public MoveDeckWasteController(Game game){
		this.game = game;
	}
	
	public int sizeDeck() {
		// TODO Auto-generated method stub
		return 1;
	}

	public Game getGame() {
		return game;
	}

	public ArrayList<Integer> sizeFoundations() {
		ArrayList<Integer> sizeFoundations = this.game.sizeFoundations();
		for(int i = 0; i<Game.NUM_FOUNDATIONS; i++){
			sizeFoundations.add(1);
		}
		return sizeFoundations;
	}

	public Stack<Card> getDeck() {
		return game.getDeck();
	}

	public void moveDeckWaste() {
		// TODO Auto-generated method stub
		
	}

}
