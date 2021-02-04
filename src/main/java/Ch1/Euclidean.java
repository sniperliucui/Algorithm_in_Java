package Ch1;

public class Euclidean {
    public static int gcd(int p, int q) {
        if (q == 0) return p;
        int r = p % q;
        System.out.println("===========>>" + r);
        return gcd(q, r);
    }

    public static void main(String[] args) {
        int res = gcd(10, 6);
        System.out.println("=========== 执行结果为 ===========");
        System.out.println(res);
    }
}

