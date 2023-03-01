package IO流二08.练习06.点名器升级版01;

/*
需求：有一个文件里面存储了班级同学的姓名，每一个姓名占一行，
     要求通过程序实现随机点名器。
          第三次必定是张三同学

思路：
第一次运行时随机的姓名
第二次运行时随机的姓名
第三次运行时随机的姓名

难点：
         如何确定当前是第几次运行程序？

 */


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test {
    public static void main(String[] args) throws IOException {
        Reader wr2 = new FileReader("Java基础高级\\src\\IO流二08\\练习06\\点名器升级版01\\count.txt");
        BufferedReader br2 = new BufferedReader(wr2);
        String countLast = br2.readLine();//必须先读出来在创建非追加打印管道，否则源文件内容会被清空
        PrintStream ps = new PrintStream("Java基础高级\\src\\IO流二08\\练习06\\点名器升级版01\\count.txt");
        ps.println(Integer.valueOf(countLast) + 1);

        Reader wr = new FileReader("Java基础高级\\src\\IO流二08\\练习06\\点名器升级版01\\data.txt");
        BufferedReader br = new BufferedReader(wr);

        List<String> studentNames = new ArrayList<>();

        String line;
        while ((line = br.readLine()) != null) {
            studentNames.add(line);
        }
        System.out.println(studentNames);


        Random r = new Random();
        Reader wr3 = new FileReader("Java基础高级\\src\\IO流二08\\练习06\\点名器升级版01\\count.txt");
        BufferedReader br3 = new BufferedReader(wr3);
        String count = br3.readLine();

        if (count.equals("3")) {
            System.out.println("张三被点到了");
        } else {
            System.out.println(studentNames.get(r.nextInt(studentNames.size())) + "被点到了");
        }

        br.close();
        br2.close();
        br3.close();
        ps.close();

    }
}
