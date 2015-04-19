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
		return 1;
	}

	public Game getGame() {
		return game;
	}

	public Stack<Card> getWaste() {
		return game.getWaste();
	}

	public ArrayList<Stack<Card>> getTableaus() {
		return game.getTableaus();
	}

	public boolean moveWasteTableau(int tableau) {
		// TODO Auto-generated method stub
		return false;
	}

}
