package edu.buffalo.cse116;

public class Entry<E extends Comparable<E>> {
  /** Tree's element which is stored within this Entry. */
  private E element;

  /** Left child of the current Entry. */
  private Entry<E> left;
  /** Right child of the current Entry. */
  private Entry<E> right;
  /** Parent in the binary tree for the current Entry. */
  private Entry<E> parent;

  /**
   * Creates a new BSTEntry object with the specified element and parent BSTEntry.
   *
   * @param element Data to be held in this BSTEntry.
   * @param parent Parent for this entry within the binary tree.
   */
  public Entry(E element, Entry<E> parent) {
    this.element = element;
    this.parent = parent;
  }

  /**
   * Validates whether the this Entry is ordered legally with respect to its child(ren) AND if any children are also
   * legal. It might still be possible for the BST rooted at this Entry to not be perfectly legal, but this does a good
   * enough job while making certain students understand how BSTs work.
   *
   * @return True if this Entry is a leaf OR (its element is ordered properly with respect to its child(ren) AND its
   *         child(ren) are also valid BST entries; false if this Entry or any descendant is not legally ordered.
   */
  public boolean validBSTEntry() {
	    Entry<E> ans = null;
	       return isvalidBST(this, ans);
  }
  
  public boolean isvalidBST(Entry<E> root, Entry<E> ans){
  if (root!=null){
  if (!isvalidBST(root.left,ans))
  return false;
  if (ans!= null && (root.element).compareTo(ans.element)<0) 
  return false;
  ans = root;
  
  return isvalidBST(root.right,ans);
  }
  return true;
  }

}
