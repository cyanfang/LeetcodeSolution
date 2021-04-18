package List;

import java.util.Arrays;

public class ListAndLinkedSol {
    /**
     * ArrayList: 底层是数组
     * linkedList: 底层是双链表
     * **/
    public int nthUglyNumber(int n) {
        //质因数： 是约数并且是质数
        //质数： 除了1和它本身外不再有其他因数的自然数
        int[] number = new int[n];
        int i=0;
        int j=0;
        while(i<=n){
            if(i%2==0||i%3==0 || i%5==0){
                number[j]=i;
                j++;
            }
            i++;
        }
        for(int ii=0;ii<number.length;ii++)
            System.out.println( number[ii]);
        return 0;
       // return number[n];
    }
    public static void main(String[] args) {
        ListAndLinkedSol l=new ListAndLinkedSol();
        //l.nthUglyNumber(10);
        int aa=23;
        System.out.println(aa);
        System.out.println(String.valueOf(aa).charAt(0));






    }
}
