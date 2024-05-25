public class Find_Permutation{


    public static void findPermutation(String str , String ans){

        //base case 
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }

        //recursion

        for(int i = 0; i<str.length();i++){

            char curr = str.charAt(i);
            // remove c from string;
            //"abcde" => "ab" + "de" = "abde"

            String Newstr = str.substring(0,i) + str.substring(i+1);
            findPermutation(Newstr, ans+curr);
        }
    }

    public static void main(String agrs[]){

        String str = "abc";
        findPermutation(str,"");
    }
}