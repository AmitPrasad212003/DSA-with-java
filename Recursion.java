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


    public static void main(String args[]){
        int n = 10;
        printDec(n);

    }
}