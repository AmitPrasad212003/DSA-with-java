import java.util.*;
public class ArrayCC{

    public static void update(int marks[]){
        for(int i=0; i<marks.length; i++){
            marks[i] = marks[i] + 1;
        }
    }

    //Linear Search 
    public static int linearSearch(int number[],int key){
        
        for(int i=0; i<number.length; i++){
            if(number[i] == key){
                return i;
            }
        }

        return -1;
    }
    
    //Largest  Number

    public static int GetLargest(int number[]){

        int largest = Integer.MIN_VALUE; // -infinity
        int smallest = Integer.MAX_VALUE; // +infinity

        for(int i=0; i<number.length; i++){
            if(largest < number[i]){
                largest = number[i];
            }
            if(smallest > number[i]){
                smallest = number[i];
            }
        }
        System.out.println("Smallest value is : "+ smallest);
        return largest;
    }
    // Binary Search

    public static int binarySearch(int number[], int key){
        int start= 0 , end = number.length -1;

        while(start <= end){

            int mid = (start + end) /2;

            if(number[mid] == key){
                return mid;
            }
            if(number[mid] < key){
                start = mid + 1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }


    public static void reverse(int number[]){
        int first = 0, last = number.length -1;

        while(first < last){
            //swap
            int temp = number[last];
            number[last] = number[first];
            number[first] = temp;

            first ++;
            last --;
        }
    }


    public static void printPairs(int number[]){
        int tp =0;
        for(int i= 0; i<number.length; i++){
            int curr = number[i];
            for(int j=i+1; j<number.length; j++){
                System.out.print("("+  curr + ","+ number[j]+") ");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs = " + tp);
    }

    public static void printSubarray(int number[]){
        int ts =0;
        for(int i=0; i<number.length; i++){
            int start = i;
            for(int j=i; j<number.length; j++){
                int end = j;
                for(int k=start; k<=end; k++){
                    System.out.print(number[k]+" ");
                }
                ts++;
                System.out.println();
            }
          System.out.println();
        }
    System.out.println("Total Subarray : "+ ts);

    }

  public static void printSubarray_sum(int number[]){
        int ts =0;
        int sum =0;
        for(int i=0; i<number.length; i++){
            int start = i;
            for(int j=i; j<number.length; j++){
                int end = j;
                for(int k=start; k<=end; k++){
                     sum = sum + number[k];
                    System.out.print(number[k]+" ");
                }
                ts++;
                System.out.println();
                System.out.println("Sum of Subarray : "+ sum);
                sum =0 ;

            }
          System.out.println();
        }
    System.out.println("Total Subarray : "+ ts);

    }

/// wort case time complexcite O(n^3)
// public static void print_MaxSum_Subarray(int number[]){
//         int currSum =0;
//         int maxSum = Integer.MIN_VALUE;

//         for(int i=0; i<number.length; i++){
//             int start = i;
//             for(int j=i; j<number.length; j++){
//                 int end = j;
//                 currSum =0;
//                 for(int k=start; k<=end; k++){
//                     currSum += number[k];
//                 }
//                 System.out.println(currSum);
//                 if(maxSum < currSum){
//                     maxSum = currSum;
//                 }
//             }
//           System.out.println();
//         }
//     System.out.println("Maximum sum of Subarray : "+ maxSum);

//     }

// best apporach to find  maxSum of SubArray which is known as Prefix Sum;
public static void Prefix_MaxSum_Subarray(int number[]){
        int currSum =0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[number.length];

        prefix[0] = number[0];
        // calculate prefix array
        for(int i=1; i<prefix.length; i++){
            prefix[i] = prefix[i-1] + number[i];
        }

        for(int i=0; i<number.length; i++){
            int start = i;
            for(int j=i; j<number.length; j++){
                int end = j;

                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
                
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
          System.out.println();
        }
    System.out.println("Maximum sum of Subarray : "+ maxSum);

    }


public static void kandanes(int number[]){
    int ms = Integer.MIN_VALUE;
    int cs = 0;

    for(int i=0; i<number.length; i++){
        cs = cs+ number[i];
        if(cs < 0){
            cs =0;
        }
        ms = Math.max(cs , ms);
    }
    System.out.println("Our max subarray sum is : "+ ms);
}




    public static void main(String arg[]){
        // creating an Array
        // int marks[] = new int[100];
        // Scanner sc =  new Scanner(System.in);

        // System.out.println("Enter the number at 0 : ");
        // marks[0] = sc.nextInt();
        // System.out.println("Enter the number at 1 : ");
        // marks[1] = sc.nextInt();
        // System.out.println("Enter the number at 2 : ");
        // marks[2] = sc.nextInt();

        // System.out.println("Phy : "+ marks[0]);
        // System.out.println("Chem : "+ marks[1]);
        // System.out.println("Maths : "+ marks[2]);
        
        // System.out.println("Length of Array  : "+ marks.length);


        // int marks[] = {97,98,99};

        // pass by  refference  calling Example;

        // update(marks);

        // // print our marks

        // for(int i=0 ; i<marks.length; i++){
        //     System.out.print(marks[i] + " ");
        // }
        // System.out.println();


// Linear Search
    // int number[] = {2,3,4,5,6,10,11,12,34,46,57};
    // int key = 10;

    // int index = linearSearch(number, key);
    // if(index == -1){
    //     System.out.println("Not Found");
    // }else{
    //     System.out.println("key is at index : "+ index);

    // }

//Largest Number.

    // int number[] = {1,33,45,56,34,12};

    // System.out.println("Largest Number : "+ GetLargest(number));
// // Binary Search
//     int number[]= {2,3,5,45,55,123,445,523};
//     int key =123;

//     System.out.println("index for key is : "+ binarySearch(number, key));

// Reverse an Array 
    // int number[] = {2,3,4,5,6,7,8,9,10};

    // reverse(number);
    
    // for(int i =0; i< number.length ; i++){
    //     System.out.print( number[i]+ " ");
    // }

// int number[] = {2,4,6,8,10};

// printPairs(number);

// int number[] = {2,4,6,8,10};

// printSubarray(number);
// printSubarray_sum(number);
// print_MaxSum_Subarray(number);

// int number1[] = {1,-2,6,-1,3};
// print_MaxSum_Subarray(number1);
// int number1[] = {1,-2,6,-1,3};
// Prefix_MaxSum_Subarray(number1); 

// kandanes(number1);












    }
}