package test;

import org.junit.Before;

import klondike.controllers.MoveTableauFoundationController;
import klondike.entities.Game;

public class MoveTableauFoundationControllerTest {
	
	private Game game = new Game();
	private MoveTableauFoundationController moveTableauFoundationController;

	@Before
	public void before(){
		moveTableauFoundationController = new MoveTableauFoundationController(game);
	}

}
