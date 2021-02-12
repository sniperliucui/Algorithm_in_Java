package Ch1;

/**
 * Created by LiuCui on 2020/12/7
 */
public class StdRandom {

    /**
     * 随机返回[a,b)之间的一个double值
     */
    public static double uniform(double a, double b) {
        System.out.println(a + Math.random() * (b - a));
        return a + Math.random() * (b - a);
    }

    /**
     * @param N
     * @return 随机返回 [0..N)之间的一个 int
     */
    public static int uniform_1(int N) {
        System.out.println((int) (Math.random() * N));
        return (int) (Math.random() * N);
    }

    /**
     * 根据离散概率随机返回 int 值，出现i的概率为a[i]
     * @param a 各元素之和等于1
     * @return
     */
    public static int discrete(double[] a) {
        double r = Math.random();
        double sum = 0.0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
            if (sum >= r) return i;
        }
        return -1;
    }

    /**
     * 随机将a[i]与a[i..N]中任意一个元素交换
     * @param a
     */
    public static void shuffle(double[] a){
        int N = a.length;
        for(int i=0;i<N;i++){
            int r = i + uniform_1(N-i);
            double temp = a[i];
            a[i] = a[r];
            a[r] = temp;
        }
        for(double i: a){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        uniform(0.0, 1.0);
        uniform_1(5);
        double[] a = {1.0, 2.0, 5.0, 3.0};
        shuffle(a);
        System.out.println("The square root of 2.0 is "+Math.sqrt(2.0));
    }

}
