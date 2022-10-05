package edu.buffalo.cse116;

/** This class helps students learn recursion by performing a common peasant calculation. */
public class PeasantCalc {
  public static int calculate(int a, int b) {
	  if(a==0) {
		return 0;
	  }
	  
	  else if(a%2==0) {
		 return calculate(a/2,b*2);
			  
		  
	  }else if(a%2==1) {
		  return b+calculate(a/2,b*2);
	  }
	  else {
		  return calculate(a,b);
	  }
	  
		
					//  0 when  a = 0 peasantCalc ( a/2 , b * 2 ) when  ( a mod 2 ) = 0 b + peasantCalc ( a/2 , b * 2 ) when  ( a mod 2 ) = 1. 
		  
	  
  }
}
