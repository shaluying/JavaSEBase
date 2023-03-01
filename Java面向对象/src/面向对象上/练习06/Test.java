package 面向对象上.练习06;

/*（1）声明方法int min(int... nums)：返回n个整数中的最小值

（2）声明方法int maxApproximate(int... nums)：返回n个整数的最大公约数
*/

public class Test {
    public static void main(String[] args) {
        Test t = new Test();
        System.out.println(t.min(1, 8, 9, 4, 5, 6, 3));
        System.out.println(t.maxApproximate(2, 8, 6, 96, 58));
    }

    int min(int... num) {
        int minNum = num[0];
        for (int i = 1; i < num.length; i++) {
            if (minNum > num[i]) {
                minNum = num[i];
            }
        }
        return minNum;
    }

    int maxApproximate(int... nums) {
        int minNum = min(nums);
        for (int i = minNum; i >= 1; i--) {
            boolean flag = true;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] % i != 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                return minNum;
            }
        }
        return 1;
    }

}
