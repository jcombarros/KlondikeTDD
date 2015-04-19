package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.util.ArrayList;

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
		ArrayList<Integer> sizeTableaus = moveTableauFoundationController.sizeTableaus();	
		assertEquals(4, sizeTableaus.size());
		
		boolean emptyTableaus = true;
		for(Integer emptyTableau : sizeTableaus){
			if(emptyTableau.intValue() > 0){
				emptyTableaus = false;
			}
		}
		assertFalse(emptyTableaus);
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
