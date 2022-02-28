package Lecture_9_Arrays;

import java.util.Scanner;

public class findduplicate {


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

    public static int printallpair(int[] arr){

        int n = arr.length;
        for(int i = 0 ; i <n-1 ;i++){
           
            for(int j= i+1; j<n ; j++){
                if(arr[i]== arr[j]){
                    System.out.println(arr[i]);

                }
                // else{
                //     System.out.println(arr[i]);
                // }

            }
        }
        return 0;


    }

     public static void main(String[] args) {
        int [] arr = takeinput();
        printallpair(arr);
     }
}
