import java.util.*;
public class String_java{

    public static void printletters(String str){
        for(int i=0; i< str.length(); i++){
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }


    public static void main(String arg[]){

        char arr[] = {'a','b','c','d'};
        String str = "abcd";
        String str1 = new String("xyz");
        Scanner sc = new Scanner(System.in);
        String name1 ;
        String name2 ;
        // System.out.println("Enter your name : ");
        // name1 = sc.next();
        // System.out.println("Your name is : "+ name1);
        // System.out.println("Enter your name : ");
        // name2 = sc.nextLine();

        // System.out.println("Your name is : "+ name2);

        // Finding the length of string 

        // String FullName = "Amit Prasad";
        // System.out.println(FullName.length());

        // Concatenation (means adding to string);

        // String firstName = "Qmit";
        // String lastName = "Qrasad";
        // String FullName = firstName + " "+lastName;
        // System.out.println(FullName);

        // printletters(FullName);

        // String s1 = "Tony";
        // String s2 = "Tony";
        // String s3 = new String("Tony");

        // if(s1 == s2){
        //     System.out.println("String are equal");
        // }
        // else{
        //     System.out.println("String are not equal");
        // }
        // if(s1 == s3){
        //     System.out.println("String are equal");
        // }
        // else{
        //     System.out.println("String are not equal");
        // }
        // // check string is equal or not;
        // if(s1.equals(s3)){
        //     System.out.println("String are equal");
        // }
        // else{
        //     System.out.println("String are not equal");
        // }


    StringBuilder sb = new StringBuilder("");

    for(char ch= 'a'; ch <= 'z'; ch++ ){
        sb.append(ch);
    } // abcdefghijklmnop
    System.out.println(sb );
    System.out.println(sb.length() );

    }
}