package edu.buffalo.cse116;

/**
 * Instances of this class represent a group containing exactly 4 students. This is a highly fictional example, but
 * should help students get more used to using reference variables.
 *
 * @author Matthew Hertz
 */
public class StudentGroup {
  /** Reference to the Student who is the formally recognized group leader. */
  private Student firstStudent;

  /** Reference to the Student who backs up the group leader and will step in should the leader win the lottery. */
  private Student secondStudent;

  /** Reference to a Student instance who contributes to the group. */
  private Student thirdStudent;

  /** Reference to another Student instance who contributes to the group. */
  private Student fourthStudent;

  /**
   * Creates a new StudentGroup whose members will be aliases for the instances passed in using the parameters.
   *
   * @param first Reference to the Student instance that should be aliased by firstStudent.
   * @param second Reference to the Student instance that should be aliased by secondStudent.
   * @param third Reference to the Student instance that should be aliased by thirdStudent.
   * @param fourth Reference to the Student instance that should be aliased by fourthStudent.
   */
  public StudentGroup(Student first, Student second, Student third, Student fourth) {
    // This code will make firstStudent an alias of first, secondStudent an alias of second, thirdStudent an alias of
    // third, and fourthStudent an alias of fourth
	  firstStudent = first;
	   secondStudent = second;
	      thirdStudent = third;
	      fourthStudent = fourth;
  }

  /**
   * Determines if one or more members of this group could serve as a donor, should the instructor want it.
   *
   * @return True if at least one of firstStudent, secondStudent, thirdStudent, and fourthStudent is a good donor.
   */
  public boolean hasPotentialDonors() {
	    // Return true if firstStudent OR secondStudent OR thirdStudent OR fourthStudent are good donors.

	      if((firstStudent!=null&&firstStudent.goodDonor())||(secondStudent!=null &&secondStudent.goodDonor())
	    ||(thirdStudent!=null && thirdStudent.goodDonor())||(fourthStudent!=null && fourthStudent.goodDonor())){
	          return true;
	      }
	      return false;
	}
  
  /**
   * Updates the name of the student at a specified position within the group. The new name for this student should be
   * the value of updatedName. If groupPosition is 1, then update firstStudent; if groupPosition is 2, then update
   * secondStudent; if groupPosition is 3, then update thirdStudent; otherwise, update fourthStudent.
   *
   * @param groupPosition Position within the group of the student whose name is changing.
   * @param updatedName New name for this student.
   */
  public void changeStudentName(int groupPosition, String updatedName) {
      if(groupPosition==1){
          if(firstStudent!=null)
              firstStudent.changeName(updatedName);  
      }else if(groupPosition==2){
          if(secondStudent!=null)
              secondStudent.changeName(updatedName);  
      }else if(groupPosition==3){
          if(thirdStudent!=null)
              thirdStudent.changeName(updatedName);  
      }else{
          if(fourthStudent!=null)
              fourthStudent.changeName(updatedName);  
      }
}
  
  }
