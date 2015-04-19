package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Stack;

import org.junit.Before;
import org.junit.Test;

import klondike.controllers.MoveTableauFoundationController;
import klondike.entities.Card;
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
		ArrayList<Stack<Card>> uncoveredCardStackTableaus = moveTableauFoundationController.uncoveredCardStackTableaus();
		
		assertEquals(7, uncoveredCardStackTableaus.size());
		
		for (Stack<Card> uncoveredCardsStack : uncoveredCardStackTableaus) {
			assertEquals(1, uncoveredCardsStack.size());
			assertTrue(uncoveredCardsStack.peek().uncovered());
		}
	}
	
	@Test
	public void validCardFoundationTest(){
		ArrayList<Stack<Card>> foundations = moveTableauFoundationController.getFoundations();
		ArrayList<Stack<Card>> tableaus = moveTableauFoundationController.getTableaus();
		
		assertEquals(7, foundations.size());
		
		ArrayList<Card> foundationTopCards = new ArrayList<Card>();
		for (Stack<Card> foundation : foundations) {
			foundationTopCards.add(foundation.peek());
		}
		
		boolean possibleMove = false;
		int validTableau = 0;
		int validFoundation = 0;
		for (Stack<Card> tableau : tableaus) {
			validFoundation = 0;
			Card tableauCard = tableau.peek();
			for(Card foundationTopCard : foundationTopCards){
				if((foundationTopCard.getValue()+1) == tableauCard.getValue() &&
						foundationTopCard.getSuit().equals(tableauCard.getSuit())){
					possibleMove = true;
					
				}
				validFoundation++;
			}
			validTableau++;
		}
		
		if(possibleMove){
			assertTrue(moveTableauFoundationController.moveTableauFoundation(validTableau, validFoundation));
		}
	}
}
