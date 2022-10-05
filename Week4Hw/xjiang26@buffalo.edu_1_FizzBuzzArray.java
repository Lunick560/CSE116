package edu.buffalo.cse116;

/**
 * FizzBuzz (<a href="http://c2.com/cgi/wiki?FizzBuzzTest">FizzBuzz</a>) is a well-know, frequently used test that
 * supposedly eliminates job candidates who are not "good" programmers. Were this somehow useful, remotely interesting,
 * or not so well known, it might even work. But since this joke of a problem is still used, you will know the trick to
 * solving it.
 *
 * @author Matthew Hertz
 */
public class FizzBuzzArray {

  /**
   * This returns a String array of the specified length. Each entry will store a String using the specified rules:
   * <ul>
   * <li>For the entry at index 0, store "Empty"</li>
   * <li>For entries whose index is a multiple of 3, store "Fizz"</li>
   * <li>For entries whose index is a multiple of 5, store "Buzz"</li>
   * <li>For entries whose index is a multiple of 3, store "FizzBuzz"</li>
   * <li>For all other entries, store the index as a string (e.g., "2" or "6").</li>
   * </ul>
   *
   * @param numEntries Length of the array to be returned
   * @return Array of the appropriate length with String entries appropriate for a FizzBuzz test.
   */
  public static String[] generateArray(int numEntries) {
	  String[] array = new String[numEntries];
	  	if(array.length>0) {
	  	array[0]="Empty";
	  	
	 
	  for(int i=1;i<array.length;i++) {
		  if(i%15==0) {
			  array[i]="FizzBuzz";
		  }else if(i%3==0) {
			  array[i]="Fizz";
		  }else if(i%5==0) {
			  array[i]="Buzz";

		  }else {
			  array[i]=Integer.toString(i);
		  }
	  }
	  	}
	  return array;
	  	
  }
}
