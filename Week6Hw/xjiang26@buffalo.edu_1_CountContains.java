package edu.buffalo.cse116;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/**
 * 
 * @author Lunike
 *The methods you will be writing in CountContains each have two parameters: 
 *the first has/can access the elements to review and the second parameter, an Object named obj.
 * The mehthod count and return the number of times obj appears as an element in the data accessed using the first parameter.
 * Remember that elements and obj can be null. While not required, 
 * a little thought may let you complete one of these methods with only a single line of code.
 * @param <E>
 */
public class CountContains<E> {
  public int countContains(Iterator<E> it, Object obj) {
	
/**	  int size=0;
	  while(it.hasNext()){
		  size++;
		  it.next();
	  }
	  int counts = 0;
	  for(int i=0;i<size;i++){
		
	  }
return counts;
  
 */ 
	List<Object> list= new ArrayList<Object>();
  while(it.hasNext()){
	list.add(it.next());
  
  }
  int counts = Collections.frequency(list, obj);
  return counts;
  
  }

  public int countContains(List<E> al, Object obj) {
	  int counts = Collections.frequency(al, obj);
	return counts;
  }
}
