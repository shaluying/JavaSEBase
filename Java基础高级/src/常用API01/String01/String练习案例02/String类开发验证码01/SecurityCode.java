package 常用API01.String01.String练习案例02.String类开发验证码01;

/*
随机产生一个5位的验证码，每位可能是数字、大写字母、小写字母。
 */

import java.util.Random;

public class SecurityCode {
    public static void main(String[] args) {
        String data = "aklLSKDFKklajdfLKSDFJLsdfjalLJDjjIOYVn2239328dsjk99";
        Random r = new Random();

        String code = "";
        for (int i = 0; i < 5; i++) {
            code += data.charAt(r.nextInt(data.length()));
        }

        System.out.println(code);


    }
}
