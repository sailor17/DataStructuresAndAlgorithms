package com.sailor.sort;

import com.sailor.utils.MyPrint;

/**
 * 选择排序
 * 选择排序是这样实现的：
 * 1、设数组内存放了n个待排数字，数组下标从1开始，到n结束。
 * 2、初始化i=1
 * 3、从数组的第i个元素开始到第n个元素，寻找最小的元素。
 * 4、将上一步找到的最小元素和第i位元素交换。
 * 5、i++,直到i=n－1算法结束，否则回到第3步
 * 选择排序的平均时间复杂度也是O(n^2)的。
 *
 * @ClassName：SelectSort
 * @Author：自娱自乐
 * @Date：2019年3月13日上午9:08:20
 */
public class SelectSort {
    /**
     * 选择排序
     *
     * @param array
     */
    public static void Sort(int[] array) {
        int lenth = array.length;
        for (int i = 0; i < lenth; i++) {
            int min = i;
            for (int j = i + 1; j < lenth; j++) {
                if (array[j] < array[min]) { // 升序排序  与最小的比较
                    min = j; // 记录最小下标
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }
}
