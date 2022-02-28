package Lecture_12_array2d;

import java.util.Scanner;

public class largest_col_or_row {
    public static void findLargest(int mat[][]){
        int row = mat.length;
        int col = mat[0].length;
        int max = Integer.MIN_VALUE ;
        int d = 0;
       for (int j = 0; j < col; j++) {
           int sum= 0;
           for (int i = 0; i < mat.length; i++) {
                sum = sum+mat[i][j];

           } 
           if (sum>max) {
               max= sum;
                d= j ;
           }



           
       }
       int row_sum= Integer.MIN_VALUE;
       int c = 0;
       for (int i = 0; i <mat.length; i++) {
        int count = 0;
        // int row_sum= Integer.MIN_VALUE;
        for (int j = 0; j < mat[i].length; j++) {
            // int count = 0;
            count = count + mat[i][j];
            // System.out.print(count + " ");
        }
        if (count>row_sum) {
            row_sum=count;
             c= i;
        }
    }

    if (row_sum>max) {
        System.out.println("row"+  row_sum + " "+c );
    }
    else{
        System.out.println("column"+ " " +  d + " "+ max);
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
findLargest(mat);
 }
}

