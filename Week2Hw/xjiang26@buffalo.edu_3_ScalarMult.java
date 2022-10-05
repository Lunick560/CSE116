package edu.buffalo.cse116;

/**
 * Class which contains a method which takes in a 2-dimensional array and a scalar value and returns their product.
 *
 * @author Matthew Hertz
 */
public class ScalarMult {
	

 
  public int[][] scalarMult(int[][] matrix, int scalar) {
	  int rows= matrix.length;
	  int cols= matrix[0].length ;
	  int[][] ans =new int[matrix.length][matrix[0].length];
	  for(int i=0;i<matrix.length;i++){
		
	  for(int b=0;b<matrix[0].length;b++){
		  ans[i][b] = matrix[i][b]*scalar;
		
	  }
	 
	  
	  }

	  
  return ans;
  
  }
  }