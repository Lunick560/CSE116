package edu.buffalo.cse116;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/**
 * Class which implements the concept of a multiset -- an unorganized collection which does not limited the number of
 * times an instance can be added.
 *
 * @author Carl Alphonse
 * @author Matthew Hertz
 * @param <E> Type of data contained with the instance.
 */
public class ArrayMultiSet<E> implements Collection<E> {
  /** Unless otherwise specified, the default length to which the backing store should be initialized. */
  private static final int DEFAULT_INITIAL_CAPACITY = 16;

  /** Array in which the elements in this multiset are stored. */
  private E[] _store;
  /**
   * Array indices below this amount contain the active elements in this collection.
   */
  private int _size;

  /**
   * Create a new empty multiset.
   */
  public ArrayMultiSet() {
    clear();
  }

  /**
   * Remove all of the elements within the instance and invalidate any current iterators.
   */
  @SuppressWarnings("unchecked")
  @Override
  public void clear() {
    _store = (E[]) (new Object[DEFAULT_INITIAL_CAPACITY]);
    _size = 0;
  }

  @Override
  public int size() {
    return _size;
  }

  @Override
  public boolean isEmpty() {
    return _size == 0;
  }

  /**
   * Returns a newly allocated array containing the elements in the Multiset. The length of returned array will be the
   * current size of the Multiset with no padding or extra spaces added.
   *
   * @return Newly allocated array whose entries are set to the elements in the Multiset.
   */
  @Override
  public Object[] toArray() {
	  	return Arrays.copyOf(_store, _size);
  }

  /**
   * Resets the Multiset so that it only contains the entries in the given array. This overwrites the data previously in
   * the Collection.
   *
   * @param arr The array whose entries will be the elements in the Collection
   */
  @SuppressWarnings("unchecked")
  public void fromArray(E[] arr) {
      if(_store.length < arr.length) {
          _store = (E[]) (new Object[arr.length]);
          _size = 0;
      //get a new one going
      }
      
      for(int i=0; i<arr.length; i++) {
          _store[i] = arr[i];
          	//Move stuff in and out
      }
      _size = arr.length;
//Make sure the size is same
  
	 
	  // IMPORTANT: You CANNOT set the backing store to be equal to ("alias")
    // arr. If you did this, the calling method could make changes to the
    // Multiset by updating the entries in arr rather than using the Multiset methods.
    // This violates good OO practice and creates the potential for bugs and hacks.
  }

  /**
   * Update the multiset so that it includes all of the elements from before the call AND the given element.
   *
   * @param e Item to be added to this collection.
   */
  @Override
  public boolean add(E e) {
    // To be discussed on Friday!
    throw new UnsupportedOperationException();
  }

  /**
   * Removes a single instance of the given object, if one can be found in the multiset. The method returns {@code true}
   * if a match was found (and removed) and {@code false} if no match was found. Normally, this uses
   * {@link Object#equals} to check if there is a match, but uses {@code ==} when {@code obj} is {@code null}.
   *
   * @param obj Object (or null) which we want to remove
   * @return {@code true} if {@code obj} was found and an instance removed; {@code false} if a match could not be found.
   */
  @Override
  public boolean remove(Object obj) {
    // To be discussed Monday!
    throw new UnsupportedOperationException();
  }

  /**
   * Return true if at least one element in the multiset is equal to the given object. When {@code obj} is null, it must
   * use the {@code ==} operator to perform these checks, but when {@code obj} is not null, the {@link Object#equals}
   * method is used.
   *
   * @param obj Object (or null) for which we will search
   * @return {@code true} if {@code obj} was found and an instance removed; {@code false} if a match could not be found.
   */
  @Override
  public boolean contains(Object obj) {
    // To be discussed Monday!
    throw new UnsupportedOperationException();
  }

  /*
   * The remaining methods are part of the Collection<E> interface, but are beyond what is necessary for CSE 116.
   * Students who want a complete Multiset implementation should investigate Google's "Guava" library.
   */
  @Override
  public Iterator<E> iterator() {
    throw new UnsupportedOperationException();
  }

  @Override
  public <T> T[] toArray(T[] a) {
    throw new UnsupportedOperationException();
  }

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
