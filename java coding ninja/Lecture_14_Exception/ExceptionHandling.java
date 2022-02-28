package Lecture_14_Exception;

public class ExceptionHandling {

    public static int divide(int a , int b) {
        // if (b==0) {
        //     throw new ArithmeticException();
        // }
        
        return a/b;
    }
    public static void main(String[] args) {
        try {
        //   int a = 0;
        //   int b = 42/a;
          divide(20, 0);
            
        } catch (ArithmeticException e) {
            System.out.println("In try catch");
        }
        // divide(1, 0);

    }
}
