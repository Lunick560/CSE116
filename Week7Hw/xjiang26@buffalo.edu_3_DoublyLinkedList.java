package edu.buffalo.cse116;

/**
 * This defines a few basic methods in a doubly linked-based List. This is now much closer to being a working List
 * implementation. Students will be writing the code to demonstrate they understand how to add nodes to a doubly linked
 * list.
 *
 * @author Matthew Hertz
 * @param <E> Type of data held in this collection
 */
public class DoublyLinkedList<E> {

  /** Reference to the first node in our linked list. This will be null if the list is empty. */
  private Entry<E> head;

  /** Reference to the last node in our linked list. This will be null if the list is empty. */
  private Entry<E> tail;

  /**
   * This size instance variable specifies the number of elements in the List. We could instead recompute this as
   * needed, but adding it costs a little space and makes our code much more efficient. This space v. time tradeoff is a
   * common issue in computer science.
   */
  private int size;



  /**
   * Creates an empty list.
   */
  public DoublyLinkedList() {
    reset();
  }

  /**
   * This method, which is only used within the DoublyLinkedList class, returns the instance to its initial state. This
   * call will reset both head and tail to be null and sets the size to be 0.
   */
  private void reset() {
    head = null;
    tail = null;
    size = 0;
  }

  /**
   * Adds a new node to the middle of the linked list. This node will need to be created and then setup so that it
   * appears between the specified nodes already in the list. Finally, update any instance variable so that they reflect
   * the newly added node.
   *
   * @param prior Node that will come before the one being created in this method.
   * @param elem Element we are adding to the linked list
   * @param follower Node that comes after the one being created in this method.
   */
 private void addBetween(Entry<E> prior, E elem, Entry<E> follower) {
    // TODO Finish this method
	 
   Entry<E> ans = new Entry<E>(elem);

   

   prior.setNext(ans);

   ans.setPrevious(prior);

  

   ans.setNext(follower);

follower.setPrevious(ans);
   size++;  
  /**ans=prior.getNext();
	  prior=ans.getPrevious();
	  follower=ans.getNext();
	ans=follower.getPrevious();
 size++;
 --
 
	 Entry<E> temp1=head;
  Entry<E> temp2=head;
  while(temp1!=tail){
         if(temp1.getElement()==prior.getElement()){
             temp2=temp1;
             break;
         }
         temp1=temp1.getNext();
  }
  temp2.getNext();
  ans.setPrevious(temp2);
  temp2.setNext(ans);
  temp2.getNext().setPrevious(ans);
  size++;
*/
 } 

  /**
   * Adds a new node at the start of the linked list. This node will need to be created and then setup so that it comes
   * before the current head node. Finally, update any instance variable so that they properly reflect the addition of
   * this new first node.
   *
   * @param elem Element we are adding to the front of the linked list
   */
  
private void addToFront(E elem) {
    // TODO Finish this method
	Entry<E> ans = new Entry<E>(elem);
	if(head==null){
		ans=null;
		tail=head;
		size++;
		return;
}
	ans.setNext(head);
	head.setPrevious(ans);
	head=ans;
	tail=ans;
	size++;
	
	
	
	/**else{
	Entry<E> now = this.head;
	Entry<E> later = new Entry<E>();
	elem=later.getElement();
	later = now.getPrevious();
	}
	 **/
}
	
  /**
   * Returns the number of elements currently in this list.
   *
   * @return the number of elements in the list
   */
  public int size() {
    return size;
  }
}
