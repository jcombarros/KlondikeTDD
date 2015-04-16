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
		// TODO Auto-generated method stub
		return 0;
	}

	public String getColor() {
		// TODO Auto-generated method stub
		return null;
	}

}
