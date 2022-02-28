package Lecture_12_array2d;

import java.util.Scanner;


public class largest_column_sum {
    public static int findLargest(int arr[][]){
       
        int row = arr.length;
        int col = arr[0].length;
        int max = Integer.MIN_VALUE ;
       for (int j = 0; j < col; j++) {
           int sum= 0;
           for (int i = 0; i < arr.length; i++) {
                sum = sum+arr[i][j];

           }
           if (sum>max) {
               max= sum;
           }
           
       }

       
       
       
       
        return max;


    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows"); 
        int rows = sc.nextInt();
        System.out.println("Enter number of cols"); 
        int cols = sc.nextInt();
 
 
          int [] [] arr = new int [rows][cols];
 
          for (int i = 0; i < rows; i++) {
              for (int j = 0; j < cols; j++) {
                 System.out.println("Enter the"+i+"th row  and " +j+"th column"); 
                 arr[i][j]= sc.nextInt();
             }
          }
          for (int i = 0; i < rows; i++) {
             for (int j = 0; j < cols; j++) {
                 System.out.print(arr[i][j]+" ");
 
      }
      System.out.println();
 }
 int c = findLargest(arr);
  System.out.println(c);
     }
}
