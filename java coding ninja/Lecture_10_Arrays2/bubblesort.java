package Lecture_10_Arrays2;

public class bubblesort {
    public static void printArray(int[] arr){
        int n = arr.length;
        for (int i = 0 ; i<n; i++){
             System.out.println("Values in the array:");  
            System.out.println(arr[i]);
        }
    }

    public static void bubbleSort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            //In-1 Rounds
            
            for(int j=0;j<n-1-i;j++){
                
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
    
                }
            }
           
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1,0,2,6,2};
        bubbleSort(arr);
        printArray(arr);

    }
}
