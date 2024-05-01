import java.util.*;
public class DSA_Sheet_11{

    public static int trap(int height[]){
        int n = height.length;

        int res = 0, l = 0, r = n-1;
        int rMax = height[r], lMax = height[l];

        while(l<r){
            if(lMax < rMax){
                l++;
                lMax = Math.max(lMax, height[l]);
                res += lMax - height[l];
            }
            else{
                r--;
                rMax = Math.max(rMax,height[r]);
                res += rMax - height[r];
            }
        }

        return res;
    }



    public static void main(String arg[]){
        int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        int height_1[] = {4,2,0,3,2,5};
        System.out.println("The total trap rain Water is : "+ trap(height));
        System.out.println("The total trap rain Water is : "+ trap(height_1));
    }
}