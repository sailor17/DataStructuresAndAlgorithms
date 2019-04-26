package com.sailor.utils;


import org.junit.Test;

public class GenerateArray {
    public static int[] getArray(int length, int min, int max) {
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            int num = (int) ((Math.random() * max) + min); // [min,max] 随机数
            array[i] = num;
        }
        return array;
    }

    @Test
    public void T() {
        MyPrint.PrintArray(getArray(10, 0, 5));
    }
}
