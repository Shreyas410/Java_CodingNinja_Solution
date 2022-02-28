package Lecture_8;

import java.util.Scanner;

public class ftoc {
    
    public static void printFahrenheitTable(int start, int end, int step) {
	    
        int i = 1;
      
        for ( i = start; i<=end ;i+=step  ){
            int ans = (i -32 ) ;  
            System.out.println( i + " "+ ans*5/9);
        // int c = start +step;
        // (°F - 32) × 5/9
        // int ans = (c -32 )* (5/9);
        }


    }  
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        printFahrenheitTable(a, b, c);
    } 
}
