import java.util.*;
public class DSA_Sheet_4{

// Question 4. Given an integer array nums, return true if any value appears at least twice in the array,
            // and return false if every element is distinct.

// Approach 1 - Brute Froce(O(n^2))
    public static boolean containDuplicate(int nums[]){
        for( int i=0; i<nums.length-1; i++){
            for(int j = i+1; j<nums.length; j++){
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }

// Approach 2 - Using Set (O(n))
    public static boolean containDuplicate_2(int nums[]){

        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<nums.length; i++){
            if(set.contains(nums[i])){
                return true;
            }
            else{
                set.add(nums[i]);
            }
        }
        return false;
    }

    public static void main(String arg[]){

        int nums[] = {1,2,3,1};
        System.out.println("The Array contain Duplicate or Not: "+ containDuplicate(nums));
        System.out.println("The Array contain Duplicate or Not: "+ containDuplicate_2(nums));
        int nums_1[] = {1,2,3,4};
        System.out.println("The Array contain Duplicate or Not: "+ containDuplicate(nums_1));
        System.out.println("The Array contain Duplicate or Not: "+ containDuplicate_2(nums_1));
        int nums_2[] = {1,1,1,3,3,4,3,2,4,2};
        System.out.println("The Array contain Duplicate or Not: "+ containDuplicate(nums_2));
        System.out.println("The Array contain Duplicate or Not: "+ containDuplicate_2(nums_2));


    }
}