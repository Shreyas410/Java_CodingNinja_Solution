package Lecture_10_Arrays2;

public class sort012 {
    public static void push0(int[] arr){
        int n=arr.length;
        int c1 =0;
        int c2=0;
        int c3= 0;
        for (int i = 0; i <n; i++) {
            if(arr[i]==0){
                c1 = c1+1;
            }
            else if (arr[i]==1){
                c2= c2+1;
            }
            else if (arr[i]==2){
                c3= c3+1;
            }
            
        }
        for(int j=0;j<c1;j++){
            System.out.print(" 0");
        }
        for(int j=0;j<c2;j++){
            System.out.print(" 1");
        }
        for(int j=0;j<c3;j++){
            System.out.print(" 2");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 0, 1, 2, 0 , 2, 0 ,1};
        push0(arr);
        // printArray(arr);

    }
}
