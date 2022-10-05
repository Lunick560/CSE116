package edu.buffalo.cse116;
import java.util.ArrayList;
import java.util.List;

public class CardShoe {
  private List<PlayingCard> cards;

  public CardShoe(List<PlayingCard> originalList) {
    cards = originalList;
  }

  public List<PlayingCard> cutDeck(int cutLocation) {
  if(cutLocation<0||cutLocation>=cards.size()) {
	  throw new IndexOutOfBoundsException();
  }
List<PlayingCard> TheList = new ArrayList<PlayingCard>();
for(int i=0; i<cutLocation; i++) {
TheList.add(cards.remove(0));
}
for(int i=0; i<cutLocation; i++) {
cards.add(TheList.get(i));
}
return cards;
  }
  public PlayingCard dealCard() {
  return cards.remove(0);
  
  }
  
}
