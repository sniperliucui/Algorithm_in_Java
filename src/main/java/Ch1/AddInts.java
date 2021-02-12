package Ch1;

import java.io.IOException;

/**
 * Created by LiuCui on 2020/12/7
 */
public class AddInts {
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(args[0]);
        int sum = 0;
        for(int i=0; i<n; i++){
            int value = System.in.read();
            sum += value;
        }
        System.out.println("Sum is "+sum);
    }
}
