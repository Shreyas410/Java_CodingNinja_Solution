package Lecture_9_Arrays;

import java.util.Scanner;

public class intersectionarray {
    public static int[] takeinput(){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr1 =  new int[n];
        for ( int i = 0 ; i < n ; i++){
            System.out.println("Enter element at " + i + " index");
            arr1[i]= s.nextInt();

        }
        return arr1;
    }
    public static int[] takeinput1(){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr2 =  new int[n];
        for ( int i = 0 ; i < n ; i++){
            System.out.println("Enter element at " + i + " index");
            arr2[i]= s.nextInt();

        }
        return arr2;
    }

    public static void printallpair(int arr1[], int arr2[]){

        int n = arr1.length;
        int n1 = arr2.length;
       
        for(int i = 0 ; i <n-1 ;i++){
           
            for(int j= i+1; j<n1-1 ; j++){
                if(arr1[i]== arr2[j]){
                    System.out.print(arr1[i] + " ");
           
                    arr2[j]=Integer.MAX_VALUE;
                    break;
                  
                   
                }
              

            }
        }
        


    }

     public static void main(String[] args) {
        int [] arr1 = takeinput();
        // printallpair(arr);
        int [] arr2 = takeinput1();
     printallpair(arr1, arr2);
}
}
