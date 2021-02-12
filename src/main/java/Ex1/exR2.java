package Ex1;

/**
 * Created by LiuCui on 2021/2/12 20:07
 */
public class exR2 {
    public static String exR2(int n){
        if(n<=0) return "";
        String s = exR2(n-3) +n +exR2(n-2)+n;
        System.out.println(s);
        return s;
    }

    public static void main(String[] args){
        String ret = exR2(6);
        System.out.println(ret);
    }
}
