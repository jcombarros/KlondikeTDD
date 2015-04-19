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
		assertEquals(7, sizeTableaus.size());
		
		boolean emptyTableaus = true;
		for(Integer sizeTableau : sizeTableaus){
			if(sizeTableau.intValue() > 0){
				emptyTableaus = false;
			}
		}
		assertFalse(emptyTableaus);
	}
	
	@Test
	public void sizeFoundationsTest(){
		ArrayList<Integer> sizeFoundations = moveTableauFoundationController.sizeFoundations();	
		assertEquals(4, sizeFoundations.size());
		
		boolean fullFoundations = true;
		for(Integer sizeFoundation : sizeFoundations){
			if(sizeFoundation.intValue() < 13){
				fullFoundations = false;
			}
		}
		assertFalse(fullFoundations);
	}
	
	@Test
	public void uncoveredCardTableausTest(){
		
	}
	
	@Test
	public void validCardFoundationTest(){
		
	}
}
