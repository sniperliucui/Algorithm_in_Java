package Ch1;

/**
 * Created by LiuCui on 2021/2/17 16:55
 */
public class isPalindrome {
    /**
     * 判断字符串是否是一条回文
     */
    public static boolean isPalindrome(String s){
        int N = s.length();
        for(int i=0;i<N;i++){
            if(s.charAt(i)!=s.charAt(N-1-i))
                return false;
        }
        return true;
    }
    public static void main(String[] args){
        String s = "abbbbac";
        boolean flag = true;
        flag = isPalindrome(s);
        System.out.println(s+" is Palindrome : "+flag);
    }
}
