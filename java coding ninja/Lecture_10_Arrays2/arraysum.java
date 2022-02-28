package Lecture_10_Arrays2;

import java.util.Scanner;


public class arraysum {
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
    public static void sumOfTwoArrays(int arr1[], int arr2[], int output[]) {
    	int  m = arr1.length;
        int n = arr2.length;
        int q = 0;
        int u = 0;
        for (int i = 0; i < m; i++) {
            double o =Math.pow(10,m-i-1);
            int p = (int) (arr1[i]*o);
            q= q +p;
            // System.out.println(q);
            
        }

        for (int i = 0; i < n; i++) {
            double o =Math.pow(10,n-i-1);
            int p = (int) (arr1[i]*o);
            u= u +p;
            
            
        }
        System.out.println(u+q);
       int  num= u+q;
       
       String number = String.valueOf(num);

       char[] digits1 = number.toCharArray();

       for(int i = 0; i < digits1.length; i++) {
           System.out.print(digits1[i]+ " ");
       }
   
    }
    public static void main(String[] args) {
        int [] arr1 = takeinput();
        int[]  arr2 =takeinput();
        int[] output= new int[arr1.length];
        sumOfTwoArrays(arr1, arr2, output);

    }
}
