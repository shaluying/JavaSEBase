package IO流二08.练习07.文本替换02;

/*
文本替换几乎是所有文本编辑器都支持的功能,但是要限制在编辑器中才能够执行该功能.
现在需要通过java代码替换指定文本文件中的指定内容的功能
 */

import java.io.*;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入文本文件路径：");
        String filePath = sc.nextLine();
        System.out.println("请输入想要查找的文本：");
        String findStr = sc.nextLine();
        System.out.println("请输入替换后的文本：");
        String replaceStr = sc.nextLine();

        replace(new File(filePath), findStr, replaceStr);

    }

    public static void replace(File file, String findStr, String replaceStr) {
        try (
                Reader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
        ) {
            StringBuilder sb = new StringBuilder();

            char[] chars = new char[1024];//1kb的桶
            int len;
            while ((len = br.read(chars)) != -1) {
                sb.append(chars, 0, len);
            }

            String str = sb.toString().replace(findStr, replaceStr);

            PrintStream ps = new PrintStream(file);
            ps.print(str);

            ps.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
