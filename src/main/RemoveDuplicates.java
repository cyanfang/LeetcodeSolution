public class RemoveDuplicates {
/**
 * 26 remove duplicate number from nums[].
 * 题目： 有序数组nums，原地删除重复出现的元素，使每个元素只出现一次，返回删除后数组的新长度。
 * 要求： 不使用额外的数组空间，即必须在原地修改输入数组并使用o（1） 的空间复杂度
 * 解题思路及算法过程： 由于给定的数组nums是有序的，因此对于任意的i<j, 如果num[i]=num[j],则对任意的i<=k<=j,必有nums[i]=nums[k]=nums[j].即相等的元素
 * 在数组中的下标一定是连续的。 利用数组有序的特点，可以通过双指针删除重复的元素。
 * 1。 如果nums的长度=0， 则数组不包含任何元素，因此返回0
 * 2。 如果num是的长度>0, 数组中至少包含一个元素，在删除重读的元素之后也至少剩下一个元素，因此 nums[0] 保持原妆即可，从下标1开始删除重复的元素，
 *      定义2个指针，fast 和slow 分别为快指针和慢指针，快指针表示遍历数组到达的下标位置，慢指针表示下一个不同元素要填入的下标位置，初始值均为1。
 * **/
public int removeDuplicates(int nums[]){
        int length=nums.length;
        if(length==0){
        return 0;
        }
        int fast=1;
        int slow=1;
        while (fast<length){
        if(nums[fast]!=nums[fast-1]){
        nums[slow]=nums[fast];
        ++slow;
        }
        ++fast;
        }
        return slow;
        }

public static void main(String[] args) {
        int nums[]={1,2,3,4,4,5,5,6};
    RemoveDuplicates d=new RemoveDuplicates();
        System.out.println(d.removeDuplicates(nums));
        }

        }
