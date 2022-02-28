package Lecture_9_Arrays;

public class declare_array {
    public static void main(String[] args) {
        int arr [] =  new int [10];
        arr[0] = 5;
        arr[5]  = 200;
        System.out.println(arr[7]); 

        char[] carray = new char[10];
        double[] darray = new double[10];

        System.out.println(carray[1]);
        System.out.println(darray[1]);

        boolean[] barray = new boolean[10];
        System.out.println(barray[1]);
    }
}
