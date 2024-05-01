
import java.util.*;
public class Bit_Manipulation{

    public static void oddorEven(int n){
        int bitMask =1;

        if((n & bitMask) == 0){
            //even number
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd number");
        }
    }
// get ith bit 
    public static int getIthBit(int n, int i){

        int bitMask = 1<< i;
        if((n & bitMask) == 0){
            return 0;
        }
        else{
            return 1;
        }
    }

    // set ith bit 
    public static int setIthBit(int n, int i){
        int bitMask = 1<< i;
        return n | bitMask;
    }

    // clear ith bit 
    public static int clearIthBit(int n, int i){
        int bitMask = ~(1<< i);
        return n & bitMask;
    }

    // UPDATE ith bit
    public static int updateIthBit(int n , int i, int newBit){
        // if(newBit == 0){
        //     return clearIthBit(n,i);
        // }
        // else{
        //     return setIthBit(n,i);
        // }

        n = clearIthBit(n,i);
        int bitMask = newBit<<i;
        return n|bitMask;
    }
    // clear last bit
    public static int clearlastIthBit(int n, int i){
        int bitMask = (~0)<< i;
        return n & bitMask;
    }

    // clear Range of bit;
    public static int clearRangeofBit(int n,int i,int j){
        int a = ((~0) << (j+1));
        int b = (1<<i) - 1;

        int bitMask = a|b;
        return n & bitMask;
    }

    public static boolean isPowerof_2(int n){
        return (n & (n-1)) == 0;
    }


    // question : Count set bit in a Number;
    public static int countSetbits(int n){
        int count = 0;

        while(n>0){
            if((n & 1) != 0){// check our LSb
                count++;
            }
            n = n>>1;
        }
        return count;
    }

    // fast Exponetiation 
    public static int fastExpo(int a, int n){
        int ans = 1;

        while(n>0){
            if((n & 1) != 0){// check our LSb
                ans = ans * a;
            }
            a = a*a;
            n = n>>1;
        }
        return ans;
    }
    public static void main(String arg[]){
        // oddorEven(4);
        // oddorEven(12);
        // oddorEven( 39);

        // System.out.println(getIthBit(10,3));

        // System.out.println(setIthBit(10,2));
        // System.out.println(clearIthBit(10,1));
        // System.out.println(updateIthBit(10,1,0));
        // System.out.println(clearlastIthBit(15,2));

        // System.out.println(clearRangeofBit(10,2,4));
        // System.out.println(isPowerof_2(1024));
        // System.out.println(countSetbits(1024));
        System.out.println(fastExpo(10, 3));

    }
}