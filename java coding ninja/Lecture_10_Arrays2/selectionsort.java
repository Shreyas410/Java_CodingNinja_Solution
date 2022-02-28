package Lecture_10_Arrays2;



public class selectionsort {

    public static void printArray(int[] arr){
        int n = arr.length;
        for (int i = 0 ; i<n; i++){
            // System.out.println("Values in the array:");  
            System.out.println(arr[i]);
        }
    }

   public static void selectionSort(int [] arr){
    int n = arr.length;
  for(int i = 0 ; i<n-1 ;i++){
    //   INSERT ELEMENT AT THE iTH Position
    int min = Integer.MAX_VALUE;
    int minIndex= -1;
      for(int j = i ; j<n;j++){

        // Finding the minmum element among j position 
       if(arr[j]<min){
           min = arr[j];
           minIndex= j;
       }
       
      }
// swap min element with th element 
int temp = arr[minIndex];
arr[minIndex]= arr[i];
arr[i]= temp;
  }
   }

    public static void main(String[] args) {
        int arr[] = { 1, 6,4 ,8,0,3};
        selectionSort(arr);
        printArray(arr);

    }
}
