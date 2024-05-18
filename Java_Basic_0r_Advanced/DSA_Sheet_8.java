import java.util.*;
public class DSA_Sheet_8{

    public static int maxProfit(int prices[]){

        int buy = prices[0];
        int profit =0;

        for(int i=1; i<prices.length; i++){
            if(buy < prices[i]){
                profit = Math.max(prices[i] - buy, profit);
            }
            else{
                buy = prices[i];
            }
        }
        return profit;
    }


    public static void main(String arg[]){
        int prices[] ={7,6,4,3,1};
        System.out.println("The Total Profit : "+ maxProfit(prices));
    }
}
