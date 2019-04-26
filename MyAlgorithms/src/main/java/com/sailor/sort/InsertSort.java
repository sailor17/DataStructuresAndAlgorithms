package com.sailor.sort;


import com.sailor.utils.MyPrint;

/**
 * 插入排序  稳定
 * 插入排序是这样实现的：
 * 1、首先新建一个空列表，用于保存已排序的有序数列（我们称之为"有序列表"）。
 * 2、从原数列中取出一个数，将其插入"有序列表"中，使其仍旧保持有序状态。
 * 3、重复2号步骤，直至原数列为空。
 *
 * @ClassName：InsertSort
 * @Author：自娱自乐
 * @Date：2019年3月13日上午8:50:51
 */
public class InsertSort {
    /**
     * 插入排序
     */
    public static void Sort(int[] array) {
        int lenth = array.length;
        for (int i = 1; i < lenth; i++) {
            for (int j = i; j > 0; j--) { // 对部分有序数组进行插入
                if (array[j] < array[j - 1]) { // 升序排序
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                } else {
                    break;
                }
            }
        }
    }
}
