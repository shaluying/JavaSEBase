package File类IO流07.File类01.递归技术03.创建数层文件夹每层数个04;

import java.io.File;

/*
嵌套for循环
性能好
 */

public class Test02 {
    public static void main(String[] args) {
        File file = new File("E:\\test02");

        for (int i = 1; i <= 6; i++) {
            new File(file.getAbsolutePath()+"/"+i).mkdir();
            for (int i2 = 1; i2 <= 6; i2++) {
                new File(file.getAbsolutePath()+"/"+i+"/"+i2).mkdir();
                for (int i3 = 1; i3 <= 6; i3++) {
                    new File(file.getAbsolutePath()+"/"+i+"/"+i2+"/"+i3).mkdir();
                    for (int i4 = 1; i4 <= 6; i4++) {
                        new File(file.getAbsolutePath()+"/"+i+"/"+i2+"/"+i3+"/"+i4).mkdir();
//                        for (int i5 = 1; i5 <= 6; i5++) {
//                            new File(file.getAbsolutePath()+"/"+i+"/"+i2+"/"+i3+"/"+i4+"/"+i5).mkdir();
//                            for (int i6 = 1; i6 <= 6; i6++) {
//                                new File(file.getAbsolutePath()+"/"+i+"/"+i2+"/"+i3+"/"+i4+"/"+i5+"/"+i6).mkdir();
//                            }
//                        }
                    }
                }
            }
        }

    }
}
