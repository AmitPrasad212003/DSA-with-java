public class MajorityElement{

    // Approach 1 (time complexity : O(n^2))

    // public static int majorityElement(int nums[]){
    //     int majorityCount = nums.length/2;

    //     for(int i =0; i < nums.length; i++){
    //         int count = 0;

    //         for(int j = 0; j <nums.length; j++){
    //             if(nums[j] == nums[i]){
    //                 count += 1;
    //             }
    //         }

    //         if(count > majorityCount){
    //             return nums[i];
    //         }
    //     }
    //     return -1;
    // }

    // Approach 2 (time complexity : O(n*log n))

    private static int countINRange(int nums[], int num , int lo, int hi){
        int count = 0;
        for(int i = 0 ; i <= hi; i++){
            if(nums[i] == num){
                count++;
            }
        }
        return count;
    }

    private static int majorityElementRec(int nums[], int lo, int hi){
        
        // base case: the only element in an array of size 1 is the majority element.

        if(lo == hi){
            return nums[lo];
        }

        // recurse on left and right halves of this slice.

        int mid = (hi - lo)/2 + lo;

        int left = majorityElementRec(nums , lo , mid);
        int right = majorityElementRec(nums , mid+1, hi);


        // if the two halbes agree on the majority elements , return it.

        if(left == right){
            return left;
        }

        // otherwise, count each element and return the "winner".

        int leftCount = countINRange(nums, left, lo, hi);
        int rightCount = countINRange(nums, right, lo, hi);

        return leftCount > rightCount ? left : right;
    }

    public static int majorityElement(int nums[]){

        return majorityElementRec(nums, 0, nums.length-1);
    }


    public static void main(String[] args){
        int nums[] = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }
}