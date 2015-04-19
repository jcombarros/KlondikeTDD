package klondike.entities;

public class Card {
	
	private boolean uncovered = false;

	public boolean uncovered() {
		return uncovered;
	}

	public void turnOver() {
		uncovered = !uncovered;
	}

	public int getValue() {
		return 1;
	}

	public String getColor() {
		// TODO Auto-generated method stub
		return "";
	}

	public Object getSuit() {
		return null;
	}

}
