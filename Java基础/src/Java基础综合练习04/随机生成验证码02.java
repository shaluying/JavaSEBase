package Java基础综合练习04;

import java.util.Random;

/*
需求：定义方法实现随机产生一个5位的验证码，每位可能是数字、大写字母、小写字母。
 */
public class 随机生成验证码02 {
    public static void main(String[] args) {
        System.out.println("随机的验证码是：" + creatCode(10));
    }

    public static String creatCode(int n) {
        // 1. 定义一个空字符串用于拼接验证码
        String code = "";
        Random r = new Random();
        // 2、定义一个for循环，循环n次，依次生成n个随机字符
        for (int i = 0; i < n; i++) {
            int type = r.nextInt(3);
            switch (type) {
                case 0:
                    // 大写字符（A 65 - Z 65+25）  (0 - 25) + 65
                    char ch = (char) (r.nextInt(26) + 65);
                    code += ch;
                    break;
                case 1:
                    // 小写字符（a 97 - z 97+25）  (0 - 25) + 97
                    char ch1 = (char) (r.nextInt(26) + 97);
                    code += ch1;
                    break;
                case 2:
                    // 数字字符
                    code += r.nextInt(10);
                    break;
            }
        }
        return code;
    }

}
