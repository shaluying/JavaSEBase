package 面向对象上.可变参数05;

public class MathTools {
    /*    public int sum(int[] nums){//(int[] nums)形参
        int he = 0;
        for (int i = 0; i < nums.length; i++) {
            he += nums[i];
        }
        return he;
    }*/

    public int sum(int... nums) {
        int he = 0;
        for (int i = 0; i < nums.length; i++) {
            he += nums[i];
        }
        return he;
    }

}
