package Lecture_10_Arrays2;

import java.util.Scanner;

public class binarysearch {
    public static int binarySearch(int[] arr, int x) {
    	//Your code goes here
        
        int start = 0;
        int end = arr.length-1;
        int mid = 0;
        
        
        while (start <= end){
            
            mid = (start+end)/2;
            
            if (arr[mid] == x){
                return mid;
            }
            
           if (arr[mid]>x){
                end = mid-1;
            }
            
            if (arr[mid]<x){
                start = mid+1;
            }
                
            
        }
        return -1;
        
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n= s.nextInt();
        int[] arr =  new int[n];
        for ( int i = 0 ; i < n ; i++){
            System.out.println("Enter element at " + i + " index");
            arr[i]= s.nextInt();
     }
     int x= s.nextInt();
    int m =  binarySearch(arr, x);
    System.out.println(m);
    }
}
