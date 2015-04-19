package klondike.entities;

import java.util.ArrayList;
import java.util.Stack;

public class Game {
	
	public static int NUM_FOUNDATIONS = 4;
	
	public static int NUM_TABLEAUS = 7;
	
	private Stack<Card> waste;
	
	private Stack<Card> deck;
	
	private ArrayList<Stack<Card>> tableaus;
	
	private ArrayList<Stack<Card>> foundations;
	
	public Game(){
		waste = new Stack<Card>();
		deck = new Stack<Card>();
		tableaus = new ArrayList<Stack<Card>>();
		foundations = new ArrayList<Stack<Card>>();
	}

	public Stack<Card> getWaste() {
		Card card = new Card();
		card.turnOver();
		waste.add(card);
		return waste;
	}

	public void setWaste(Stack<Card> waste) {
		this.waste = waste;
	}

	public Stack<Card> getDeck() {
		deck.add(new Card());
		return deck;
	}

	public void setDeck(Stack<Card> deck) {
		this.deck = deck;
	}

	public ArrayList<Stack<Card>> getTableaus() {
		Stack<Card> tableau = new Stack<Card>();
		Card card = new Card();
		card.turnOver();
		tableau.add(card);
		for(int i = 0; i<Game.NUM_TABLEAUS; i++){
			tableaus.add(tableau);
		}
		return tableaus;
	}

	public void setTableaus(ArrayList<Stack<Card>> tableaus) {
		this.tableaus = tableaus;
	}

	public ArrayList<Stack<Card>> getFoundations() {
		return foundations;
	}

	public void setFoundations(ArrayList<Stack<Card>> foundations) {
		this.foundations = foundations;
	}

	public boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}
	
	public int sizeWaste() {
		return 0;
	}
	
	public int sizeDeck() {
		return 24;
	}
	
	public ArrayList<Integer> sizeFoundations() {
		ArrayList<Integer> sizeFoundations = new ArrayList<Integer>();
		return sizeFoundations;
	}
	
	public ArrayList<Integer> sizeTableaus() {
		ArrayList<Integer> sizeTableaus = new ArrayList<Integer>();
		return sizeTableaus;
	}

}
