package Test2;

import java.util.Scanner;

public class question1 {
    public static void print2DArray(int input[][]){
        int n = input.length;
        int m = input[0].length;
        for (int i = 0; i < n; i++) {
             for (int j = 0; j < n-i; j++) {
                for (int j2 = 0; j2 < m; j2++) {
                    System.out.print(input[i][j2] + " ");
                }
                System.out.println();
            }
           
           
        }


        
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
//           for (int i = 0; i < rows; i++) {
//              for (int j = 0; j < cols; j++) {
//                  System.out.print(arr[i][j]+" ");
 
//       }
//       System.out.println();
//  }
//  System.out.println("length of array = "+arr.length);
print2DArray(arr);
     }
}
