package com.revature.MultidiamentionArray;

public class MultidiamentionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// with arrays you have iterate through it manually and print each element
		
		/**int[][][] arr = { { { 1, 2 }, { 3, 4 } }, { { 5, 6 }, { 7, 8 } } }; 
		  
        System.out.println("arr[0][0][0] = " + arr[0][0][0]); 
    */
		
	/**	2D array
		 int[][] arr = { { 1, 2 }, { 3, 4 } }; 
		  
        for (int i = 0; i < 2; i++) { 
            for (int j = 0; j < 2; j++) { 
                System.out.print(arr[i][j] + " "); 
            } 
  
            System.out.println(); 
        } */
		
		// with arrays you have iterate through it manually and print each element
		//Print 3D array 
		int[][][] arr = { { { 1, 2 }, { 3, 4 } }, 
						{ { 5, 6 }, { 7, 8 } } }; 

for (int i = 0; i < 2; i++) { 

  for (int j = 0; j < 2; j++) { 

      for (int k = 0; k < 2; k++) { 

          System.out.print(arr[i][j][k] + " "); 
      } 

      System.out.println(); 
  } 
  System.out.println(); 
} 
} 
} 