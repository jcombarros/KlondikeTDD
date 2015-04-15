package klondike.entities;

public class Card {
	
	private boolean uncovered = false;

	public boolean uncovered() {
		return uncovered;
	}

	public void turnOver() {
		uncovered = !uncovered;
	}

}
