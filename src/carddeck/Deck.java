package carddeck;
import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	
	private ArrayList<Cards> cards = new ArrayList<Cards>();;

	public Deck() {
		for(int s = 0 ; s <= 3 ; s++){
			for( int r = 0 ; r <= 12; r++){
				cards.add(new Cards(s, r));				
			}
		}
		Collections.shuffle(cards);
	}

	public Cards drawCard(){
		Cards card = cards.get(0);
		cards.remove(0);
		return card;
	}
	
	public int getTotalCards(){
		return cards.size();
	}
	public void getCardsInDeck(){
			System.out.println(cards);
		
	}
	

	


	
	
	
	
}
