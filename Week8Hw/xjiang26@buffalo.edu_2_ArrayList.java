package edu.buffalo.cse116;

import java.util.Arrays;

/**
 * This could represents an array-based conceptualization of a list. For the sake of simplicity, 
 * I did not have this implement the List interface (and the many methods we will not bother with). 
 * This can (hopefully) allow students to focus on how we use indices in the list.
 *
 * @author Lewis and Chase
 * @author Matthew Hertz
 * @version 4.0
 * @param <E> Type of data held in this collection
 */
public class ArrayList<E> {
  /** First index in the array at which elements cannot be found. Only indices LESS THAN this value are valid. */
  private int _size;

  /** Array in which the elements are stored. */
  private E[] _store;

  /**
   * Creates an empty list with a backing store of length 32.
   */
  @SuppressWarnings("unchecked")
  public ArrayList() {
    _size = 0;
    _store = (E[]) (new Object[32]);
  }

  /**
   * This method is used to insert the given element at the specified index. It must first check if the index is legal
   * and throw an exception if it is not. It then will check if space exists in the backing store (and double the array
   * length when necessary). It must then shift all of the data up to create the "hole" in which the element can be
   * inserted. The last step will be to actually add the element to the backing store.
   *
   * @param element Data to be added to this list
   * @param index Loc
   * ation in the array to add the element.
   */
  public void add(int index, E element) {
	  if (index > _size||index<0) {
	      throw new IndexOutOfBoundsException();
	    }
	  if(_store.length == _size) {
		  _store = Arrays.copyOf(_store, 2 * _size);
		  }
		  if(index == _size) {
		  _store[index] = element;
		 _size++;
		  return;
	  }
		  int i;
		  for(i=_size; i > index; i--) {
		  _store[i] = _store[i-1];
		  }
		  _store[i] = element;
		  _size++;

		  
  }

  /**
   * Remove the element that was at the specified index. To fill any "hole" created, the remaining elements should be
   * shifted down from the end. It will returns the element that was removed from the list.
   *
   * @param index Index in the list for the element to be removed.
   * @return The element that was been removed from the list.
   */
  public E remove(int index) {
	   E retVal = get(index);
	   while (index < (_size - 1)) {
		      _store[index] = _store[index+1];
		      index += 1;
		    }
		    _size -= 1;
		    _store[_size] = null;
	    return retVal;
  }
  
  /**
   * Retrieve the element that was at the specified index. This will not change the elements in any way.
   *
   * @param index Index in the list for the element to be retrieved.
   * @return The element at the specified index
   */
  public E get(int index) {
	   if (index >= _size) {
		      throw new IndexOutOfBoundsException();
		    }
		    return _store[index];
  }
}
