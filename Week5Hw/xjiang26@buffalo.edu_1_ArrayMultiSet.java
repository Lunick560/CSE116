package edu.buffalo.cse116;

import java.util.Collection;
import java.util.Iterator;

/**
 * Class which implements the concept of a multiset -- an unorganized collection which does not limited the number of
 * times an instance can be added.
 *
 * @author Carl Alphonse
 * @author Matthew Hertz
 * @param <E>
 *          Type of data contained with the instance.
 */
public class ArrayMultiSet<E> implements Collection<E> {
  /** Array in which the elements in this multiset are stored. */
  private E[] _store;
  /**
   * Array indices below this amount contain the active elements in this collection.
   */
  private int _size;
  /*
   * Class invariants: _store has all of the elements in the multi-set. All elements in _store are in indices < _size
   */

  /** Constant value used as the initial size for the backing store when no other size is provided. */
  private static final int DEFAULT_INITIAL_CAPACITY = 12;

  /**
   * Create a new empty multiset.
   */
  public ArrayMultiSet() {
    reset(DEFAULT_INITIAL_CAPACITY);
  }

  /**
   * This method, which is only used within the ArrayMultiSet code, returns the instance to its initial state. This call
   * should allocate a new backing store with the specified capacity and update any instance variables needed to reflect
   * that the ArrayMultiSet does not contain any elements.
   *
   * @param newCapacity
   *          When allocating a new (empty) backing store, this specifies the space it should reserve for later
   */
  @SuppressWarnings("unchecked")
  private void reset(int newCapacity) {
    _store = (E[]) (new Object[newCapacity]);
    _size = 0;
  }

  /**
   * Create a new empty multiset and, while the size of the multiset will still be 0, allocate a backing store large
   * enough that it COULD hold up to the specified capacity without resizing.
   *
   * @param initialCapacity
   *          Amount of space to reserve for future additions to the multiset.
   */
  public ArrayMultiSet(int initialCapacity) {
    reset(DEFAULT_INITIAL_CAPACITY);
  }

  /**
   * Remove all of the elements within the instance and invalidate any current iterators.
   */
  @Override
  public void clear() {
    reset(DEFAULT_INITIAL_CAPACITY);
  }

  /**
   * Return true if at least one element in the multiset is equal to the given object. When {@code obj} is null, it must
   * use the {@code ==} operator to perform these checks, but when {@code obj} is not null, the {@link Object#equals}
   * method is used.
   *
   * @param obj Object (or null) for which we will search
   * @return {@code true} if {@code obj} was found and an instance removed; {@code false} if a match could not be found.
   */
  public boolean contains(Object obj) {
	    for (int i = 0; i < _size; i++ ) {
	      // When obj is null, we need to use ==
	      if ((obj == null) && (_store[i] == null)) {
	        return true;
	      }
	      // Otherwise, we use .equals() to find a match
	      else if ((obj != null) && obj.equals(_store[i])) {
	        return true;
	      }
	      // No else clause, since the match could be at a higher index!
	    }
	    // Checked all VALID indices, so the result must be:
	    return false;
	  }



  /**
   * Removes a single instance of the given object, if one can be found in the multiset. The method returns {@code true}
   * if a match was found (and removed) and {@code false} if no match was found. Normally, this uses
   * {@link Object#equals} to check if there is a match, but uses {@code ==} when {@code obj} is {@code null}.
   *
   * @param obj Object (or null) which we want to remove
   * @return {@code true} if {@code obj} was found and an instance removed; {@code false} if a match could not be found.
   */
  public boolean remove(Object obj) {
    // Skipped since it differs from contains() only in that it calls removeAtIndex() before returning true.
    return false;
  }

  public boolean isEmpty() {
    return _size == 0;
  }

  public boolean add(E e) {
    // Skipped on behalf of Week #4's homework.
    return false;
  }

  public int size() {
    return _size;
  }

  @Override
  public Object[] toArray() {
    // Skipped on behalf of last week's homework.
    throw new UnsupportedOperationException();
  }

  @Override
  public <T> T[] toArray(T[] a) {
    // Skipped on behalf of last week's homework.
    throw new UnsupportedOperationException();
  }

  @Override
  public Iterator<E> iterator() {
    // To be discussed later this week
    throw new UnsupportedOperationException();
  }

  /*
   * The remaining methods are part of the Collection<E> interface, but are beyond what is necessary for CSE 116.
   * Students who want a complete Multiset implementation should investigate Google's "Guava" library.
   */
  @Override
  public boolean containsAll(Collection<?> c) {
    throw new UnsupportedOperationException();
  }

  @Override
  public boolean addAll(Collection<? extends E> c) {
    throw new UnsupportedOperationException();
  }

  @Override
  public boolean removeAll(Collection<?> c) {
    throw new UnsupportedOperationException();
  }

  @Override
  public boolean retainAll(Collection<?> c) {
    throw new UnsupportedOperationException();
  }
}
