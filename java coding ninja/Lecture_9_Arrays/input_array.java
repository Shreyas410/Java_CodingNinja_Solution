package Lecture_9_Arrays;

import java.util.Scanner;

public class input_array {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr =  new int[n];
        for ( int i = 0 ; i < n ; i++){
            System.out.println("Enter element at " + i + " index");
            arr[i]= s.nextInt();

        }
       for (int i = 0 ; i<n; i++){
         System.out.println("Values in the array:");  
        System.out.println(arr[i]);
        s.close();
       }

    }
}
