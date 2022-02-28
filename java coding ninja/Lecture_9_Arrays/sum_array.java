package Lecture_9_Arrays;

import java.util.Scanner;



public class sum_array {

    // private static int[] arr;
    // public static int[] takeinput(){
    //     Scanner s = new Scanner(System.in);
    //     int t = s.nextInt();
    //     for(int j = 1 ; j<=t; j++){
    //     int n = s.nextInt();
    //     int[] arr =  new int[n];
    //     for ( int i = 0 ; i < n ; i++){
    //         System.out.println("Enter element at " + i + " index");
    //         arr[i]= s.nextInt();

    //     }
       
    // }
    //     return arr;
    // }
    public static void print(int[] arr) {
		int sum =0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {  
            sum = sum + arr[i];  
        }
        System.out.println(sum);
        
	}
    public static void main(String[] args) {
       
       
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        int[] arr1 =  new int[10];
        for(int j = 1 ; j<=t; j++){
        int n = s.nextInt();
        arr1 =  new int[n];
        for ( int i = 0 ; i < n ; i++){
            System.out.println("Enter element at " + i + " index");
            arr1[i]= s.nextInt();
        }
      
    
    }
    System.out.print("sum ");
    print(arr1);
}
}
