package Lecture_12_array2d;

import java.util.Scanner;

public class print_like_awave {

    public static void wavePrint(int mat[][]){
        int row = mat.length;
        int col = mat[0].length;
        for (int j = 0; j < col; j++) {
            // int sum= 0;
            for (int i = 0; i < row; i++) {
                //  sum = sum+arr[i][j];
                System.out.print(mat[i][j]);
 
            }
            // if (sum>max) {
            //     max= sum;
            // }
            
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows"); 
        int rows = sc.nextInt();
        System.out.println("Enter number of cols"); 
        int cols = sc.nextInt();
    
    
          int [] [] mat = new int [rows][cols];
    
          for (int i = 0; i < rows; i++) {
              for (int j = 0; j < cols; j++) {
                 System.out.println("Enter the"+i+"th row  and " +j+"th column"); 
                 mat[i][j]= sc.nextInt();
             }
          }
          for (int i = 0; i < rows; i++) {
             for (int j = 0; j < cols; j++) {
                 System.out.print(mat[i][j]+" ");
    
      }
      System.out.println();
    }
   wavePrint(mat);
     }
}
