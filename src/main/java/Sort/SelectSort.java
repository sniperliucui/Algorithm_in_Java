package Sort;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by LiuCui on 2021/3/17 20:47
 */
public class SelectSort {
    public static void main(String[] args){
        // 从键盘输入
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入数组: ");
        String str = scanner.nextLine().toString();
        String[]  arr = str.split(" ");
        int[] nums = new int[arr.length];
        for(int i=0;i< nums.length;i++){
            nums[i] = Integer.parseInt(arr[i]);
        }
        insertSort(nums);
        System.out.println("排序后的数组: ");
        System.out.println(Arrays.toString(nums));
    }

    /**
     * 算法思想：首先在未排序序列中找到最小（大）元素，存放到排序序列的起始位置
     * @param a
     */
    public static void insertSort(int[] a){
        if(a==null || a.length<=0) return;

        for(int i=0;i< a.length;i++){
            int tmp = a[i];
            int flag = i;  // 将当前下标定义为最小值下标
            for(int j=i+1;j<a.length;j++){
                if(a[j] < tmp){ // a[j]<tmp 从小到大排序
                    tmp = a[j];
                    flag = j;  // 如果小于当前最小值的关键字将此关键字的下标值赋给flag
                }
            }
            if(flag!=i){
                a[flag] = a[i];
                a[i] = tmp;
            }
        }
    }
}
