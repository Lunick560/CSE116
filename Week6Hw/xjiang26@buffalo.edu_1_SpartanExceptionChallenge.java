package edu.buffalo.cse116;

/**
 * This class was inspired by the TV show "Spartan Ultimate Team Challenge". Actually, it was based upon the show's name (I have
 * never seen the show) and what I read as the local media followed the UB-based team (https://www.buffalo.edu/ubnow/stories/2017/06/mathletes.html)
 * So the story makes no sense, but it sounds like a good excuse for a homework assignment on Exceptions.
 *
 * @author Matthew Hertz
 */
public class SpartanExceptionChallenge {

  /**
   * Method which attempts to complete the preliminary by conquering the Qualifying Course. QualifyingCourse has a
   * single method: {@code runCourse()}. When this method is called, it could throw a checked exception
   * ({@code TimeException}), throw an unchecked exception ({@code RopeClimbException}), or not throw any exception. If
   * an exception is thrown, the method should catch the exception and print "Caught checked exception" or "Caught
   * unchecked exception" (as appropriate). If no exception is thrown, the method should print "No exception thrown"
   *
   * @param exceptionGenerator Class whose method, runCourse(), will be used to help test this Exception Warrior.
   */
  public void preliminaryRound(QualifyingCourse exceptionGenerator) {
	  try {
		  exceptionGenerator.runCourse();
		  
		  System.out.println("No exception thrown");
	  }catch(RopeClimbException wat){
		  System.out.println("Caught unchecked exception");
	  }catch(TimeException  isThisAThing){
		  System.out.println("Caught checked exception");
  }
  }

  /**
   * Method to conquer the course at the grand finale -- throwing exceptions on your own. This has two parameters:
   * throwChecked and throwUnchecked. These determine which &quot;flavor&quot; of exception should be raised. When both
   * parameters are false, the method should not raise any exceptions.
   *
   * @param throwChecked When true, the method should raise a checked exception
   * @param throwUnchecked When true (and throwChecked is false), the method should raise an unchecked exception
   */
  public void grandFinale(boolean throwChecked, boolean throwUnchecked) throws TimeException, RopeClimbException {
	  if(throwChecked== true){
			throw new TimeException();
		}else if(throwUnchecked == true){
			throw new RopeClimbException();
  }
  }
}
