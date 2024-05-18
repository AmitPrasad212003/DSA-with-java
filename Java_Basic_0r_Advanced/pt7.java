import java.util.*;
public class pt7{
    public static void main(String arg[]){

// Question1:Count  how many time slowercase vowels occurred in a String entered by the user.

    // System.out.println("Enter the String : ");
    // String str = new Scanner(System.in).next();
    // int count = 0;

    // for(int i=0; i<str.length(); i++){
    //     char ch = str.charAt(i);
    //     if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch =='u'){
    //         count++;
    //     }
    // }
    // System.out.println("count of vowel is : "+ count);

    // Question 2. Determine if 2 Strings are anagrams of each other.

    // Anagrams : If two strings contain the same characters but in a different order  ,they can be said to be anagrams;

    String str1 = "earth";
    String str2 = "heart";

    // convert String to lowercase. why? so that we don't have to check separately for lower & uppercase.

    str1 = str1.toLowerCase();
    str2 = str2.toLowerCase();

    // First check - if the length are the same

    if(str1.length() == str2.length()){
        //convert strings into char array

        char str1charArray[] = str1.toCharArray();
        char str2charArray[] = str2.toCharArray();

        // sort the char array
        Arrays.sort(str1charArray);
        Arrays.sort(str2charArray);

        // if the sorted char arrays are same or identical then the Strings are Anagram;

        boolean result = Arrays.equals(str1charArray,str2charArray);

        if(result){
            System.out.println(str1 + " and " + str2 + " are anagrams of each other.");
        }
        else{
            System.out.println(str1 + " and " + str2 + " are not anagrams of each other.");
        }
    }
    else{
         System.out.println(str1 + " and " + str2 + " are not anagrams of each other.");
        
    }



    }
}
