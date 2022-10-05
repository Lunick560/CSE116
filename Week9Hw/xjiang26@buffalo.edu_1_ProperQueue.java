package edu.buffalo.cse116;

/**
 * Class which implements a proper {@code Queue} (including using the CORRECT method names) using a set of singly linked
 * nodes. Besides in the naming convention, this does not include the methods that are inappropriate for a Queue to
 * have,
 *
 * @author Matthew Hertz
 * @param <E> Type of data stored within this Queue.
 */
public class ProperQueue<E> {
  /**
   * The first node in the linked list (or null if the list is empty). This is the end of the list where we remove
   * elements from.
   */
  private Entry<E> head;

  /**
   * The first node in the linked list (or null if the list is empty). This is the end of the list where we add elements
   * to include them on the queue.
   */
  private Entry<E> tail;

  /**
   * The number of elements currently in the queue.
   */
  private int size;

  /** Create a new (empty) instance of this class. */
  public ProperQueue() {
    head = null;
    tail = null;
    size = 0;
  }

  /**
   * Adds an item to the end of the queue. Traditionally, this is the only
   * method available to add data to a Queue.
   *
   * @param item Element to be added to the end of the queue.
   * @return Element added to the Queue (e.g., {@code item}).
   */
  public E enqueue(E item) {

	Entry<E> ans = new Entry<E>(item);
	if(head==null){
		head = ans;
		tail=head;
	}
	tail.setNext(ans);
	tail = ans;
	size++;
	return item;
	
  }

  /**
   * Removes and returns the element at the front of this queue. Traditionally,
   * this is the only method available to remove data from the Queue.
   *
   * @return Element that was removed from the front of the Queue. any
   *           elements to remove.
   * @throws EmptyQueueException Thrown when the Queue does not have
   */
  public E dequeue() {
	  E ans = null;
	  if(head==null){
		  throw new EmptyQueueException();
	  }
	  if(size>=1){
		  ans=head.getElement();
		  head=null;
		  tail=null;
	  }else{ 
	  ans = head.getElement();
	 head=head.getNext();
	  }
	 size--;
	
	  return ans;
  }

  /**
   * Like {@link #dequeue()}, this returns the element at the front of the
   * queue, but unlike {@link #dequeue} this method DOES NOT remove it from the
   * queue.
   *
   * @return Element that is at the front of the queue.
   * @throws EmptyQueueException Thrown when the Queuedoes not have any elements
   *           to remove.
   */
  public E peek() {
	  if(head==null){
		  throw new EmptyQueueException();
	  }
	  E ans = null;

	  ans=head.getElement();
		  
	  return head.getElement();
  }

  /**
   * Returns the number of elements in this Queue.
   *
   * @return Items available in the Queue.
   */
  public int size() {
    return size;
  }

  /**
   * Returns whether there are any elements in this Queue.
   *
   * @return True if the Queue does not have any elements; false otherwise.
   */
  public boolean isEmpty() {
    return size == 0;
  }
  
  /**
   * Class which defines the singly-linked Entry used by a ProperQueue.
   *
   * @author Matthew Hertz
   */
  public static class Entry<E> {

	    /** Data stored within this node. */
	    private E element;

	    /** Reference to the node following this one in the linked list. */
	    private Entry<E> next;

	    /**
	     * Creates a node storing the specified element.
	     *
	     * @param elem Element to which the new node should refer
	     */
	    public Entry(E elem) {
	      next = null;
	      element = elem;
	    }

	    /**
	     * Get the next node in the linked list.
	     *
	     * @return Reference to the node following this one
	     */
	    public Entry<E> getNext() {
	      return next;
	    }

	    /**
	     * Specify that the given node should follow the current one in the linked list.
	     *
	     * @param node node which should follow the current one
	     */
	    public void setNext(Entry<E> node) {
	      next = node;
	    }

	    /**
	     * Get the element stored within this node.
	     *
	     * @return Element referred to by the node
	     */
	    public E getElement() {
	      return element;
	    }

	    /**
	     * Direct the node to store a new element.
	     *
	     * @param elem New element which this node should store
	     */
	    public void setElement(E elem) {
	      element = elem;
	    }
	  }
}
