package File类IO流07.File类01.递归技术03.创建数层文件夹每层数个04;

import java.io.File;

/*
递归
代码简洁
 */

public class Test {

    public static void main(String[] args) {
        creatFile("E:\\test", 2, 2);

    }

    /**
     * 创建文件夹结构
     *
     * @param dir            想要创建文件夹结构的目录
     * @param countOFOneDeep 每层文件夹的个数
     * @param deep           想要创建文件结构的层数
     */
    public static void creatFile(String dir, int countOFOneDeep, int deep) {
        if (new File(dir).exists()) {
            if (deep >= 1) {
                for (int i = 1; i <= countOFOneDeep; i++) {
                    new File(dir + "/" + i).mkdir();
                }
                File[] files = new File(dir).listFiles();
                for (File file : files) {
                    creatFile(file.getAbsolutePath(), countOFOneDeep, deep - 1);
                }
            } else {
                return;
            }

        } else {
            System.out.println(dir + "目录不存在");
        }

    }
}
