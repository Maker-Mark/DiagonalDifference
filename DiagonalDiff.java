import java.util.Random;
import java.util.Scanner;
// import java.util.Math;
public class DiagonalDiff {
  
  public static void main(String[] args) {
    
  Scanner sc = new Scanner(System.in);
  System.out.println("Tell me how large you want the square matrix to be!");
  int yourNum = sc.nextInt();
  
  int[][] matrix = giveMeSquareMatrix(yourNum);
    for(int a = 0; a < matrix.length; a++){
      for(int b = 0;b < matrix.length; b++){
        System.out.print( matrix[a][b]); //printing the values of the array
      }
      System.out.println(); //after going though a full row, add a carrage return to make the array print nicely
    }    
    System.out.print("Diagnal difference is " + diagonalDiff(matrix)); 
  }
  
 public static int diagonalDiff(int[][] m ){
   int diagOrigin = 0, diagCeil = 0, sum = 0, absDiff = 0;
   
   for (int a = 0; a < m.length; a++){
      diagCeil += m[a][a];
      diagOrigin += m[m.length - 1 - a][a];  
      
   }
   return absDiff = Math.abs(diagCeil - diagOrigin);
 }
  
  public static int[][] giveMeSquareMatrix(int n) { 
    Random rd = new Random(); 
    int[][] sqArr = new int[n][n]; // making a n by n two-dimentional array(matrix)
    
    for(int a = 0 ; a < sqArr.length; a++){
      for(int b = 0 ; b < sqArr.length; b++){
        //Setting the "a"th row and "b"th column with the next int from the Random object.
      sqArr[a][b] = rd.nextInt(9) + 1; //will be a number from 1 to 9
      }
    }
    return sqArr;// returns the two-dimensional  array
  } 
                     
}
  