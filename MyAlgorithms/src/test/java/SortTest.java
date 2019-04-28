import com.sailor.sort.*;
import com.sailor.utils.GenerateArray;
import com.sailor.utils.MyPrint;
import org.junit.Test;

public class SortTest {
    @Test
    public void bubbleSortTest() {
        System.out.println("bubbleSort测试begin");
        int[] array = {1, 5, 8, 6, 4, 3, 9, 2, 4, 1, 7};
        MyPrint.PrintArray(array);
        // 打印原始数组
        BubbleSort.Sort(array);  // 排序
        MyPrint.PrintArray(array);
        // 打印排序后的数组
        System.out.println("bubbleSort测试end");
    }

    @Test
    public void heapSortTest() {

    }

    @Test
    public void insertSortTest() {
        System.out.println("InsertSort测试begin");
        int[] array = {1, 0, 2, 8, 7, 4, 5, 1, 3, 9, 5, 1, 0, 4};
        MyPrint.PrintArray(array);
        InsertSort.Sort(array);  // 排序
        MyPrint.PrintArray(array);
        System.out.println("InsertSort测试end");
    }

    @Test
    public void mergeSortTest() {
        System.out.println("MergeSort测试begin");
        int[] array = {1, 2, 5, 7, 4, 1, 6, 8, 9, 2, 0, 1, 2, 3, 5};
        MyPrint.PrintArray(array);
        MergeSort.mergeSort(array, 0, array.length - 1);
        MyPrint.PrintArray(array);
        System.out.println("MergeSort测试end");
    }

    @Test
    public void quickSortTest() {
        System.out.println("QuickSort测试begin");
        int[] array = {5, 6, 4, 1, 0, 2, 3, 8, 9, 7, 5, 1};
        MyPrint.PrintArray(array);
        QuickSort.quickSort(array, 0, array.length - 1);
        MyPrint.PrintArray(array);
        System.out.println("QuickSort测试end");
    }

    @Test
    public void selectSortTest() {
        System.out.println("SelectSort测试begin");
        int[] array = {4, 5, 1, 2, 0, 8, 9, 6, 7, 2, 3, 1, 0, 4, 1, 1, 2, 4, 2};
        MyPrint.PrintArray(array);
        long start = System.currentTimeMillis();
        SelectSort.Sort(array); // 选择排序
        long end = System.currentTimeMillis();
        MyPrint.PrintArray(array);
        System.out.println("用时：" + (end - start) + "毫秒");
        System.out.println("SelectSort测试end");
    }

    @Test
    public void shellSortTest() {
        System.out.println("ShellSort测试begin");
        int[] array = GenerateArray.getArray(20, 1, 20);
        MyPrint.PrintArray(array);
        long start = System.currentTimeMillis();
//        ShellSort.shellSort(array);  // 希尔排序
        ShellSort.shellSort2(array);
        long end = System.currentTimeMillis();
        MyPrint.PrintArray(array);
        System.out.println("用时：" + (end - start) + "毫秒");
        System.out.println("ShellSort测试end");
    }
}
