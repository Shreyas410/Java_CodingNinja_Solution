package Lecture_4;
import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int check= sc.nextInt();
        int i=2;
        // boolean checkno=true;

        while (i<(check)) {
            if(check%i==0){
                System.out.println("composite");
                // checkno=false;

                return;
            }
            i= i+1;

        }
        // if (checkno==true) {
        //     System.out.println("Prime");
        // }
        // else{
        //     System.out.println("Composite");
        // }
       System.out.println("prime");
    }
}
