package com.sailor.sort;


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
        int length = array.length;
        for (int i = 1; i < length; i++) {
            int tem = array[i];
            int perIndex;
            for (perIndex = i - 1; perIndex >= 0 && array[perIndex] > tem; perIndex--) { // 对部分有序数组进行插入
                array[perIndex + 1] = array[perIndex];
            }
            array[perIndex + 1] = tem;
        }
    }

    public static void Sort2(int[] araay) {
        int length = araay.length;
        for (int i = 1; i < length; i++) {
            int perIndex = i - 1; // 已排序数组的尾指针
            int tem = araay[i]; // 待插入的元素
            while (perIndex >= 0 && araay[perIndex] > tem) {
                araay[perIndex + 1] = araay[perIndex]; // 将已排序的元素往后移
                perIndex--; // 待比较元素下标往前移
            }
            araay[perIndex + 1] = tem; // 将待插入元素 查到目标位置：注意此时的位置下标已经往左偏移一位。
        }
    }
}
