package Lecture_8;

import java.util.Scanner;

public class fibo {
    
	public static boolean checkMember(int n){
				
		/* Your class should be named Solution
		* Don't write main().
	 	* Don't read input, it is passed as function argument.
	 	* Return output and don't print it.
	 	* Taking input and printing output is handled automatically.
		*/
       int b = (5*n*n) - 4; 
       int c = (5*n*n) + 4;
       
       double sq = Math.sqrt(b);
       double sq1 = Math.sqrt(c);
   
       if((sq - Math.floor(sq)) == 0){
           return true;
       }
       if((sq1 - Math.floor(sq)) == 0){
        return true;
    }
    return true;
  

	

}
public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    checkMember(n);

}
}