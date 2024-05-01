import java.util.*;
public class loop{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        //  System.out.println("Enter your number :");
        //  int n = sc.nextInt();
        //  int sum =0;
        //  int counter = 1;
        //  while(counter<= n) {
        //     sum += counter ;
        //     counter ++;
        //  }
        //     System.out.print("sum of "+ n + " is : " + sum);
        // for(int i=1;i<=10;i++){
        //     System.out.println("hello world ");
        // }
        // for(int i=1;i<=4;i++){
        //     System.out.println(" * * * * ");
        // }
        // int line =1;
        // while(line <=4){
        //     System.out.println(" * * * * ");
        //     line ++;
        // }
        
        // print reverse of a number
        // int n= 10899 ;
         
        //  while(n>0){
        //     int lastdigit = n%10;
        //     System.out.print(lastdigit + " ");
        //     n = n/10;
        //  }


        // Reverse the given number
 
        // int n = 10899;
        // int rev =0;
        //  while(n>0){
        //     int lastdigit = n%10;
        //     rev = (rev*10)+ lastdigit;
        //     n=n/10;

        //  }
        //  System.out.print(rev);
    //     System.out.print("Enter the number : ");
    //     int n = sc.nextInt();


    //     if(n == 2){
    //           System.out.println(n +" is prime.");

    //     }
    //     else{
    //     boolean isPrime = true;
    //     for(int i = 2; i<=n-1; i++){
    //         if(n%i == 0){
    //             // n is a multiplr of i (i not equal to 1 or n)
    //             isPrime = false;

    //         }
    //     }

    //     if(isPrime == true){
    //         System.out.println(n +" is prime.");
    //     }
    //     else{
    //         System.out.println(n +" is not a prime.");

    //     }
    //  }
    // ####===========optimized for big number============####     
System.out.print("Enter the number : ");
        int n = sc.nextInt();


        if(n == 2){
              System.out.println(n +" is prime.");

        }
        else{
        boolean isPrime = true;
        for(int i = 2; i<=Math.sqrt(n); i++){
            if(n%i == 0){
                // n is a multiplr of i (i not equal to 1 or n)
                isPrime = false;

            }
        }

        if(isPrime == true){
            System.out.println(n +" is prime.");
        }
        else{
            System.out.println(n +" is not a prime.");

        }
     }

        
}
}