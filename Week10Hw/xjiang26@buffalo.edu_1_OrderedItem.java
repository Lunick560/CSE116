package edu.buffalo.cse116;

import java.util.ArrayList;

public class OrderedItem {

  /**
   * Finds the item at the given ranking (from smallest to largest) in the array list WITHOUT sorting the data. This
   * process is best done using recursion.
   *
   * @param al The ArrayList of unordered data from which we will select the nth largest
   * @param sizeRanking Ranking of the item to be selected. When {@code sizeRanking} is 0, the method needs to return
   *          the smallest item in {@code al}; if {@code sizeRanking} is {@code al.size() - 1}, the largest item is
   *          returned.
   * @return The {@code sizeRanking}-th smallest item from the array list.
   */
  public static int getItemInOrder(ArrayList<Integer> al, int sizeRanking) {
    // You can just assume that sizeRanking is between 0 and al.size()-1 (inclusive)
	  return getItemInOrder(al, 0, al.size()-1, sizeRanking);
  }

  /**
   * Finds the item at the given ranking (from smallest to largest) in the array list WITHOUT sorting the data. It will
   * do this by only considering the ArrayList elements at the indices between left and right. Each recursion halves the
   * number of elements under consideration.
   *
   * @param al ArrayList of unordered data to be examined
   * @param left First index of data which is in consideration
   * @param right Last index of data which is in consideration
   * @param sizeRanking Ranking of the item to be selected. When {@code sizeRanking} is 0, the method needs to return
   *          the smallest item in {@code al}; if {@code sizeRanking} is {@code al.size() - 1}, the largest item is
   *          returned.
   * @return The {@code sizeRanking}-th smallest item from the array list.
   */
  private static int getItemInOrder(ArrayList<Integer> al, int left, int right, int sizeRanking) {
    // You can just assume that sizeRanking is between 0 and al.size()-1 (inclusive)
	  int pivotIndex = partialOrder(al,left,right);
	  if(sizeRanking==pivotIndex) {
		  return al.get(sizeRanking);
	  }else if(sizeRanking<pivotIndex) {
		  return getItemInOrder(al,left,pivotIndex-1,sizeRanking);
	  }else {
		  return getItemInOrder(al,pivotIndex+1,right,sizeRanking); 
	  }
  }

  /**
   * This is a helper method which partially orders the array list into left and right parts. The left part of the array
   * list will contain all of the values smaller than the element initially midway through the range between left and
   * right. The right part of the array list will contain all of the larger elements.
   *
   * @param al ArrayList of data which will be partitioned
   * @param left Leftmost index to be included in the partition
   * @param right Rightmost index to be included in the partition
   * @return The index at which the element originally at pivotIdx ends up.
   */
  private static int partialOrder(ArrayList<Integer> al, int left, int right) {
    int pivotIdx = (left + right) / 2;
    int pivot = al.get(pivotIdx);
    al.set(pivotIdx, al.get(right));
    al.set(right, pivot);
    int storeIdx = left;
    for (int i = left; i < right; i++ ) {
      if (al.get(i) < pivot) {
        int temp = al.get(storeIdx);
        al.set(storeIdx, al.get(i));
        al.set(i, temp);
        storeIdx += 1;
      }
    }
    al.set(right, al.get(storeIdx));
    al.set(storeIdx, pivot);
    return storeIdx;
  }
}
