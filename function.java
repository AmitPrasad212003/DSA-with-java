import java.util.*;
public class function{

public static void printHelloWorld(){
    System.out.println("Hello world");
    System.out.println("Hello world");
    System.out.println("Hello world");
    return ;
}

public static int calculatesum(int num1, int num2){// parameter or formal parameters
    int sum1 = num1 + num2;
    return sum1;
}


public static void swap(int a , int b){
    int temp = a;
    a = b;
    b = temp ;

    System.out.println("The Value of a after swaping : "+ a);
    System.out.println("The Value of b after swaping : "+ b);
}

public static int multiply(int a , int b){
    int product = a*b;
    return product;
}
// Factorial of any number
public static int factorial(int n){
    int f =1 ;

    for(int i = 1;i <= n; i++){
        f = f*i;
    }
    return f;
}

public static int binCoeff(int n , int r){
    int fact_n = factorial(n);
    int fact_r = factorial(r);
    int fact_nmr = factorial(n-r);

    int bincoeff = fact_n/(fact_r*fact_nmr);
    return bincoeff;

}

// Example of function overloading 

//function to calculate sum of two number 

public static int sum(int a, int b){
    return a+b;
}
//function to calculate sum of three number 

public static int sum(int a, int b, int c){
    return a+b+c;
}
public static float sum(float a, float b, float c){
    return a+b+c;
}
public static float sum(float a, float b){
    return a+b;
}

 

//  public static boolean isPrime(int n){
    
//     if(n == 2){
//         return true;
//     }

//     for(int i = 2; i<= n-1; i++){
//         if(n%i == 0){
//            return false;
//         }
//     }
//     return true;
//  }

// optimized prime or not prime

 public static boolean isPrime(int n){
    
    if(n == 2){
        return true;
    }

    for(int i = 2; i<= Math.sqrt(n); i++){
        if(n%i == 0){
           return false;
        }
    }
    return true;
 }

 public static void primesInRange(int n){

    for(int i=2; i<= n; i++){
        if(isPrime(i)){
            System.out.print(i + " ");
        }
    }
    System.out.println();
 }

// Binary To Decimal Number 

public static void binToDec(int binNum){
    int mynum = binNum;
    int pow = 0;
    int decNum = 0;

    while(binNum > 0){
        int lastDigit = binNum % 10;
        decNum = decNum + (lastDigit * (int)Math.pow(2,pow));

        pow ++;
        binNum = binNum/10;
    }

    System.out.println("Decimal of "+ mynum + " = "+ decNum);
}

// Decimal to Binary number 

public static void decTOBin(int n){
    int myNum = n;
    int pow = 0;
    int binNum = 0;

    while(n>0){
        int rem = n % 2;
        binNum = binNum + (rem * (int)Math.pow(10,pow));

        pow++;
        n =n/2; 
    }
    System.out.println("Binary form of "+ myNum +" = " + binNum);
}


public static void main(String arg[]){
    Scanner sc = new Scanner(System.in);
    // System.out.print("Enter a : ");
    // int a = sc.nextInt();
    // System.out.print("Enter b : ");
    // int b = sc.nextInt();

    // int sum = calculatesum(a,b); // arguments or actual parameters
    //  System.out.println("Sum is : "+ sum);


// ## example of call by value : 
    // System.out.print("Enter a : ");
    // int a = sc.nextInt();
    // System.out.print("Enter b : ");
    // int b = sc.nextInt();

    // System.out.println("The Value of a Before swaping : "+ a);
    // System.out.println("The Value of b Before swaping : "+ b);
    // swap(a,b);

    // System.out.print("Enter a : ");
    // int a = sc.nextInt();
    // System.out.print("Enter b : ");
    // int b = sc.nextInt();
    // int mul = multiply(a,b);
    // System.out.println("Product of a and b is : "+ mul);


    // System.out.print("Enter n : ");
    // int n = sc.nextInt();
    // int fact = factorial(n);
    // System.out.println("Factorial of "+ n+ " is : "+ fact);

    // System.out.print("Enter n : ");
    // int n = sc.nextInt();
    // System.out.print("Enter r : ");
    // int r = sc.nextInt();

    // int bincoeff = binCoeff(n,r);
    // System.out.println("Binominal Coefficient of "+ n + "C"+r+ " is : "+ bincoeff);

    //  System.out.println(sum(34,45));
    //  System.out.println(sum(34,45,10));
    //  System.out.println(sum(34.45f,45.44f,10));
    //  System.out.println(sum(34,45.5f));

    //  System.out.println(isPrime(2));


    //  primesInRange(17);

    // binToDec(101);
    decTOBin(12);

    }
}