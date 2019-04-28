import com.sailor.search.BinarySearch;
import com.sailor.sort.ShellSort;
import com.sailor.utils.GenerateArray;
import com.sailor.utils.MyPrint;
import org.junit.Test;

public class SearchTest {
    @Test
    public void binarySearchTest() {
        // 数组
        int[] array = GenerateArray.getArray(20, 1, 30);
        // 排序
        ShellSort.shellSort(array);
        MyPrint.PrintArray(array);
        // 二分查找
        int key = 7;
        int index = BinarySearch.binarySearch(array, key);
        System.out.println("查找数：" + key);
        if (index < 0) {
            System.out.print("不存在：" + index);
        } else {
            System.out.print("存在下标：" + index);
        }
    }
}
