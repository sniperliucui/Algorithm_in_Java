package Ch1;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class BinarySearch {
    /**
     * This class should not be instantiated
     */
    private BinarySearch() {
    }

    /**
     * Returns the index of the specified key in the specified array.
     *
     * @param a   the array of integers, must be sorted in ascending order
     * @param key the search key
     * @return index of key in array {@code a} if present; {@code - 1} otherwise
     */
    public static int indexOf(int[] a, int key) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) hi = mid - 1;
            if (key > a[mid]) lo = mid + 1;
            else return mid;
        }
        return -1;
    }

    /**
     * Returns the index of the specified key in the specified array.
     * This function is poorly named because it does not give the <em>rank</em>
     * if the array has duplicate keys or if the key is not in the array.
     *
     * @param key the search key
     * @param a   the array of integers, must be sorted in ascending order
     * @return index of key in array {@code a} if present; {@code -1} otherwise
     * @deprecated Replaced by {@link #indexOf(int[], int)}.
     */
    @Deprecated
    public static int rank(int key, int[] a) {
        return indexOf(a, key);
    }

    public static void main(String[] args) {
        // read the integers from a file
        try {
            URL url = new URL("https://algs4.cs.princeton.edu/11model/tinyAllowlist.txt");
            InputStream stream = url.openStream();
            BufferedInputStream buf = new BufferedInputStream(stream);
            //实例化StringBuilder类
            StringBuilder sb = new StringBuilder();
            //循环读取和拼接字符串
            while (true) {
                int data = buf.read();
                if (data == -1) {
                    break;
                } else {
                    sb.append((char) data);
                    // System.out.println(data);
                }
            }
            System.out.println(sb);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
