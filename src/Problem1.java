/**
 * projecteuler.net/problem=1
 * Created by Student8 on 10/1/2015.
 */
public class Problem1 {
    public static void main(String[] args) {

        int[] nums = new int[1000];

        int hold5 = 0;
        int hold3 = 0;

        int count = 0;

        for (int i = 0; i < 1000; i++) {
            nums[i] = i + 1;
            //    System.out.println(i);
        }
        for (int i = 0; i < nums.length - 1; i++) {

            hold5 = nums[i] % 5;
            hold3 = nums[i] % 3;
            //  System.out.println(hold3);

            if (hold5 == 0 || hold3 == 0) {
                System.out.println(nums[i]);
                count += nums[i];
            }

        }
        System.out.println(count);

    }
}
