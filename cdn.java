import java.util.*;
public class cdn{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        // int age =11;

        // if(age>= 18){
        //     System.out.println("Adult : Drive , Vote , Sex");
        // }
        // else{
        //     System.out.println("Nuni Hila");
        // }
        // int a=10;
        // int b=5;

        // if(a>= b){
        //     System.out.println("A is greater"+ a);
        // }
        // else{
        //     System.out.println("B is Greater"+b);
        // }

        // System.out.println("Enter the Number : ");
        // int x= sc.nextInt();

        // if((x%2)==0){
        //     System.out.println(x+" : is even ");
        // }
        // else{
        //     System.out.println(x+ " : is odd");
        // }

        //  System.out.println("Enter your income per year : ");
        // int income= sc.nextInt();
        // float tax;

        // if(income < 500000){
        //     tax =0;
        //     System.out.println("Your are come in zero tax Slab");
        // }
        // else if(income>= 500000 && income <100000){
        //     tax= income*0.2f;
        //      System.out.println("Your are come in 20% tax Slab and your tax is : "+tax);
        // }
        // else{
        //     tax= income*0.3f;
        //      System.out.println("Your are come in 30% tax Slab and your tax is : "+tax);

        // }

    // int a=1,b=3,c=6;
    // if(a>=b && a>=c){
    //     System.out.println("A is Greater : "+ a);
    // }
    // else if(b>=a && b>=c){
    //     System.out.println("B is Greater : "+ b);
    // }
    // else{
    //       System.out.println("C is Greater : "+ c);

    // }


    // TERNARY OPERATER

    // int number=4;
    // String var1= ((number%2) ==0)? "Even" : "Odd";
    // System.out.println(var1);

    // Example of TERNARY OPERATER

    // System.out.println("Enter your Number : ");
    // int marks = sc.nextInt();
    // String result = (marks>= 33)? "Pass": "fail";
    // System.out.println(result);

    // System.out.println("Enter your choice : ");
    // int num = sc.nextInt();
    // switch(num){
    //     case 1: System.out.println("Samosa");
    //             break;
    //     case 2: System.out.println("momo");
    //             break;
    //     case 3: System.out.println("chomin");
    //             break;
    //     case 4: System.out.println("laund");
    //             break;
    //     // case 4: System.out.println("madh");
    //     case 5: System.out.println("hardi");
    //             break;
    //     case 6: System.out.println("tea");
    //             break;
    //     case 7: System.out.println("coffe");
    //             break;
    //     default: System.out.println("lar chus");
    //             break;
    // }

    System.out.println("Enter a : ");
    int a= sc.nextInt();
    System.out.println("Enter b : ");
    int b= sc.nextInt();
    System.out.println("Enter operator : ");
    char operater = sc.next().charAt(0);
    switch(operater){
        case '+': System.out.println("Addtion : "+(a+b));
                break;
        case '-': System.out.println("Subtraction : "+ (a-b));
                break;
        case '*': System.out.println("Multiplication : "+ a*b);
                break;
        case '/': System.out.println("Division : "+ a/b);
                break;
        case '%': System.out.println("Reminder : "+ a%b);
                break;
        default: System.out.println("lar chus");
                break;
    }
 


    }
}
