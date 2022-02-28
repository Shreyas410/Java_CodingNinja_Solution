package Lecture_7;
import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i =0;
       int firstterm= 1;
       int secondterm= 1;
       int nextterm= 1;
        for(i=2;i<n;++i){
           nextterm = firstterm + secondterm;
           firstterm = secondterm;
           secondterm = nextterm;

        }
      System.out.println(nextterm);
    }
    
}
