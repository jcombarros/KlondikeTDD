package klondike.entities;

public class Card {
	
	private int value;
	
	private String color;
	
	private String suit;
	
	private boolean uncovered = false;
	
	public Card(){
		value = 1;
		color = "";
		suit = "";
	}

	public boolean uncovered() {
		return uncovered;
	}

	public void turnOver() {
		uncovered = !uncovered;
	}

	public int getValue() {
		return value;
	}

	public String getColor() {
		return color;
	}

	public Object getSuit() {
		return suit;
	}

}
