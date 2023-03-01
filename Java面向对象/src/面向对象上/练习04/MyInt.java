package 面向对象上.练习04;
/*
1）声明一个MyInt类，

包含一个int类型的value属性
包含一个方法boolean isNatural()方法，用于判断value属性值是否是自然数。自然数是大于等于0的整数。
包含一个方法int approximateNumberCount()方法，用于返回value属性值的约数个数。在[1, value]之间可以把value整除的整数都是value的约数。
包含一个方法boolean isPrimeNumber()方法，用于判断value属性值是否是素数。如果value值在[1, value]之间只有1和value本身两个约数，并且value是大于1的自然数，那么value就是素数。
包含一个方法int[] getAllPrimeNumber()方法，用于返回value属性值的所有约数。返回[1, value]之间可以把value整除的所有整数。

（2）测试类的main中调用测试
*/

public class MyInt {
    int value;

    boolean isNatural() {
//        if (value >= 0) {
//            return true;
//        }
//        return false;
//    }
        return value >= 0;
    }

    int approximateNumberCount() {
        int count = 0;
        for (int i = 1; i <= value; i++) {
            if (value % i == 0) {
                count++;
            }
        }
        return count;
    }

    boolean isPrimeNumber() {
//        if (value > 1 && approximateNumberCount() == 2) {
//            return true;
//        }
//        return false;
        return value > 1 && approximateNumberCount() == 2;
    }


    int[] getAllPrimeNumber() {
//        int index = 0;
        int[] arrAllPrineNumber = new int[approximateNumberCount()];
        for (int i = 1, index = 0; i <= value; i++) {
            if (value % i == 0) {
                arrAllPrineNumber[index++] = i;
//                index++;
            }
        }
        return arrAllPrineNumber;
    }

}



