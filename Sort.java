//import java.util.Arrays;

class Main 
{ 

    // start and end are optional - some sorting algorithms use them, but you can ignore them
    void sort(double arr[], long start, long end) 
    { 
      double biggest = -1, temp;
      int biggestIndex = 0;
      for(int j = 0; j <= arr.length; j++){
        for(int i = 0; i < arr.length-j; i++){
          if(arr[i] > biggest){
            biggest = arr[i];
            biggestIndex = i;
          }
        }
        temp = arr[arr.length-1];
        arr[arr.length-1] = biggest;
        arr[biggestIndex] = temp;
        biggest = -1;
        biggestIndex = 0;
      }
    } 

  
    // Test program 
    public static void main(String args[]) 
    { 
        double arr[] = {10.0, 7.1, 8.6, 9.9, 1.8, 5.0}; 
        System.out.println("original array: "); 
        System.out.println(arr);
        
        // create a sorted version to test.
        double sortedArr[] = arr;
        //Arrays.sort(sortedArr);
        System.out.println("sorted array: "); 
        //System.out.println(Arrays.toString(sortedArr));
        
       
        Main sorter = new Main(); // create a sorter object
        sorter.sort(arr, 0, arr.length); // call the sort function
  
        System.out.println("*** your sorted array: "); 
        //System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++){
          System.out.println(arr[i]);
        }
    } 
} 
