package test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Stack;

import klondike.controllers.StartGameController;
import klondike.entities.Card;
import klondike.entities.Game;

import org.junit.Before;
import org.junit.Test;

 
public class StartGameControllerTest {

	private Game game = new Game();
	private StartGameController startGameController;
	
	@Before
	public void before(){
		startGameController = new StartGameController(game);
	}

	@Test
	public void sizeWasteTest() {
		assertEquals(0, startGameController.sizeWaste());
	}
	
	@Test
	public void sizeFoundationsTest() {
		ArrayList<Integer> sizeFoundations = startGameController.sizeFoundations();	
		assertEquals(4, sizeFoundations.size());
		
		for(Integer sizeFoundation : sizeFoundations){
			assertEquals(new Integer(0), sizeFoundation);
		}
	}
	
	@Test
	public void sizeDeckTest() {
		assertEquals(24, startGameController.sizeDeck());
	}
	
	@Test
	public void sizeTableausTest() {
		ArrayList<Integer> sizeTableaus = startGameController.sizeCoveredCardsTableaus();
		ArrayList<Stack<Card>> uncoveredCardStackTableaus = startGameController.uncoveredCardStackTableaus();
		
		assertEquals(7, sizeTableaus.size());
		assertEquals(7, uncoveredCardStackTableaus.size());
		
		for (int i = 0; i < sizeTableaus.size(); i++) {
			assertEquals(new Integer(i), sizeTableaus.get(i));
		}
		
		for (Stack<Card> uncoveredCardsStack : uncoveredCardStackTableaus) {
			assertEquals(1, uncoveredCardsStack.size());
			assertTrue(uncoveredCardsStack.peek().uncovered());
		}
		
	}

}
