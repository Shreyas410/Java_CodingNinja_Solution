package Lecture_13_oop;

public class dynamicarray {
    
    int data[];
    int nextElementIndex;
    public dynamicarray(){
        data = new int[5];
        nextElementIndex=0;

    }
    public int size(){
        return nextElementIndex;
        
    }
    public boolean isEmpty(){
        return nextElementIndex==0;

    }
    public int get(int i ){
        if (i>=nextElementIndex) {
            // Throw error 
            return -1;
        }
        return data[i];
    }

   public void add(int elem){
       if(nextElementIndex == data.length){
           doublecapacity();

       }
       data[nextElementIndex] = elem;
       nextElementIndex++;
   }
   private void doublecapacity() {
       int temp[] =  data;
       data = new int [2*temp.length];
       for (int i = 0; i < temp.length; i++) {
           data[i]= temp [i];

       }
   }


public static void main(String[] args) {
    dynamicarray d = new dynamicarray();

    for (int i = 1; i < 100; i++) {
        d.add(100+i);
    }
    System.out.println(d.size());
    System.out.println(d.get(2));
    // d.set(3,123);
    System.out.println(d.get(3));

    // while () {
        
    // }
}
}
