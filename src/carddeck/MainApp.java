package carddeck;



public class MainApp {

	public static void main(String[] args) {
		// create deck 
		
		Deck deck = new Deck();
		
		//show the deck and make sure there are 52 cards in the deck 
		//(so you can check what card you should deal. 

		deck.getCardsInDeck();
		System.out.println(deck.getTotalCards());
		
		//Deal a card.
		Cards card = deck.drawCard();

		// show what card was dealt. 
		System.out.println(card.toString());
		
		// check the card was remove from the deck. 
		deck.getCardsInDeck();
		System.out.println(deck.getTotalCards());
			
	}

}
