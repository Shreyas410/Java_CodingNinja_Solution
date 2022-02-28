package Lecture_9_Arrays;

import java.util.Scanner;

public class sort01 {
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

    public static void printallpair(int[] arr){

        int n = arr.length;
        int temp0 = 0;
        int temp1=0;
        for(int i = 0 ; i <n-1 ;i++){
           
            for(int j= i+1; j<n ; j++){
                if(arr[i] +arr[j]== 0){
                temp0= temp0+1;
                  
                   
                }
                else if(arr[i] +arr[j]== 1) {
                    temp1= temp1+1;
                }
            
            
            }
            
        }
         for(int m =0 ; m <temp0;m++){
             System.out.print("0");

         }
         for(int o =0 ; o <temp1/3;o++){
            System.out.print("1");

        }

    }

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = takeinput();
        
        printallpair(arr);
        
     }
}
