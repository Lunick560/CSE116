package edu.buffalo.cse116;

import java.util.Comparator;
import java.util.NoSuchElementException;

/**
 * This uses a heap to implement a priority queue which uses reasonable names and has only appropriate public methods.
 *
 * @author Lewis and Chase
 * @author Matthew Hertz
 * @version 4.0
 * @param <E> Type of (Comparable) element to be stored in this priority queue.
 */
public class ProperPriorityQueue<E> {
  /** Stores the last node that we added to this structure. */
  private Entry<E> lastNode;

  /** Root node of this binary tree */
  protected Entry<E> root;

  /** Comparator used to organize and order the elements in the heap. */
  private Comparator<E> comparator;

  /** Number of nodes/elements within this binary tree. */
  private int size;


  /**
   * Creates a new (empty) heap which will uses the specified Comparator to order its elements.
   *
   * @param comp Comparator that this heap will use to order its elements.
   */
  public ProperPriorityQueue(Comparator<E> comp) {
    root = null;
    comparator = comp;
  }

  /**
   * Returns the size of this BinarySearchTree object.
   *
   * @return the size of this BinarySearchTree object.
   */
  public int size() {
    return size;
  }

  /**
   * Adds the specified element to this heap in the appropriate position according to its key value.
   *
   * @param obj the element to be added to the heap
   * @return Since this method will always succeed, it only returns true.
   */
  public boolean add(E obj) {
    Entry<E> node = new Entry<>(obj, null);

    if (root == null) {
      root = node;
    } else {
      Entry<E> nextParent = getNextParentAdd();
      if (nextParent.getLeft() == null) {
        nextParent.setLeft(node);
      } else {
        nextParent.setRight(node);
      }
      node.setParent(nextParent);
    }
    lastNode = node;
    size += 1;
    siftUpComparator(node, obj);
    return true;
  }

  /**
   * Returns the node that will be the parent of the new node
   *
   * @return the node that will be the parent of the new node
   */
  private Entry<E> getNextParentAdd() {
    Entry<E> result = lastNode;

    while ((result != root) && (result.getParent().getLeft() != result)) {
      result = result.getParent();
    }

    if (result != root) {
      if (result.getParent().getRight() == null) {
        result = result.getParent();
      } else {
        result = result.getParent().getRight();
        while (result.getLeft() != null) {
          result = result.getLeft();
        }
      }
    } else {
      while (result.getLeft() != null) {
        result = result.getLeft();
      }
    }

    return result;
  }

  /**
   * Reorders this heap after creating the space for an element in the tree.
   *
   * @param node Entry that was just created and added to the linked tree. It's element will not have been set yet.
   * @param elem Element that we are adding to the tree
   */
  private void siftUpComparator(Entry<E> node, E elem) {
	  node.setElement(elem);
	if(node.getParent()!=null) {
	  if(comparator.compare(node.getElement(), node.getParent().getElement())<0){
		 E ans = node.getElement();
		  node.setElement(node.getParent().getElement());
		  node.getParent().setElement(ans);	
		  siftUpComparator(node.getParent(), node.getParent().getElement());
	  }
	  
  }
  }
  /**
   * Remove the element with the lowest value in this heap and returns a reference to it. Throws an
   * EmptyCollectionException if the heap is empty.
   *
   * @return the element with the lowest value in this heap
   */
  public E remove() {
    if (isEmpty()) {
      throw new NoSuchElementException("Cannot call remove on an empty LinkedHeap");
    }

    Entry<E> rootNode = root;
    E minElement = rootNode.getElement();

    if (size() == 1) {
      root = null;
      lastNode = null;
    } else {
      Entry<E> nextLast = getNewLastNode();
      if (lastNode.getParent().getLeft() == lastNode) {
        lastNode.getParent().setLeft(null);
      } else {
        lastNode.getParent().setRight(null);
      }
      E shuffleElem = lastNode.getElement();
      rootNode.setElement(shuffleElem);
      lastNode = nextLast;
      siftDownComparator(rootNode, shuffleElem);
    }
    size -= 1;
    return minElement;
  }

  /**
   * Reorders this heap after unlinking the node that is actually removed.
   *
   * @param node Entry in our linked tree from which our down shifting need to start
   * @param elem Element that was in the (now removed) node to be shifted into the tree.
   */
  private void siftDownComparator(Entry<E> node, E elem) {
	if(node!=null) { 
	  if(comparator.compare(node.getLeft().getElement(), node.getRight().getElement())<0) {
		 if(comparator.compare(node.getElement(), node.getLeft().getElement())>0) {
			 node.setElement(node.getLeft().getElement());
			 node.getLeft().setElement(elem);
		
			 siftDownComparator(node.getLeft(),node.getLeft().getElement());
		 }
		 
	 }else {
		 if(comparator.compare(node.getElement(), node.getRight().getElement())<0) {
			 node.setElement(node.getRight().getElement());
			 node.getRight().setElement(elem);
			
			 siftDownComparator(node.getRight(),node.getRight().getElement());
		 }
	 }	 
	 }
		 }


  /**
   * Returns the node that will be the new last node after a remove.
   *
   * @return the node that willbe the new last node after a remove
   */
  private Entry<E> getNewLastNode() {
    Entry<E> result = lastNode;

    while ((result != root) && (result.getParent().getLeft() == result)) {
      result = result.getParent();
    }

    if (result != root) {
      result = result.getParent().getLeft();
    }

    while (result.getRight() != null) {
      result = result.getRight();
    }

    return result;
  }

  /**
   * Returns the element with the lowest value in this heap. Throws an EmptyCollectionException if the heap is empty.
   *
   * @return the element with the lowest value in this heap
   */
  public E element() {
    if (isEmpty()) {
      throw new NoSuchElementException("Cannot call remove on an empty LinkedHeap");
    }

    Entry<E> rootNode = root;
    E minElement = rootNode.getElement();
    return minElement;
  }

  public boolean isEmpty() {
    return size == 0;
  }
}
