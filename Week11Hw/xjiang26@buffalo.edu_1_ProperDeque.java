package edu.buffalo.cse116;

import java.util.ArrayList;
import java.util.List;

public class ProperDeque<E> {
  /** The actual List in which all the elements will be stored. */
  private List<E> backing;

  /** Create a new (empty) instance of this class. */
  public ProperDeque() {
    backing = new ArrayList<>();
  }

  /**
   * Adds an item onto the deque in a manner similar to that of pushing data
   * onto a stack.
   *
   * @param item Element to be added to the front of the deque
   */
  public void addFront(E item) {
	  backing.add(0, item);
  }

  /**
   * Adds an item onto the deque in a manner similar to that of enqueueing data
   * onto a queue.
   *
   * @param item Element to be added to the rear of the deque
   */
  public void addLast(E item) {
	  backing.add(backing.size(), item);
  }

  /**
   * Removes an item from the front of the deque in a manner similar to popping
   * data off a stack or dequeueing it from a queue.
   *
   * @return Element that was removed from the front of the deque
   * @throws EmptyDequeException Exception thrown when this method is called on
   *           an empty deque
   */
  public E removeFront() {
	  if(backing.size()==0){
		  throw new EmptyDequeException();
	  }
	 E ans = backing.remove(0);
	  return ans;
  }

  /**
   * Removes an item from the end of the deque. This method is unique to a
   * deque.
   *
   * @return Element that was removed from the end of the deque
   * @throws EmptyDequeException Exception thrown when this method is called on
   *           an empty deque
   */
  public E removeLast() {
	  if(backing.size()==0){
		  throw new EmptyDequeException();
	  }
	  E ans = backing.remove(backing.size()-1);
	  return ans;
  }

  /**
   * Returns the number of elements in this double-ended queue.
   *
   * @return Items available in the double-ended queue.
   */
  public int size() {
    return backing.size();
  }

  /**
   * Returns whether there are any elements in this deque.
   *
   * @return True if the Deque does not have any elements; false otherwise.
   */
  public boolean isEmpty() {
    return backing.isEmpty();
  }

  /**
   * Removes all the elements from the deque.
   */
  public void clear() {
    backing.clear();
  }
}
