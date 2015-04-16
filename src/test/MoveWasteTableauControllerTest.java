package test;

import static org.junit.Assert.assertNotEquals;

import org.junit.Before;
import org.junit.Test;

import klondike.controllers.MoveWasteTableauController;

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
		
	}
	
	@Test
	public void uncoveredCardWasteTest(){
		
	}
	
	@Test
	public void validCardTableauTest(){
		
	}
	
	@Test
	public void invalidCardTableauTest(){
		
	}
	

}
