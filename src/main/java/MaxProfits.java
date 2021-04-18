package src.main.java;

import java.util.ArrayList;
import java.util.List;

public class MaxProfits {
    /**
     * 给定一组数组prices， 第i个元素prices[i]表示一支给定股票第i天的价格。
     * 假定 每天只能买入这只股票并在未来某一个不同的日子卖掉这只股票。设计算法求出未来可获取的最大利润。
     * 算法思路： 动态规划
     * **/
    public int maxProfit(int[] prices){
        int minPrices=Integer.MAX_VALUE;
        int maxProfit=0;
        for (int i = 0; i < prices.length; i++) {
            if(prices[i]<minPrices){
                minPrices=prices[i];
            }else if(prices[i]-minPrices>maxProfit){
                maxProfit=prices[i]-minPrices;
            }
        }
        return maxProfit;

    }

    public static void main(String[] args) {
        int prices[]={1,2,3,3,5,19,20};
        MaxProfits maxProfits=new MaxProfits();
        System.out.println(maxProfits.maxProfit(prices));
    }

}
