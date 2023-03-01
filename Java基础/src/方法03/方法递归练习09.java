package 方法03;

public class 方法递归练习09 {
    public static void main(String[] args) {

        //猴子吃桃子问题，猴子第一天摘下若干个桃子，当即吃了所有桃子的一半，
        // 还不过瘾，又多吃了一个。第二天又将仅剩下的桃子吃掉了一半，又多吃了一个。
        // 以后每天都吃了前一天剩下的一半多一个。到第十天，只剩下一个桃子。
        // 试求第一天共摘了多少桃子？
        for (int n = 10; n >= 1; n--) {
            System.out.println("第" + n + "天桃子数量：" + f(n));
        }
    }

    public static int f(int n) {
        if (n == 10) {
            return 1;
        }
        return (f(n + 1) + 1) * 2;
    }
}

/*
 * 10  a = 1
 * 9   a = a*2+1
 * 8   a = a*2+1
 * ...
 * 2   a = a*2+1
 * 1   a = a*2+1
 * */