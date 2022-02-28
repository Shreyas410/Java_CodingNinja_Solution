package Lecture_7;
import java.util.Scanner;


public class choice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int choice = sc.nextInt();
        int i =0;
        int fans =0 ;
        int mans=1;
        if (choice == 1) {
            for(i=0;i<=n;i++){
                  int answer = i;
                  fans= fans + answer;
            }
            System.out.println(fans);
            
    
        }
        else if (choice == 2){
            for(i=1;i<=n;i++){
                int answer = i;
                mans= mans*answer;
          }
          System.out.println(mans);
    
        }
        else{
            System.out.println("-1");
        }

    }


}
