package Lesson7;

public class ForEachDemo {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

  //      for (int i = 0 ; i <nums.lenght; i++) {
  //          sum += nums[i];
  //      }
        for (int x: nums) {
            sum += x;

        }

        System.out.println("sum is equal to " + sum);
    }
}
