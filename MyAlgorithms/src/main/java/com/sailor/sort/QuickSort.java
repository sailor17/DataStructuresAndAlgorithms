package com.sailor.sort;

import com.sailor.utils.MyPrint;

/**
 * 快速排序
 * 基本思想是：通过一趟排序将要排序的数据分割成独立的两部分，
 * 其中一部分的所有数据都比另外一部分的所有数据都要小，
 * 然后再按此方法对这两部分数据分别进行快速排序，整个排序过程可以递归进行，
 * 以此达到整个数据变成有序序列。
 *
 * @ClassName：QuickSort
 * @Author：自娱自乐
 * @Date：2019年3月14日下午1:03:46
 */
public class QuickSort {
    public static void quickSort(int[] array, int left, int right) {
        int i = left; // 左指针
        int j = right; // 右指针
        int base = array[left];  // 记录基
        if (left >= right) // 左指针大于右指针
            return;
        while (i != j) {
            while (i < j && array[j] >= base)   // 从后往前找小于  base 的数
                j--;
            if (i < j)
                array[i] = array[j];

            while (i < j && array[i] <= base)   // 从前往后找大于 base 的数
                i++;
            if (i < j)
                array[j] = array[i];
        }
        array[i] = base;  // 将base(基) 插入适当的位置
        quickSort(array, left, i - 1);  // 递归左半数组
        quickSort(array, i + 1, right); // 递归右半数组
    }
}
