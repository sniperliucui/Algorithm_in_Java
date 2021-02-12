package Ch1;

public class Euclidean {
    /**
     * @param p lager number
     * @param q smaller number
     * @return euclidean number of p and q
     */
    public static int gcd(int p, int q) {
        System.out.printf("p=%d\tq=%d\n", p, q);
        if (q == 0) return p;
        int r = p % q;
        // System.out.printf("p=%d\tq=%d\tr=%d\n", p, q, r);

        return gcd(q, r);
    }

    /**
     *
     * @param args insta
     */
    public static void main(String[] args) {
        int res = gcd(1234567, 1111111);
        System.out.println("\n=========== 执行结果为 ===========");
        System.out.println(res);
    }
}

