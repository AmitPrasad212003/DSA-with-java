public class Recursion2{
    public static int tilingProblem(int n){// 2 X n (floor size)

        // base case 
        if(n == 0 || n ==1){
            return 1;
        }
        // kaam 
        // vertical choice
        int fnm1 = tilingProblem(n-1);

        // horizontal choice
        int fnm2 = tilingProblem(n-2);

        int totalWays = fnm1 + fnm2;
        return totalWays;

    }

    // Remove Duplicates in string "a" - "z"
    public static void removeDuplicates(String str, int idx , StringBuilder newStr, boolean map[]){
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }
        // kaam
        char currChar = str.charAt(idx);

        if(map[currChar - 'a'] == true){
            // duplicate 
            removeDuplicates(str, idx+1 , newStr, map);
        }
        else{
            map[currChar - 'a'] =true;
            removeDuplicates(str,idx+1,newStr.append(currChar),map);
        }
    }

    // freind PAiring Problem

    public static int freindPairing(int n){

        if(n == 1|| n== 2){
            return n;
        }

        //choice
        //single

        // int fnm1 = freindPairing(n-1);

        // // pair 
        // int fnm2 = freindPairing(n-2);
        // int pairWays = (n-1) * fnm2;

        // // totalways
        // int totalWays = fnm1 + pairWays;
        // return totalWays;

        return freindPairing(n-1) + (n-1) * freindPairing(n-2);
    }


    // Binary String problem donot print consecutive 1
    public static void printBinaryString(int n , int lastPlace, String str){
        
        //base case
        if(n == 0){
            System.out.println(str);
            return;
        }
        //kamm
        printBinaryString(n-1,0, str+"0");
        if(lastPlace == 0){
            printBinaryString(n-1, 1, str+"1");
        }

    }
     // Binary String problem donot print consecutive 0

    public static void printBinary0String(int n , int lastPlace, String str){
        
    //     //base case
    //     if(n == 0){
    //         System.out.println(str);
    //         return;
    //     }
    //     //kamm
    //     printBinaryString(n-1,0, str+"0");
    //     if(lastPlace == 1){
    //         printBinaryString(n-1, 1, str+"1");
    //     }

    // }
    public static void main(String args[]){
        // System.out.println(tilingProblem(3));

        String str = "appnnacollege";
        // removeDuplicates(str,0,new StringBuilder(""), new boolean[26]);

        // System.out.println(freindPairing(3));

        // printBinaryString(2,0,new String(""));
        // printBinary0String(2,0,new String(""));

    }
}
