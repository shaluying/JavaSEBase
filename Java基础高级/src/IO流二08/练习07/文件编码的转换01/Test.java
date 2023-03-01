package IO流二08.练习07.文件编码的转换01;

/*
很多时候需要GBK编码的文件,但它实际上是UTF-8编码的文件,
就需要把GBK编码的文件转换为UTF-8编码的文件.很多时候需要UTF-8编码的文件,
但它实际上是GBK编码的文件,同样需要把UTF-8编码的文件转换为GBK编码的文件.
而java中又没有提供GBK编码文件和UTF-8编码文件之间相互转换,
需要借助相关软件完成。定义方法完成GBK编码文件和UTF-8编码文件之间相互转换
 */

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        File file = new File("Java基础高级\\src\\IO流二08\\练习07\\文件编码的转换01\\GBk.txt");
        gbkToUtf8(file);
    }

    public static void gbkToUtf8(File gbkFile) {
        List<String> list = new ArrayList<>();

        try (
                InputStream is = new FileInputStream(gbkFile);
                Reader isr = new InputStreamReader(is, "GBK");
                BufferedReader br = new BufferedReader(isr);
                Writer fw = new FileWriter("Java基础高级\\src\\IO流二08\\练习07\\文件编码的转换01\\GBk2.txt");
//                Writer fw = new FileWriter(gbkFile,true);

                BufferedWriter bw = new BufferedWriter(fw)
        ) {
            String line;
            while ((line = br.readLine()) != null) {
                list.add(line);
            }
            System.out.println(list);
            for (String s : list) {
                bw.write(s);
                bw.newLine();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
