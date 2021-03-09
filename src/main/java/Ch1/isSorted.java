package Ch1;

/**
 * Created by LiuCui on 2021/2/17 17:02
 */
public class isSorted {
    public static boolean isSorted(String[] a){
        for(int i=1;i<a.length;i++){
            if(a[i-1].compareTo(a[i])>0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        String[] s = new String[] {"e", "b", "c"};
        boolean flag = true;
        flag = isSorted(s);
        System.out.println("String[] a is Sorted : "+flag);
    }
}
