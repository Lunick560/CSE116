package edu.buffalo.cse116;
import java.util.List;

public class CardShoe {
  private List<PlayingCard> cards;

  public CardShoe(List<PlayingCard> originalList) {
    cards = originalList;
  }
// Move the first half of cards into firstHalf // This may or may not be done in one line of code
 // Move the remaining elements in cards into secondHalf // This may or may not be done in one line of code
 // While there are elements in firstHalf
     //Remove the element at the start of firstHalf and add it to cards
    // Remove the element at the start of secondHalf and add it to cards
  //EndWhile
  //If secondHalf has any elements remaining
    // Remove the element at the start of secondHalf and add it to cards
  //EndWhile

   public void shuffle(ListGenerator gen) {
    List<PlayingCard> firstHalf = gen.createNewList();
    List<PlayingCard> secondHalf = gen.createNewList();
     //firstHalf =cards.subList(0, cards.size()/2);
    // = cards.subList(cards.size()/2,cards.size());
    // cards.clear();
     /**  while(!firstHalf.isEmpty()){
    	 firstHalf.remove(0);
    	 firstHalf.remove(firstHalf.size());
     }
     while(!secondHalf.isEmpty()){
    	 PlayingCard something = secondHalf.remove(0);
    	 cards.add(something);
     }
  }
 */
 if(!cards.isEmpty()){    
for(int i=0;i<cards.size();i++){
	firstHalf.add(cards.get(0));
	cards.remove(0);
	
}
for(int j=0;j<cards.size();j++){
	secondHalf.add(cards.get(j));
	
}
cards.clear();
while(!firstHalf.isEmpty()){
	cards.add(firstHalf.get(0));
	cards.add(secondHalf.get(0));
	firstHalf.remove(0);
	secondHalf.remove(0);
	
}
 }
}
}
