package edu.buffalo.cse116;

import java.util.ArrayList;
import java.util.List;

public class ProperDeque<E> {
  /** The actual List in which all the elements will be stored. */
  private List<E> store;

  /** Create a new (empty) instance of this class. */
  public ProperDeque() {
    store = new ArrayList<>();
  }

  /**
   * Adds an item onto the deque in a manner similar to that of pushing data
   * onto a stack.
   *
   * @param item Element to be added to the front of the deque
   */
  public void addFront(E item) {
	  store.add(0, item);
  }

  /**
   * Adds an item onto the deque in a manner similar to that of enqueueing data
   * onto a queue.
   *
   * @param item Element to be added to the rear of the deque
   */
  public void addLast(E item) {
	  store.add(store.size(),item);
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
	  if(store.size()==0){
		  throw new EmptyDequeException();
	  }
	 E ans = store.remove(0);
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
	  if(store.size()==0){
		  throw new EmptyDequeException();
	  }
	  E ans = store.remove(store.size()-1);
	  return ans;
  }

  /**
   * Returns the number of elements in this double-ended queue.
   *
   * @return Items available in the double-ended queue.
   */
  public int size() {
    return store.size();
  }

  /**
   * Returns whether there are any elements in this Stack.
   *
   * @return True if the Stack does not have any elements; false otherwise.
   */
  public boolean isEmpty() {
    return store.isEmpty();
  }

  /**
   * Removes all the elements from the Stack.
   */
  public void clear() {
    store.clear();
  }
}
