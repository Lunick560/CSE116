package edu.buffalo.cse116;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * A simple iterator class for 2-dimensional arrays. The entries of the array are returned by this iterator by starting
 * at the entry at (row 0, column 0), through each of the entries in row 0, to the entry at (row 1, column 0), through
 * the entries in (row 1, column 1), and so on.
 *
 * @author Matthew Hertz
 * @param <E> Type of elements in the 2-d array over which we are iterating.
 */
public class RowAndColIterator<E> implements Iterator<E> {
  /** The iterator's row position as it works through the array. */
  private int rowCursor;
  /** The iterator's column position as it works through the array. */
  private int colCursor;
  /** The array over which we are iterating. */
  private E[][] arr;

  /**
   * Creates an iterator over the given 2-d array.
   *
   * @param array 2-d array over which we wish to iterate.
   */
  public RowAndColIterator(E[][] array) {
    arr = array;
    rowCursor = 0;
    colCursor = 0;
  }

  /** Returns whether the iterator has a next object. */
  public boolean hasNext() {
	  for (int i = 0; i<arr.length; i++){
		  for (int j = 0; j<arr[i].length; j++){
		  return rowCursor < arr.length ;
		  }
	  }
	  return false;
  }

  /** Returns the next object in the iterator. */
  public E next() {
	
		  if(hasNext()) {
			  E retVal = arr[rowCursor][colCursor];
			  colCursor++;
			  if(colCursor >= arr[rowCursor].length) //end of current row
			  {
			  //set to next row , 0th column
			  rowCursor++;
			  colCursor = 0;

			  
		  }
			  return retVal;
  }
		  throw new NoSuchElementException();
  }
	
  

  public void remove() {
    throw new UnsupportedOperationException();
  }
}
