package Ch1;

/**
 * Created by LiuCui on 2020/12/7
 */
public class RandomSeq  {
    public static void main(String[] args){
/*        int N = Integer.parseInt(args[0]);
        double lo = Double.parseDouble(args[1]);
        double hi = Double.parseDouble(args[2]);
        for(int i=0;i<N;i++){
            double x = StdRandom.uniform(lo, hi);
            System.out.printf("%.2f", x);
        }*/

        // printf()可以接受两个或者多个参数
        System.out.printf("PI is approximately %.2f\ne is approximately %.2f\n", Math.PI, Math.E);
    }
}
