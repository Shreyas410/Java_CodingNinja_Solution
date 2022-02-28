package Lecture_4;
import java.util.Scanner;
/**
 * solution
 */
public class solution {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int S= sc.nextInt();
        int E= sc.nextInt();
        int W= sc.nextInt();
        int i=0;
        for(i=S;i<=E;i=i+W){
            // 0int m=(5/9)*(i-32);
            System.out.println(i+"\t"+ ((i-32)*5)/9  );

        }

    }
}