package edu.buffalo.cse116;

/**
 * Class that is used to print out the lyrics to "5 Fat Sausages"
 *
 * @author Matthew Hertz
 */
public class Sausages {
  /**
   * Main program method. This will print out the lyrics.
   *
   * @param args Command-line arguments we will not be using.
   */
  public static void main(String[] args) {
	 for(int x=5;x>=0;x--) {
		 if(x==1) {
			 System.out.println(x +" fat sausage frying in a pan."); 
			 System.out.println("All of a sudden - it went \"BANG\"!");		
			 System.out.println("");
		 }else if(x==0) {
			 System.out.print("No fat sausages frying in a pan.");
			 System.out.println("");
		 }else {
			 System.out.print(x+" fat sausages frying in a pan.\n" + 
				 		"All of a sudden - one went \"BANG\"!");
			 System.out.println("");
		 }
	 }
  }
}
