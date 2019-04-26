package com.sailor.sort;


import com.sailor.utils.MyPrint;

/**
 * 冒泡排序 稳定
 * 1、从列表的第一个数字到倒数第二个数字，逐个检查：
 * 若某一位上的数字大于他的下一位，则将它与它的下一位交换。
 * 2、重复1号步骤，直至再也不能交换。
 *
 * @ClassName：BubbleSort
 * @Author：自娱自乐
 * @Date：2019年3月13日上午8:35:41
 */
public class BubbleSort {
    /**
     * 冒泡排序
     *
     * @param array
     */
    public static void Sort(int[] array) {
        int lenth = array.length;
        for (int i = 0; i < lenth - 1; i++) {
            for (int j = i + 1; j < lenth; j++) {
                if (array[i] > array[j]) { // 按升序排序
                    int tem = array[i];
                    array[i] = array[j];
                    array[j] = tem;
                }
            }
        }
    }
}
