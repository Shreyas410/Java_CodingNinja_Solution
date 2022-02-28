package Lecture_4;
import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);

        int basic= sc.nextInt();
		String grade= sc.next();
		
		// double hra= 0.2*basic;
		// double da= 0.5*basic;
		// double pf=0.11*basic;
        // int allow; 
		if (grade=="A") {
			int allow=1700;
			double hra= 0.2*basic;
		double da= 0.5*basic;
		double pf=0.11*basic;
        int c= (int) ((int) (basic+hra+da+allow)-pf);
		System.out.println(c);
		}
		else if (grade=="B") {
			int allow=1500;
			double hra= 0.2*basic;
		double da= 0.5*basic;
		double pf=0.11*basic;
        int c= (int) ((int) (basic+hra+da+allow)-pf);
		System.out.println(c);
			
		}
		else if (grade=="C") {
			int allow=1300;
			double hra= 0.2*basic;
		double da= 0.5*basic;
		double pf=0.11*basic;
		int c= (int) ((int) (basic+hra+da+allow)-pf);
		System.out.println(c);
			
		}
		else{
			int allow=1300;
			double hra= 0.2*basic;
		double da= 0.5*basic;
		double pf=0.11*basic;
        int c= (int) ((int) (basic+hra+da+allow)-pf);
		System.out.println(c);
		}
        
        // int c= (int) (basic+hra+da+allow);
        // // int totalsalaray=
		// System.out.println(c);
	}
}
