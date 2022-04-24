package src.main.java.sort;

import java.util.Arrays;
import java.util.List;

public class BubbleSort {
    /**
     * method1: 一边比较一边向后两两交换，将最大值/最小值冒泡到最后一位。
     * */
    static void bubbleSort1(int[] arr){
        for(int i=0;i<arr.length-1;i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                }
            }
        }
    }
    //通过记录是否swap，来减少for循环的次数！
    static void bubbleSort2(int[] arr){
        boolean swapped=true;
        for(int i=0;i<arr.length-1;i++){
            if(!swapped) break;
            swapped=false;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                    swapped=true;
                }
            }
        }
    }

    static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void main(String[] args) {
        int[] arrs=new int[5];
        arrs[0]=5;
        arrs[1]=1;
        arrs[2]=3;
        arrs[3]=9;
        arrs[4]=4;
        BubbleSort.bubbleSort2(arrs);
        Arrays.stream(arrs).forEach(e->System.out.println(e));

    }
}
