package test;

import static org.junit.Assert.*;
import klondike.controllers.MoveDeckWasteController;

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
		
	}
	
	@Test
	public void sizeFoundationsTest(){
		
	}
	
	@Test
	public void isDeckTopCardCovered(){
		
	}
	
}
