package Lecture_9_Arrays;

import java.util.Scanner;

public class functions_array {
    

    public static int[] takeinput(){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr =  new int[n];
        for ( int i = 0 ; i < n ; i++){
            System.out.println("Enter element at " + i + " index");
            arr[i]= s.nextInt();

        }
        return arr;
    }

   
    public static void printarray(int[] arr){
        int n = arr.length;
        for (int i = 0 ; i<n; i++){
            
            System.out.println("Values in the array:");  
           System.out.println(arr[i]);
        }
    }

    
    public static void main(String[] args) {
        int[] arr = takeinput();
        printarray(arr);
    }
}
