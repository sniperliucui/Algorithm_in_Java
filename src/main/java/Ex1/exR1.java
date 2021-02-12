package Ex1;

/**
 * Created by LiuCui on 2021/2/12 19:41
 */
public class exR1 {
    public static String exR1(int n){
        if (n <= 0) return "";
        return exR1(n-3)+n+exR1(n-2)+n;
    }
    public static void main(String[] args){
        String ret = exR1(6);
        System.out.println(ret);
    }
}
