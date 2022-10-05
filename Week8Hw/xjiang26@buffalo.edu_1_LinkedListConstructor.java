package edu.buffalo.cse116;

/**
 * This class is used to construct different linked lists as part of the week #8 weekly assignment. The goal is for
 * students to get a better understanding of how linked lists work and can be programmed.
 *
 * @author Matthew Hertz
 */
public class LinkedListConstructor {
  /**
   * This method should instantiate and return an empty linked list. You will
   * need to instantiate and connect any Entry instances yourself.
   *
   * @return Singly linked list that does not contain any elements.
   */
  public static Entry<Double> buildEmptySingle() {
    Entry<Double> retVal;
    retVal=null;
    return retVal;
  }

  /**
   * This method should instantiate and return a singly linked list with 4
   * elements. In order, the elements should be the Strings "Tom", "Dick",
   * "Harry", "Oh my!". You will need to instantiate and connect any Entry
   * instances yourself.
   *
   * @return Singly linked list that contains the 4 elements in the correct
   *         order
   */
  public static Entry<String> buildListWith4Strings() {
    Entry<String> tom = new Entry<>("Tom");
    Entry<String> dic = new Entry<>("Dick");
    Entry<String> harry = new Entry<>("Harry");
    Entry<String> ohMy = new Entry<>("Oh my!");
      
    tom.setNext(dic);
    dic.setNext(harry);
    harry.setNext(ohMy);
    return tom;
  }

  /**
   * This method should instantiate and return a singly-linked list with 4
   * elements. In order, the elements should be the Integers 45, 42, 109, -12.
   * You will need to instantiate and connect any Entry instances yourself.
   *
   * @return Singly linked list that contains the 4 elements in the correct
   *         order
   */
  public static Entry<Integer> buildListWith4Ints() {
	  Entry<Integer> fortyFive = new Entry<>(45);
	  Entry<Integer> fortyTwo = new Entry<>(42);
	  Entry<Integer> oneNotNine = new Entry<>(109);
	  Entry<Integer> minusTwelwe = new Entry<>(-12);
	    
	  fortyFive.setNext(fortyTwo);
	  fortyTwo.setNext(oneNotNine);
	  oneNotNine.setNext(minusTwelwe);
	  return fortyFive;
  }
}
