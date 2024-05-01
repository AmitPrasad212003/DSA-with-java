import java.util.*;
public class Inbuilt_sort{


    public static void printArr(Integer arr[]){
        for(int i =0; i<arr.length; i++){
            System.out.println(arr[i]+ " ");
        }
        System.out.println();

    }

    public static void main(String arg[]){

        Integer arr[] = {5,4,1,3,2};
        // Arrays.sort(arr);
        // printArr(arr);
        // Arrays.sort(arr,0,3);
        // printArr(arr);


// for descending order
        // Arrays.sort(arr,Collections.reverseOrder());
        // printArr(arr);
        Arrays.sort(arr,0,3,Collections.reverseOrder());
        printArr(arr);


    }


}