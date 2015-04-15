package test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Stack;

import klondike.controllers.MoveDeckWasteController;
import klondike.entities.Card;
import klondike.entities.Game;

import org.junit.Before;
import org.junit.Test;

public class MoveDeckWasteControllerTest {
	
	private MoveDeckWasteController moveDeckWasteController;
	
	@Before
	public void before(){
		moveDeckWasteController = new MoveDeckWasteController();
	}
	
	@Test
	public void sizeDeckTest(){
		assertNotEquals(0, moveDeckWasteController.sizeDeck());
	}
	
	@Test
	public void isGameIntoPlayTest(){
		Game game = moveDeckWasteController.getGame();
		assertFalse(game.isFinished());
	}
	
	@Test
	public void sizeFoundationsTest(){
		ArrayList<Integer> sizeFoundations = moveDeckWasteController.sizeFoundations();	
		assertEquals(4, sizeFoundations.size());
		
		boolean emptyFoundations = true;
		for(Integer sizeFoundation : sizeFoundations){
			if(sizeFoundation.intValue() > 0){
				emptyFoundations = false;
			}
		}
		assertFalse(emptyFoundations);
	}
	
	@Test
	public void isDeckTopCardCovered(){
		Stack<Card> deck = moveDeckWasteController.getDeck();
		assertFalse(deck.peek().uncovered());
	}
	
}
