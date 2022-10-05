package edu.buffalo.cse116;

import java.util.Comparator;

/**
 * This class defines a single public method which performs one be used to sorts an array using selection-sort.
 *
 * @author Matthew Hertz
 * @param <E> Type of data which instances of this class will be sorting.
 */
public class SelectionSort<E> {

  /** Comparator instance we will be using to sort our data. */
  private Comparator<E> comp;

  /**
   * Creates a new instance of this class which will be used to sort members of an array.
   *
   * @param theComp Comparator instance we will be using for our sorting.
   */
  public SelectionSort(Comparator<E> theComp) {
    comp = theComp;
  }

  /**
   * Sorts the smallest {@code selectionNumbers} number in the array using selection sort. While it is unusual to
   * terminate midway through the sorting process, this is useful when an instructor needs to write unit tests which
   * verify students correctly implemented selection sort (and is nearly the same as writing the entire method!).
   *
   * @param x Array whose contents are to be sorted.
   * @param selectionNumbers Specifies the number of items that should be ordered using the selection sort algorithm.
   */
  public void selectionSort(E[] x, int selectionNumbers) {
	/*
	 * public static void selectionSort(int[] x) {
	 *   for (int i = 0; i < x.length-1; i++) {
	 *        int smallest = i;   
	 *         for (int k = i+1; k < x.length; k++) {
	 *               if (x[k] < x[smallest]) {   

      smallest = k;      }    } 
      int temp = x[i];
      x[i] = x[smallest];
      x[smallest] = temp;   }}

	 * */
		int index = 0;
	  for(int i=0;i<selectionNumbers;i++) {  
		  E temp =x[i];
	 System.out.print(i);
		for(int k =i+1; k < x.length;k++) {
		  if(comp.compare(temp,x[k])>0) {		
			temp =x[k];
			 index = k;
			System.out.println(k);
		  }
		 
	  }
	x[index]=x[i];
	x[i]=temp;
	
	
  }
}
}
