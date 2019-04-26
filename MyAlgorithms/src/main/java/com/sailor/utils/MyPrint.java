package com.sailor.utils;

public class MyPrint {
    /**
     * 打印数数组
     *
     * @param array
     */
    public static void PrintArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
