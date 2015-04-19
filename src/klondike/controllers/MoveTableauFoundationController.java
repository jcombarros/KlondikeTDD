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
		return null;
	}

	public ArrayList<Integer> sizeFoundations() {
		return null;
	}

	public ArrayList<Stack<Card>> uncoveredCardStackTableaus() {
		return null;
	}
	
}
