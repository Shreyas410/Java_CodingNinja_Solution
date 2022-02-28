package Lecture_12_array2d;

import java.util.Scanner;

public class basic2d {
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
System.out.println("length of array = "+arr.length);
    }
}