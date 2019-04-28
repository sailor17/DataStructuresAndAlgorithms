package com.sailor.search;

/**
 * 二分查找
 */
public class BinarySearch {

    public static int binarySearch(int[] array, int key) {
        if (array == null) return -2; // 数组为空
        int low = 0;
        int height = array.length - 1;
        int mid;
        while (low <= height) {
            mid = (height + low) / 2; // 折半
            if (array[mid] == key) return mid;
            else if (key < array[mid]) { // key 在左边
                height = mid - 1;
            } else { // key 在右边
                low = mid + 1;
            }
        }
        return -1; // key 不存在
    }
}
