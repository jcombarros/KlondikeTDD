package test;

import static org.junit.Assert.assertFalse;

import org.junit.Before;
import org.junit.Test;

import klondike.controllers.MoveTableauFoundationController;
import klondike.entities.Game;

public class MoveTableauFoundationControllerTest {
	
	private Game game = new Game();
	private MoveTableauFoundationController moveTableauFoundationController;

	@Before
	public void before(){
		moveTableauFoundationController = new MoveTableauFoundationController(game);
	}

	@Test
	public void isGameIntoPlayTest(){
		Game game = moveTableauFoundationController.getGame();
		assertFalse(game.isFinished());
	}
	
	@Test
	public void sizeTableausTest(){
		
	}
	
	@Test
	public void sizeFoundationsTest(){
		
	}
	
	@Test
	public void uncoveredCardTableausTest(){
		
	}
	
	@Test
	public void validCardFoundationTest(){
		
	}
}
