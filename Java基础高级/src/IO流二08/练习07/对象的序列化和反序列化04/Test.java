package IO流二08.练习07.对象的序列化和反序列化04;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/*
为了更好的管理班级,需要进行投票选举正班长,副班长,劳动委员,
初期已经选举出了3名候选人,按照这3人近一个月的表现,进行投票,每人每天投一次,
月底根据票数排名,投票最多的为正班长,中间的为副班长,最少的为劳动班长.
利用相关知识,实现一个投票统计工具.每次运行的数据都不能丢失,需要使用IO技术。

演示效果如下：

第一次运行:
-------欢迎为以下人员投票-------
[001]小刘	[002]小王	[003]小赵
请输入您选择的干部的编号(输入end,则结束投票)
001
请输入您选择的干部的编号(输入end,则结束投票)
end
截止到现在,投票结果如下:
小刘: 1票

第二次运行:
-------欢迎为以下人员投票-------
[001]小刘	[002]小王	[003]小赵
请输入您选择的干部的编号(输入end,则结束投票)
002
请输入您选择的干部的编号(输入end,则结束投票)
002
请输入您选择的干部的编号(输入end,则结束投票)
002
请输入您选择的干部的编号(输入end,则结束投票)
end
截止到现在,投票结果如下:
小刘: 1票
小王: 3票

第三次运行
-------欢迎为以下人员投票-------)
[001]小刘	[002]小王	[003]小赵
请输入您选择的干部的编号(输入end,则结束投票)
003
请输入您选择的干部的编号(输入end,则结束投票)
001
请输入您选择的干部的编号(输入end,则结束投票)
001
请输入您选择的干部的编号(输入end,则结束投票)
003
请输入您选择的干部的编号(输入end,则结束投票)
end
截止到现在,投票结果如下:
小刘: 3票
小王: 3票
小赵: 2票

 */
public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Java基础高级\\src\\IO流二08\\练习07\\对象的序列化和反序列化04\\voteInfo"));
        Map<String, Integer> voteInfo = (Map<String, Integer>) ois.readObject();

        Scanner sc = new Scanner(System.in);
        System.out.println("-------欢迎为以下人员投票-------");
        System.out.println("[001]小刘\t[002]小王\t[003]小赵");
        boolean flag = true;
        while (flag) {
            System.out.println("请输入您选择的干部的编号(输入end,则结束投票)");
            String select = sc.nextLine();
            switch (select) {
                case "1":
                    voteInfo.put("[001]小刘", voteInfo.get("[001]小刘") + 1);
                    break;
                case "2":
                    voteInfo.put("[002]小王", voteInfo.get("[002]小王") + 1);
                    break;
                case "3":
                    voteInfo.put("[003]小赵", voteInfo.get("[003]小赵") + 1);
                    break;
                case "end":
                    flag = false;
                    break;
            }
        }

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Java基础高级\\src\\IO流二08\\练习07\\对象的序列化和反序列化04\\voteInfo"));
        oos.writeObject(voteInfo);

        voteInfo.forEach((k, v) -> System.out.println(k + "->" + v));

        ois.close();
        oos.close();
    }

}
