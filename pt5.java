// To sort an array in DESCENDING order

import java.util.*;
public class pt5{


// Bubble Sort
    public static void BubbleSort_DESCENDING(int arr[]){

        for(int turn =0; turn < arr.length-1; turn++){

            for(int j =0; j<arr.length-1-turn;j++){
                if(arr[j] < arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }




// Selection Sort 
    public static void Selection_Sort_DESCENDING(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            int minPos = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[minPos] <  arr[j]){
                    minPos = j;
                }
            }
            //swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }

// Insertion sort
    public static void insertionSort_DESCENDING(int arr[]){
        for(int i = 1; i<arr.length;i++){
            int curr = arr[i];
            int prev = i-1;
            //finding out the correct pos. to insert 

            while(prev >= 0 && arr[prev]< curr){
                arr[prev +1] = arr[prev];
                prev--;
            }
            arr[prev +1] = curr;
        }
    }







//counting Sort
    public static void countingSort_DESCENDING(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i< arr.length; i++){
            largest = Math.max(largest,arr[i]);
        }

        int count[] = new int[largest+1];
        for(int i=0; i<arr.length;i++){
            count[arr[i]]++;
        }

        // sorting 
        int j=0;
        for(int i=count.length-1; i>= 0; i--){
            while(count[i] > 0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }








    public static void printArr(int arr[]){
        for(int i =0; i<arr.length; i++){
            System.out.println(arr[i]+ " ");
        }
        System.out.println();

    }



    public static void main(String arg[]){

        int arr[] = {3,6,2,1,8,7,4,5,3,1};
        BubbleSort_DESCENDING(arr);
        System.out.println("Bubble Sort : ");
        printArr(arr);
        Selection_Sort_DESCENDING(arr);
        System.out.println("selection Sort : ");
        printArr(arr);
        insertionSort_DESCENDING(arr);
        System.out.println("Insertion Sort : ");
        printArr(arr);
        countingSort_DESCENDING(arr);
        System.out.println("Counting  Sort : ");
        printArr(arr);


    }
}