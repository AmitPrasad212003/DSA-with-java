public class Recursion{

// Print number from n to 1 (Decreasing Order)
    public static void printDec(int n){
        if(n == 1){
            System.out.print(n);
            return;
        }
        System.out.print(" "+n + " ");
        printDec(n-1);
    }
// Print number from n to 1 (increasing Order)
    public static void printInc(int n){
        if(n == 1){
            System.out.print(n);
            return;
        }
        printInc(n-1);
        System.out.print(" "+n + " ");
    }

// Print factorial of a number n.
    public static int factorial(int n){
        if(n == 0){
            return 1;
        }
        // int fnm1 = factorial(n-1);
        int fn = n* factorial(n-1);
        return fn;

    }

    // public static int factorial(int n) {
    //     if (n == 0 || n == 1) {
    //         return 1;
    //     } else {
    //         return n * factorial(n - 1);
    //     }
    // }
    public static int SumofN(int n) {
        if ( n == 1) {
            return 1;
        } else {
            return n + SumofN(n - 1);
        }
    }

// Print nth fibonacci number
    public static int fibonacci(int n){
       
        if(n ==  0 || n == 1){
            return n;
        }
       
        int fn =  fibonacci(n-1) + fibonacci(n-2);
        return fn;
    }

    // Check if a given array is sorted or not.

    public static boolean isSorted(int arr[], int i){
         if(i== arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr,i+1);
    }
// waf to find the first occurence of an element in an array

    public static int firstoccurence(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return firstoccurence(arr,key,i+1);
    }
// waf to find the last occurence of an element in an array

    public static int lastoccurence(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        int isFound = lastoccurence(arr,key,i+1);

        if(isFound == -1 && arr[i] == key){
            return i;
        }
        return isFound;
        
    }

    // public static int power(int x , int n){
    //     if(n== 0){
    //         return 1;
    //     }
    //     // int xnm1 = power(x,n-1);
    //     // int xn = x*xnm1;
    //     // return xn;

    //     return x * power(x,n-1);

    // }
    public static int power_optimized(int x , int n){
        if(n ==0 ){
            return 1;
        }
        int halfPower = power_optimized(x,n/2);
        int halfPowerSq = halfPower * halfPower;
        // n is ood 
        if(n % 2 != 0){
            halfPowerSq = x * halfPowerSq;
        }
        return halfPowerSq;
       
    }

    public static void main(String args[]){
        // int n = 10;
        // printDec(n);
        // System.out.println();
        // printInc(n);
        // System.out.println();
        // System.out.println("Factorial of number is  "+factorial(5));
        // System.out.println("Sum of number is  "+SumofN(5));
        // System.out.println("fibonaci of number is  :"+fibonacci(15));
        // System.out.println("fibonaci of number is  :"+fibonacci(16));
        // System.out.println("fibonaci of number is  :"+fibonacci(62));
        // System.out.println("fibonaci of number is  :"+fibonacci(63));
        // System.out.println("fibonaci of number is  :"+fibonacci(64 ));

        // int arr[] = {1,2,3,4,5};
        // System.out.println(isSorted(arr,0));
        int arr1[] = {8,3,45,6,8,4,3,24,6,43,23,56,76,54,4};
        // System.out.println("Index : "+firstoccurence(arr1, 4,0));
        // System.out.println("Index : "+lastoccurence(arr1, 4,0));

        int x = 2;
        int n =10;
        // System.out.println("Power of x^n : "+ power(x,n));
        System.out.println("Power of x^n : "+ power_optimized(x,n));
    }
}