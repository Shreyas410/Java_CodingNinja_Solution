package Lecture_9_Arrays;

import java.util.Scanner;

public class largest_array {
   
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
    public static int largest(int [] arr){
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i< arr.length ; i++){
            if (arr[i] >max ){
                max= arr[i];

            }
        }
        return max;
    }
public static void main(String[] args) {
    int [] arr = takeinput();
    int largest = largest(arr);
    System.out.println(largest);
}
}
