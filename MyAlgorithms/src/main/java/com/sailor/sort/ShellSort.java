package com.sailor.sort;

/**
 * 希尔排序
 * 基本思想：
 * 先将整个待排序的记录序列分割成为若干子序列分别进行直接插入排序，
 * 待整个序列中的记录“基本有序”时，再对全体记录进行依次直接插入排序。
 * <p>
 * 操作：
 * 选择一个增量序列t1，t2，…，tk，其中ti>tj，tk=1；
 * 按增量序列个数k，对序列进行k 趟排序；
 * 每趟排序，根据对应的增量ti，将待排序列分割成若干长度为m 的子序列，
 * 分别对各子表进行直接插入排序。仅增量因子为1 时，整个序列作为一个表来处理，
 * 表长度即为整个序列的长度。
 *
 * @ClassName：ShellSort
 * @Author：自娱自乐
 * @Date：2019年3月13日上午9:22:28
 */
public class ShellSort {
    /**
     * 修改后的插入排序
     *
     * @param array 待排序数组
     * @param start 分组起始下标
     * @param step  分组步长
     */
    private static void insertSort(int[] array, int start, int step) {
        int tmp;
        for (int i = start + step; i < array.length; i += step) {
            for (int j = i - step; j >= start && array[j] > array[j + step]; j -= step) {
                tmp = array[j];
                array[j] = array[j + step];
                array[j + step] = tmp;
            }
        }
    }

    /**
     * 希尔排序
     *
     * @param array 待排序数组
     */
    public static void shellSort(int[] array) {
        for (int step = array.length / 2; step >= 1; step /= 2) { // 外层循环控制希尔步长
            for (int start = 0; start < step; start++) { // 控制希尔分组下标
                insertSort(array, start, step);
            }
        }
    }

    /**
     * 希尔排序
     *
     * @param array 待排序数组
     */
    public static void shellSort2(int[] array) {
        int lenth = array.length;
        int h = 1;
        while (h < lenth / 3) h = 3 * h + 1; // 控制步长
        while (h >= 1) {
            // 将数组变为h 有序
            for (int i = h; i < lenth; i++) {
                // 将第 i 个数 插入到正确的位置
                for (int j = i; j >= h && array[j] < array[j - h]; j -= h) { // array[j] 小于已有的数 array[j-h]
                    // 交换两数
                    int tem = array[j - h];
                    array[j - h] = array[j];
                    array[j] = tem;
                }
            }
            h = h / 3;
        }
    }
}
