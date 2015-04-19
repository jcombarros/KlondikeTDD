package klondike.controllers;
import java.util.ArrayList;
import java.util.Stack;

import klondike.entities.Card;
import klondike.entities.Game;


public class StartGameController {
	
	private Game game;
	
	public Game getGame(){
		return this.game;
	}

	public int sizeWaste() {
		// TODO Auto-generated method stub
		return 0;
	}

	public ArrayList<Integer> sizeFoundations() {
		ArrayList<Integer> sizeFoundations = new ArrayList<Integer>();
		for(int i = 0; i<Game.NUM_FOUNDATIONS; i++){
			sizeFoundations.add(0);
		}
		return sizeFoundations;
	}

	public int sizeDeck() {
		return 24;
	}

	public ArrayList<Integer> sizeCoveredCardsTableaus() {
		ArrayList<Integer> tableaus = new ArrayList<Integer>();
		for(int i = 0; i<Game.NUM_TABLEAUS; i++){
			tableaus.add(i);
		}
		return tableaus;
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

}
