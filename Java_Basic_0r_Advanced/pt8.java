import java.util.*;
public class pt8{
    public static void main(String arg[]){

    //  Question 1 :What is the value of x^x for any valueof x?

    // Solution 1: The value of x^x = 0.Think about it,xor gives 0 when the bits are the same.
    // If we compare the same number to itself , the bits will always be the same.
    //  So, the answer of x^x will always be 0.

    // Question 2 :Swap two numbers without using any third variable.
    // int x =3, y=4;

    // System.out.println("Before swap : x = "+ x + " and y = "+ y);

    // // swap using xor

    // x = x ^ y;
    // y = x ^ y;
    // x = x ^ y;

    // System.out.println("After swap : x = "+ x + " and y = "+ y);

    // Question 3 :Add 1 to an integer using Bit Manipulation

    // -x = ~x + 1;
    // -~x = x + 1 (by replacing x by ~x)

    // int x = 6;
    // System.out.println(x + " + " + 1 +" is "+ (-~x));
    //  x = -4;
    // System.out.println(x + " + " + 1 +" is "+ (-~x));
    //  x = 0;
    // System.out.println(x + " + " + 1 +" is "+ (-~x));

    // Question 4 :This question is based on a trick, pleasedirectly look at the solution.
    // Convert uppercase characters to lowercase using bits.

    // convert uppercase character to lower
    for(char ch = 'A'; ch <= 'Z'; ch++){
        System.out.print((char)(ch | ' ') + " ");
    }
    // 
    
    }
}