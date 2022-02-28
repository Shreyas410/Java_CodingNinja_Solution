package Lecture_7;
import java.util.Scanner;
public class Ap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i =1;
        // int c= (3*i+2)%4;
        int count = 0;
        // if (c==0){
        //    count = count +1 ; 
        // }

        for (i= 1;i<=n+count;i++){
            if ((3*i+2)%4==0){
                count = count +1 ; 
                // System.out.print(3*i+2+ " ");
            }
            else if ((3*i+2)%4!=0){
               
                System.out.print(3*i+2+ " ");
            }
            
        }
    }
}
