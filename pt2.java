import java.util.*;
public class javabasic{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        // check number is +ve
    // System.out.println("Enter number : ");
    // int x = sc.nextInt();
    // if(x>0)
    // {
    //     System.out.println(x+": is positive");
    // }
    // else if(x==0){
    //    System.out.println(x+": is zero");
    // }
    // else{
    //     System.out.println(x+": is negative");
    // }

    // check temperature
    // System.out.println("Enter temperature : ");
    // double temp = sc.nextDouble();
    // if(temp>100)
    // {
    //     System.out.println(temp+": you have fever");
    // }
    // else if(temp<100){
    //    System.out.println(temp+": you are normal");
    // }
    // else{
    //     System.out.println(temp+": you are now chil");
    // }
    // week of day
    // System.out.println("Enter your day number : ");
    // int day = sc.nextInt();
    // switch(day){
    //     case 1:System.out.println("Monday");
    //         break;
    //     case 2:System.out.println("Tuesday");
    //         break;
    //     case 3:System.out.println("Wednesday");
    //         break;
    //     case 4:System.out.println("Thursday");
    //         break;
    //     case 5:System.out.println("Friday");
    //         break;
    //     case 6:System.out.println("saturday");
    //         break;
    //     case 7:System.out.println("Sunday");
    //         break;
    //     default:  System.out.println("it not a day in Week");

    // }

    System.out.println("enter the Year : ");
    int year = sc.nextInt();

    boolean x =(year%4)==0;
    boolean y =(year % 100) != 0;
    boolean z= ((year % 100 ==0)&&(year%400 ==0));

    if(x&&(y||z)){
        System.out.println(year+" is a leap year");
    }
    else{
        System.out.println(year+ " is not a leap year");
    }





    }
}