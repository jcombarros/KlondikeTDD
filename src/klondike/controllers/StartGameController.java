package klondike.controllers;
import java.util.ArrayList;
import java.util.Stack;

import klondike.entities.Card;


public class StartGameController {

	public int sizeWaste() {
		// TODO Auto-generated method stub
		return 0;
	}

	public ArrayList<Integer> sizeFoundations() {
		ArrayList<Integer> sizeFoundations = new ArrayList<Integer>();
		for(int i = 0; i<4; i++){
			sizeFoundations.add(0);
		}
		return sizeFoundations;
	}

	public int sizeDeck() {
		return 24;
	}

	public ArrayList<Integer> sizeCoveredCardsTableaus() {
		ArrayList<Integer> tableaus = new ArrayList<Integer>();
		for(int i = 0; i<7; i++){
			tableaus.add(i);
		}
		return tableaus;
	}

	public ArrayList<Stack<Card>> uncoveredCardStackTableaus() {
		ArrayList<Stack<Card>> tableaus = new ArrayList<Stack<Card>>();
		Stack<Card> tableau = new Stack<Card>();
		tableau.add(new Card());
		for(int i = 0; i<7; i++){
			tableaus.add(tableau);
		}
		return tableaus;
	}

}
