package com.sailor.sort;


import com.sailor.utils.MyPrint;

/**
 * 二路归并排序主旨是“分解”与“归并”
 * 　分解：
 * 　　1.将一个数组分成两个数组，分别对两个数组进行排序。
 * 　　2.循环第一步，直到划分出来的“小数组”只包含一个元素，只有一个元素的数组默认为已经排好序。
 * 归并：
 * 　　1.将两个有序的数组合并到一个大的数组中。
 * 　　2.从最小的只包含一个元素的数组开始两两合并。此时，合并好的数组也是有序的。
 *
 * @ClassName：MerfingSort
 * @Author：自娱自乐
 * @Date：2019年3月14日下午1:05:54
 */
public class MergeSort {
    /**
     * 分解
     *
     * @param array 数组
     * @param left  左下标
     * @param right 右下标
     */
    public static void mergeSort(int[] array, int left, int right) {
        if (left >= right) // 少于1个数据不排序
            return;
        int mid = (left + right) / 2;
        mergeSort(array, left, mid);
        mergeSort(array, mid + 1, right);
        Merge(array, left, mid, right);
    }

    /**
     * 合并过程中
     *
     * @param array
     * @param left
     * @param mid
     * @param right
     */
    public static void Merge(int[] array, int left, int mid, int right) {
        int[] temp = new int[array.length];
        int leftStart = left;
        int rightStart = mid + 1;
        int tempIndex = left;
        while (leftStart <= mid && rightStart <= right) {  // 二路归并
            if (array[leftStart] <= array[rightStart]) {
                temp[tempIndex++] = array[leftStart++];
            } else {
                temp[tempIndex++] = array[rightStart++];
            }
        }
        while (leftStart <= mid) { // 左路数多
            temp[tempIndex++] = array[leftStart++];
        }
        while (rightStart <= right) { // 右路数多
            temp[tempIndex++] = array[rightStart++];
        }
        while (left <= right) {  //放回原数组
            array[left] = temp[left++];
        }
    }
}
