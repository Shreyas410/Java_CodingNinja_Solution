package Lecture_7;

import java.util.Scanner;

public class decimaltobinary {
    public static void main(String[] args) {
	    Scanner in= new Scanner(System.in);
	    int i=1, binary=0, rem;
	    
	    //Enter the decimal number
		// System.out.println("Enter a number");
		int num = in.nextInt();
		
		//Divide by 2 until number reduces to 0
		while(num!=0){
		    rem = num%2;
		    binary += i*rem;    //concatenate remainders in bottom-up manner
		    num = num/2;
		    i=i*10;
		}
		
		//Output the binary number
		System.out.println( binary);
	}
}
