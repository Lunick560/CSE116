package edu.buffalo.cse116;

/**
 * This class is used to construct different linked lists as part of the week #9 weekly assignment. The goal is for
 * students to get a better understanding of how linked lists are built and can work.
 *
 * @author Matthew Hertz
 */
public class LinkedListConstructorDos {

  /**
   * This method should instantiate and return an empty doubly linked list. You
   * will need to instantiate and connect any Entry instances yourself.
   *
   * @return Doubly linked list that does not contain any elements.
   */
  public static Entry<Double> buildEmptyDouble() {
    Entry<Double> retVal = null;
	return retVal;
  }


  /**
   * This method should instantiate and return a LinearNode with 5 elements. In
   * order, the elements should be the Strings "Hi", "Mom", "I'm", "in", "Jail".
   * (Its a song from a great album, look it up).You will need to instantiate
   * and connect any Entry instances yourself.
   *
   * @return Doubly-linked list that contains the 5 Strings in proper order
   */
  
  public static Entry<String> buildListWith5Strings() {
	  Entry<String> hi = new Entry<String>("Hi");
      Entry<String> mom = new Entry<String>("Mom");
      Entry<String> iam = new Entry<String>("I'm");
      Entry<String> in = new Entry<String>("in");
      Entry<String> jail = new Entry<String>("Jail");

  

      hi.setNext(mom);
      hi.setPrevious(null);  
      mom.setNext(iam);
      mom.setPrevious(hi); 
      iam.setNext(in);
      iam.setPrevious(mom);  
      in.setNext(jail);
      in.setPrevious(iam);  
      jail.setNext(null);
      jail.setPrevious(in);
      return hi;
	  

  }

  /**
   * This method should instantiate and return a LinearNode with 5 elements. In
   * order, the elements should be the Doubles 4.6, -2.3, 273.15, 3.1415, 42.0.
   * You will need to instantiate and connect any Entry instances yourself.
   *
   * @return Doubly-linked list that contains the 5 Doubles in proper order
   */
  public static Entry<Double> buildListWith5Doubles() {
    Entry<Double> retVal;
    Entry<Double> a = new Entry<Double>(4.6);
    Entry<Double> b = new Entry<Double>(-2.3);
    Entry<Double> c = new Entry<Double>(273.15);
    Entry<Double> d = new Entry<Double>(3.1415);
    Entry<Double> e = new Entry<Double>(42.0);

    a.setNext(b);
    a.setPrevious(null);
    b.setPrevious(a);
    b.setNext(c);
    c.setNext(d);
    c.setPrevious(b);
    d.setNext(e);
    d.setPrevious(c);
    e.setNext(null);
    e.setPrevious(d);
    return a;
  }
}
