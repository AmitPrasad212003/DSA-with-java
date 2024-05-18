import java.util.*;
public class pt4{

    public static double average (double x, double y, double z){
        return( x + y + z) / 3;
    }

    public static boolean isEven(int num){
        if(num % 2 == 0){
            return true;
        }
        else{
            return false;
        }
    }

// Palibndrome number hai ki nahi 

    // public static boolean isPalindrome(int number){
    //     int palindrome = number;

    //     int reverse = 0;

    //     while(palindrome != 0){
    //         int remainder = palindrome % 10;
    //         reverse = reverse *10 + remainder;
    //         palindrome = palindrome/10;
    //     }
    //     if(number == reverse){
    //         return true;
    //     }
    //     return false ;
    // }

    // Sum of digit of Number 

    public static int SumDigits(int n){
        int sum = 0;

        while(n>0){
            int lastDigit = n % 10;
            sum += lastDigit;
            n/=10;
        }
        return sum;
    }

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);
        //Question 1;
        // System.out.print("Input the First Number : ");
        // double  x = sc.nextDouble();
        // System.out.print("Input the Second Number : ");
        // double  y = sc.nextDouble();
        // System.out.print("Input the Third Number : ");
        // double  z = sc.nextDouble();

        // System.out.print("The Aversge Value is " + average(x,y,z)+ "\n");

        // question 2 ;

        // System.out.println("Enter an Integer : ");
        // int num = sc.nextInt();

        // if(isEven(num)){
        //     System.out.println("Number is Even");
        // }
        // else{
        //     System.out.println("Number is odd");

        // }

// Question 3 

        // System.out.println("Enter an Integer : ");
        // int num = sc.nextInt();

        // if(isPalindrome(num)){
        //     System.out.println("Number : "+ num + " is a Palindrome");
        // }
        // else{
        //     System.out.println("Number : "+ num + " is not a Palindrome");

        // }

// Question 4

        System.out.println("Enter an Integer : ");
        int digits = sc.nextInt();
        System.out.println("The sum is "+ SumDigits(digits));
    }
}