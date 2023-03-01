package IO流二08.缓冲流01.字符缓冲流03;

/*
需求：把《出师表》的文章顺序进行恢复到一个新文件中。
 */

import java.io.*;
import java.net.CookieHandler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestExr03 {
    public static void main(String[] args) {
        List<String> csbList = new ArrayList<>();


        try (
                Reader fr = new FileReader("Java基础高级\\src\\IO流二08\\缓冲流01\\csb.txt");
                //BufferedWriter特有的一个读取行的API
                BufferedReader br = new BufferedReader(fr);

                Writer fw = new FileWriter("Java基础高级\\src\\IO流二08\\缓冲流01\\newcsb.txt");
                BufferedWriter bw = new BufferedWriter(fw);
        ) {
            String line;
            while ((line = br.readLine()) != null) {
                csbList.add(line);
//                bw.write(line);
//                bw.newLine();
            }

            List<String> size = new ArrayList<>();
            Collections.addAll(size, "一", "二", "三", "四", "五", "陆", "柒", "八", "九", "十", "十一");

            csbList.sort((o1, o2) -> {
                return size.indexOf(o1.substring(0, o1.indexOf("."))) - size.indexOf(o2.substring(0, o2.indexOf(".")));
            });

            for (String s : csbList) {
//                System.out.println(s);
                bw.write(s);
                bw.newLine();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
