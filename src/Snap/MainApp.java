package Snap;

import java.util.ArrayList;

public class MainApp {

	public static void main(String[] args) {
	    // create the players hands
		ArrayList<Cards> player1 = new ArrayList<>();
		ArrayList<Cards> player2 = new ArrayList<>();
		// create the deck of cards. 
		Deck deck2 = new Deck();
		

		int numberOfCards = deck2.getTotalCards();
		
		//Deal the cards to the players. 
		for(int i = 0; i <= numberOfCards; i++){
			
			if (i%2 == 0 && deck2.getTotalCards()>0){
				player1.add(deck2.drawCard());
			}else if (deck2.getTotalCards() > 0){
				player2.add(deck2.drawCard());
			}	
		}

		//set up the gamedeck for the payers to pay their cards to
		ArrayList<Cards> gameDeck = new ArrayList<>();
		//has the game been won?
		boolean gameWon = false;
		
		
		//keep track of the last player to go
		int lastPlayerTogo = 0;
		
		
		do{
			if (!gameDeck.isEmpty()) {//make sure the game deck has cards. 
				
				switch (lastPlayerTogo) {		//check who wentt last time.
				case 1: 						//if player 1 went last time player two should go now. 
					if(!player2.isEmpty()){ 	// if player 2 has cards then pay a card. 
						gameDeck.add(0,player2.remove(0));
					}else{
						System.out.println("Player 2 has no cards");
					}
					lastPlayerTogo=2;
					break;
				case 2: 					//if player 2 went last time player 1 should go now. 
					if(!player1.isEmpty()){ //if player 1 has cards, then play a card. 
						gameDeck.add(0,player1.remove(0));
					}else{
						System.out.println("Player 1 has no cards");
					}
					lastPlayerTogo = 1;
					break;
				}
				
				if (gameDeck.size() > 1) { // if there are two cards on the deck what were the last 2 cards played?
					System.out.println("The last 2 cars dealt were " + gameDeck.get(0).toString()+
							" " + gameDeck.get(1).toString() );	
				}else{
					System.out.println("The last card dealt was " + gameDeck.get(0).toString() );
				}

				
				
				if(gameDeck.size()>1 && gameDeck.get(0).getRank() == gameDeck.get(1).getRank()){ //check to see if a player got snap
					
					System.out.print("SNAP --------");
					switch (lastPlayerTogo) {
					case 1: //if the last player to go was player 1 he calls snap 
						player1.addAll(gameDeck); // add all the game deck to player1's hand 
						gameDeck.removeAll(gameDeck); // clear the gamedeck 
						System.out.println("Player 1");
						break;
					case 2:
						player2.addAll(gameDeck);
						gameDeck.removeAll(gameDeck);
						System.out.println("Player 2");
						break;
						
					}
					
					if (player1.isEmpty()&&player2.isEmpty()&& lastPlayerTogo == 1){ //after snap has been called 
						System.out.println("Player 1 wins");
					}else if (player2.isEmpty()&&player1.isEmpty()&&lastPlayerTogo == 2) {
						System.out.println("Player 2 wins");	
					}
				}
				
				
			}else{ // if the gamedeck has no cards either the game has just started or a player just got snap.
				switch (lastPlayerTogo) {
				case 1:
					gameDeck.add(player2.remove(0));
					lastPlayerTogo=2;
					break;
				case 2: 
					gameDeck.add(player1.remove(0));
					lastPlayerTogo = 1;
					break;
				default:
					gameDeck.add(player1.remove(0));
					lastPlayerTogo = 1;
					break;
				}
			}
			
			
			if(player2.isEmpty() && lastPlayerTogo == 1){
				System.out.println("Player 1 wins!");
				gameWon=true;
			}else if(player1.isEmpty() && lastPlayerTogo == 2){
				System.out.println("Player 2 wins!");
				gameWon=true;
			}
			
			
		}while (!gameWon) ;
		
		
		
		
		
		
	}
	

}
