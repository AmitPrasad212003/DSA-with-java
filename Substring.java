import java.util.*;
public class Substring{
    // public static String substring(String str, int si , int ei){
    //     String substr = "";
    //     for(int i= si; i<ei; i++){
    //         substr += str.charAt(i);
    //     }
    //     return substr;
    // }

    public static void main(String arg[]){
        // Substing
        String str = "HelloWorld";
        // System.out.println(substring(str,0,4));
        System.out.println(str.substring(0,4));

    String fruit[] = {"apple","mango","banana"};
    
    String largest = fruit[0];
    for(int i=1; i<fruit.length; i++){
        if(largest.compareTo(fruit[i])< 0){
            largest = fruit[i];
        }
    }
    System.out.println(largest);

    }
}