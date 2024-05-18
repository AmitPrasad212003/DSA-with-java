
import java.util.*;
public class String_Compression{

    // public static String compress(String str){
    //     String newStr = "";

    //     for(int i=0; i<str.length(); i++){
    //         Integer count = 1;

    //         while(i< str.length()-1 && str.charAt(i) == str.charAt(i+1)){
    //             count++;
    //             i++;
    //         }
    //         newStr += str.charAt(i);
    //         if(count > 1){
    //             newStr += count.toString();
    //         }
    //     }
    //     return newStr;
    // }

    // strinBulider 
    public static String compress(String str){
        StringBuilder newStr = new StringBuilder("");

        for(int i=0; i<str.length(); i++){
            Integer count = 1;

            while(i< str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            newStr.append(str.charAt(i));
            if(count > 1){
                newStr.append(count.toString());
            }
        }
        return newStr.toString();
    }
    public static void main(String arg[]){

        String str = "aaabbcccdd";
        System.out.println("The compressed string : "+ compress(str));
    
    }
}
