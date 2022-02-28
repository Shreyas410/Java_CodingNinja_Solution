package Lecture_9_Arrays;

import java.util.Scanner;

public class paairsum {
    public static int[] takeinput(){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        // int x = s.nextInt();
        int[] arr =  new int[n];
        for ( int i = 0 ; i < n ; i++){
            System.out.println("Enter element at " + i + " index");
            arr[i]= s.nextInt();

        }
        return arr;
    }

    public static void printallpair(int[] arr, int x){

        int n = arr.length;
        int temp = 0;
        for(int i = 0 ; i <n-1 ;i++){
           
            for(int j= i+1; j<n ; j++){
                if(arr[i] +arr[j]== x){
                
                   temp = temp + 1;
                   
                }
            

            }
            
        }
        System.out.println("Total pairs with sum " +x+"= "+ temp);

    }

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = takeinput();
         int x = sc.nextInt();
        printallpair(arr, x);
        
     }
}
