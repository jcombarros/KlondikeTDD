package test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import java.util.Stack;

import org.junit.Before;
import org.junit.Test;

import klondike.controllers.MoveDeckWasteController;
import klondike.controllers.MoveWasteTableauController;
import klondike.entities.Card;
import klondike.entities.Game;

public class MoveWasteTableauControllerTest {
	
	private MoveWasteTableauController moveWasteTableauController;
	
	@Before
	public void before(){
		moveWasteTableauController = new MoveWasteTableauController();
	}
	
	@Test
	public void sizeWasteTest(){
		assertNotEquals(0, moveWasteTableauController.sizeWaste());

	}
	
	@Test
	public void isGameIntoPlayTest(){
		Game game = moveWasteTableauController.getGame();
		assertFalse(game.isFinished());
	}
	
	@Test
	public void uncoveredCardWasteTest(){
		MoveDeckWasteController moveDeckWasteController = new MoveDeckWasteController();
		moveDeckWasteController.moveDeckWaste();
		Stack<Card> waste = moveWasteTableauController.getWaste();
		assertTrue(waste.peek().uncovered());
	}
	
	@Test
	public void validCardTableauTest(){
		
	}
	
	@Test
	public void invalidCardTableauTest(){
		
	}
	

}
