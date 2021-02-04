package Ch1;

public class Array {
    public static int findMax(int[] nums){
        int max = nums[0];
        for(int i=0; i< nums.length;++i){
            if(nums[i] > max)  max = nums[i];
        }
        System.out.println("max number of the array is: " + max);
        return max;
    }

    public static double calcAvg(int[] nums){
        double sum = 0.0;
        for(int i=0;i< nums.length;i++){
            sum += nums[i];
        }
        double avg = sum / nums.length;
        System.out.println("average number of the array is: " + avg);
        return avg;
    }

    /**
     * Copy the elements of an array
     * @param nums
     * @return
     */
    public static int[] copyArray(int[] nums){
        int[] a = new int[nums.length];
        for(int i=0;i< nums.length;i++){
            a[i] = nums[i];
        }
        System.out.println("copy of the array is: "+a);
        return a;
    }
    /**
     * Reverse the elements of an array
     * @param nums
     * @return
     */
    public static int[] reverseArray(int[] nums){
        for(int i=0;i< nums.length/2;i++){
            int temp = nums[i];
            nums[i] = nums[nums.length-1-i];
            nums[nums.length-1-i] = temp;
        }
        System.out.println("reverse of the array is: ");
        for(int num:nums)
            System.out.print(num + " ");
        return nums;
    }

    public static void main(String[] args){
        int[] a= {1,2,3,5,8};
        Array.findMax(a);
        Array.calcAvg(a);
        Array.reverseArray(a);
    }
}
