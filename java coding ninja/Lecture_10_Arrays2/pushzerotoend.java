package Lecture_10_Arrays2;

public class pushzerotoend {
    // public static void printArray(int[] arr){
    //     int n = arr.length;
    //     for (int i = 0 ; i<n; i++){
    //         // System.out.println("Values in the array:");  
    //         System.out.println(arr[i]);
    //     }
    // }

    public static void push0(int[] arr){
        int n=arr.length;
        int temp =0;
        for (int i = 0; i <n; i++) {
            if(arr[i]==0){
                temp= temp+1;
            }
            else{
                System.out.print(" "+arr[i]);
            }
            
        }
        for(int j=0;j<temp;j++){
            System.out.print(" 0");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 0,3,0,2,0};
        push0(arr);
        // printArray(arr);

    }
}
